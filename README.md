# Self-education playground
## Tasks regarding Kotlin & Java test tools
* Generate & use API clients
* How to work with a deeply nested element
* Waits and assertions in Selenide
* Validation of proxy elements
* Logging
* Reporting
* Custom annotations
* Reflection
* Downloading & Uploading
* Email processing
* Work with cookies
* Consider Kotlin-related alternatives for JUnit

## Tasks regarding test architecture
* Add an ability to validate elements, which have to be visible all time, without an explicit call
  of assertion for each element separately
* Try to come up with localization

## Choose a domain
Since I want to learn about a complex UI with API, I choose TeamCity.
I will be able to play with Selenide-related features, emails as well as API generation and calling.

## Architecture comments
### Flows
I added the concept of "flow" to hide direct interaction with UI components from the test.
A flow should describe the steps of a user scenario in a readable way.
"Flow" is not page related entity, it is focused on user scenarios (business logic), so it can use several pages as well as part of a single page.

### PageObjects
#### Complex UI elements
Since the UI of the selected system is quite complex, need to split pages into logical parts.
So, PageObject is not the only model of a page, but also it can describe a model of a page's part.
Need to keep consistency between DOM and PageObjects structure, so the child of a complex
PageObject has to be searched in the related DOM node.

#### URLs to pages
We need to be able to use the test system in any environment.
In this case, we will have dynamic hosts, which must be specified in a config and a path to a page that should not depend on where the system is deployed.
The custom annotation @PageUrlPath chains the path and associated page model.

### Localisation
Since some text UI elements can be fully qualified by text only (especially collection items, such as menu items, breadcrumbs, and sidebar items).
I decided to implement localization support to be able to support any new language as soon as needed.
I came up with 3 concepts based on the comments.

#### Concept 1: The system supports only a few languages
If a system only supports a few languages, we can just put the localization of the element into an annotation of a property that contains the element itself.
The annotation should contain the language, the localized text, and information about where the text is stored in the DOM.
This is necessary because we may need to check different text attributes of an element.

#### Conception 2: The system supports many languages
In this case, it can be inconvenient for QA to read PageObjects with numerous annotations for each UI element.
We can use one annotation for the whole PageObject with a path to the file (e.g. JSON) where the localization is stored.
Each inner element needs to have an identifier to help find the localized text in the file.
This approach would be slightly slower than the previous one.
But we can lazily parse the whole file on the first request and store the localization model with a link to the PageObject.
This will save time and we will not have to parse the file every time.

#### Concept 3: Mix
In this case, we still support a few languages, but some of our localized texts are very, very long, and we can mix approaches. Short labels can be stored directly in attributes, and long labels can be moved to a file.
So an attribute for long text elements will store the path to a file with a specific text, or a file with multiple texts and the identification of the specific text.

#### What to choose?
Since TeamCity is only localized in English, localization itself is not required for the current system.
So approach #2 is totally useless here, but since I want to try to do localized tests, and this is not commercial development, but educational, I will use the first one (there are no long texts on the TeamCity UI to use #3).
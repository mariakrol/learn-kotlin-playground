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
"Flow" is not page related entity, it is focused on user scenarios (business logic), so it can use several pages 
as well as part of a single page.

### PageObjects
#### Complex UI elements
Since the UI of the selected system is quite complex, need to split pages into logical parts.
So, PageObject is not the only model of a page, but also it can describe a model of a page's part.
Need to keep consistency between DOM and PageObjects structure, so the child of a complex
PageObject has to be searched in the related DOM node.

#### URLs to pages
We need to be able to use the test system in any environment.
In this case, we will have dynamic hosts, which must be specified in a config and a path to a page that should not 
depend on where the system is deployed. The custom annotation @PageUrlPath chains the path and associated page model.

#### Implicit and explicit checks of elements
**Semi-implicit check**

As TeamCity's UI is very complex, it can be quite inconvenient to check whether elements are available on the page or 
not. The key point is that a large number of elements must be enabled or disabled by default, in addition to external 
conditions. For elements, I implemented the concept of an "implicit" check. In fact, it is partially implicit because 
the method that performs the validation has to be called from within a test. I deliberately did not include a call to 
the method in the constructor, because searching for each element on a page can be quite time-consuming, and is not 
needed for every regular test. So, we can have tests that focus on business logic separately from tests that simply 
check whether elements are available on the UI or not. It will help to keep the completed user scenario green except 
for the wrong state of an element, which is not required for the business logic in this case.
To achieve this semi-implicit check, an element must be provided with an `@ImplicitCheck` annotation.
**For example:**
```Kotlin
@ImplicitCheck(isVisible = true)
private val userNameField = getChild(byId("username"))
```
The check itself can be done by calling of `validateElementsVisibility` extension method for the `UiElementContainer` 
interface implemented by `Page` and `ComplexUiElement`.
The method would iterate properties of passed complex object and assert state of an element.

**Explicit check**
Sometimes we want to check a specific element in a specific conditions. For example, an element would be available only
after login with specific user, or while an operation is in progress.
For that cases we can add explicit methods to check that elements.

### Localization
Since some text UI elements can be fully qualified by text only (especially collection items, such as menu items, 
breadcrumbs, and sidebar items) I decided to implement localization support to be able to adapt tests to any 
new language as soon as needed. I came up with 3 concepts based on the comments.

#### Concept 1: The system supports only a few languages
If a system only supports a few languages, we can just put the localization of the element into an annotation of a 
property that contains the element itself. The annotation should contain the language, the localized text, and 
information about where the text is stored in the DOM. This is necessary because we may need to check different text 
attributes of an element.

#### Conception 2: The system supports many languages
In this case, it can be inconvenient for QA to read PageObjects with numerous annotations for each UI element.
We can use one annotation for the whole PageObject with a path to the file (e.g. JSON) where the localization is stored.
Each inner element needs to have an identifier to help find the localized text in the file.
This approach would be slightly slower than the previous one.
But we can lazily parse the whole file on the first request and store the localization model with a link to the 
PageObject. This will save time, and we will not have to parse the file every time.

#### Concept 3: Mix
In this case, we still support a few languages, but some of our localized texts are very, very long, and we can mix 
approaches. Short labels can be stored directly in annotations, and long labels can be moved to a file.
So an annotation for long text elements will store the path to a file with a specific text, or a file with multiple texts
and the identification of the specific text.

#### What to choose?
Since TeamCity is only localized in English, localization itself is not required for the current system.
So approach #2 is totally useless here, but since I want to try to do localized tests, and this is not commercial 
development, but educational, I will use the first one (there are no long texts on the TeamCity UI to use #3).

#### Implemented localization approach
##### Search by localized text
Most elements in the TeamCity UI have dynamically generated attributes. It can be a problem if the only unique thing 
is a class, and it contains a dynamic postfix (calculated by hash):

``` HTML
<a href="" tabindex="0" class="ring-button-button ProjectCreateSection__button--VX">
  <span class="ring-button-content">
    <span>New project...</span>
  </span>
</a>
```
In this case, the locator (both CSS and XPath) will be quite complex. The name of a button should be stable, but since 
we decided to support localisation, it would be completely wrong to explicitly create a locator based on text. To solve 
the problem, I use the annotation:
```Kotlin 
LocalizedElement(val lang: Language, val domAttribute: TextDomAttribute, val text: String)
```
But a property has no direct access to its annotations, so to create a `SelenideElement` I need to use reflection. The
method, which creates the element based on text, is an extension method for the `UiElementContainer` interface 
implemented by `Page` and `ComplexUiElement`:
```Kotlin
fun UiElementContainer.createElementByLocalizedText(
  selfAnnotationSource: KAnnotatedElement, XPathPattern: String = ""
): SelenideElement
```
It gets the property as `KAnnotatedElement` to get the annotation and the XPath pattern as an optional parameter. Many 
elements on the TeamCity UI contain nested elements with text, so we may want to achieve a button, but will get an 
inner div. To solve this we can use XPath (CSS will not help with inner text).

**Example of usage:**
```Kotlin
@LocalizedElement(Language.En, TextDomAttribute.Text, "New project...")
private val addProjectButton: SelenideElement =
    this.createElementByLocalizedText(this::addProjectButton, ".//a[.//*[text()='%s']]")
```
This produces a lot of boilerplate code, so need to rethink to reduce it.

**TODO:**
- [ ] Rethink initialization by localized text to reduce boilerplate code

##### Semi-implicit check of text
Since many elements which are visible on page all the time can contain text, I want to check it as well as existence. 
So, in case element is equipped with `@LocalizedElement` annotation *and* with `@ImplicitCheck(isVisible = true)` it
would be checked in the extension method `validateTextElements()` of `UiElementContainer`.

### Generating and wrapping API
Kotlin client is generated by using of OpenAPI generator. Generated sources are placed under `build/generated` folder.
* Library for HTTP: OkHttp3
* Library for JSON: jackson
See additional information on a client generation [in the post](https://dev.to/mariakrol/generate-kotlin-client-for-a-complex-web-api-1gff).

**TODO:**
- [ ] Replace OkHttp3 with Ktor


### Email processing
A test interacts with custom abstraction under an SMTP service called `SmtpServiceWrapper`. The abstraction provides a
method to get an email as an instance of `jakarta.mail.internet.MimeMessage`. The wrapper is added to be able to change
SMTP service later without modification of `flows`.
The specific realization of the abstraction which is currently used is `GreenMailService`. It wraps `GreenMailExtension`.

**TODO:**
- [ ] Setup SMTP in TeamCity automatically before a test
- [x] Wrap GreenMail to be able to change the tool 


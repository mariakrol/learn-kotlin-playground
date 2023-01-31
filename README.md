# Self-education playground
## Tasks regarding Kotlin & Java test tools
* Generate & use API clients
* How to work with deep nested element
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
* Add ability to validate elements, which have to be visible all time, without explicit call
of assertion for each element separately
* Try to come up with localization

## Choose domain
Since I want to learn on a complex UI with API, I choose TeamCity.
I will be able to play with Selenide-related features, emails as well as API generation and calling.

## Architecture comments
### Flows
I added the concept of "flow" to hide direct interaction with UI components from test.
A flow should describe steps of a user scenario in a readable way.
"Flow" is not page related entity, it is focused on user scenarios, so it can use several pages as well as part of a single page.

### PageObjects
#### Complex UI elements
Since UI of the selected system is quite complex, need to split pages on logical parts.
So, PageObject it is not only model of a page, but also it can describe model of a page's part.
Need to keep consistence between DOM and PageObjects structure, so child of a complex 
PageObject have to be searched in the related DOM node.

#### URLs to pages
We need to be able to use the test system in any environment.
In this case, we will have dynamic hosts, which must be specified in a config and a path to a page that should not depend on where the system is deployed.
The custom annotation @PageUrlPath chains the path and associated page model. 
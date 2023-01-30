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
I added the concept of "flow" to hide direct interaction with UI component from test
A flow should describe steps of a user scenario in a readable way.
"Flow is not page related, it is focused on user scenarios, so it can use several pages as well as part of a single page.
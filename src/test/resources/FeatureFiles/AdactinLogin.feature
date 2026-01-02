Feature: To verify adactin login functionality

Scenario Outline: To validate login with valid and invalid credentials


Given User launch the browser and hit the Adactin Login url
When User enters the username and password
And User clicks the login button
Then verify the user logs into the next page successfully

Examples:

|username|password|
|Vihin123|Vihin123|
|werty|vbnn|
|Vihin123|password|
|username|Vihin123|
Feature: To validate the adactin register fujnctionaly
@smoke
Scenario Outline: To verify the adactin register with all combinations

Given User hits the register url
When User enter "<username>" and "<password>" and "<repassword>" and "<fullname>" and "<email>"
And User clicks the checkbox and submits the register button
Then Validate if the user has created login credentials

Examples:
|username|password|repassword|fullname|email|
|Dino|12345678|12345678|poiunj|bing@gmail.com|
|useDinorname|12345678|12345678|poiunj|emaibing@gmail.com|
|poiuyt|sdfghjk|sdfghjk|lkjhg|emaibinggmail.com|	
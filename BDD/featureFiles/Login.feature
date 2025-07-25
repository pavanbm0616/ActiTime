Feature:Actime login feature
Scenario Outline:Valid login to actitime
Given User should be present in "http://localhost/login.do"
When  He enters the Username as "<un>"
And he enters the password as "<pw>"
And he click on login button
Then Home page should be displayed


Examples:
|un|pw|#heading
|admin|manager|
|admin|manager1|
|admin2|manager|


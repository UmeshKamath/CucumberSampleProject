Feature: CRM Demo appliaction login

Scenario: Free CRM login

Given user is already on Login Page
When title of login page is FreeCRM
Then user enter the username
And user enter the password
Then user click on the Login button
And user is on home page




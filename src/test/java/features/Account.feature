Feature: application login

#Background: This will execute before any test case execution
#Given this is backgournd code

@SanityTest @SmokeTest
Scenario: Home page default login
Given user is on netbanking landing page
When user login into application with username "brij" and password 1234
Then home page is populated
And cards displayed "true"

@MobileTest
Scenario: Mobile test Home page default login
Given user is on netbanking landing page
When user login into application with username "brij" and password 1234
Then home page is populated
And cards displayed "true"

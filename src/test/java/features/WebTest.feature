Feature: web application login

@WebTest
Scenario: Web test Home page default login
Given user is on netbanking landing page
When user login into application with username "brij" and password 1234
Then home page is populated
And cards displayed "true"

@WebTest
Scenario: Web test Home page default login
Given user is on netbanking landing page
When user login into application with username "brij" and password 1234
Then home page is populated
And cards displayed "true"

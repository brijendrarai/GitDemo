Feature: application login

Background:
	Given init background

@RegTest
Scenario: Home page default login
Given user is on netbanking landing page
When user login into application with username "brij" and password 1234
Then home page is populated
And cards displayed "true"

@BrijTest
Scenario: Home page default login
Given user is on netbanking landing page
When user login into application with username "kunu" and password 1234
Then home page is populated
And cards displayed "false"

@KunikaTest
Scenario: Home page default login
Given user is on netbanking landing page
When user login into application with username "kunu" and password 1234
Then home page is populated
And cards displayed "false"

@SmokeTest
Scenario: Home page default login
Given user is on netbanking landing page
When user signup with following details
| Kunika Jaiswal | Kunu1234 | 9876543210 | kunu@female.com | Pune |
Then home page is populated
And cards displayed "true"

@SmokeTest
Scenario Outline: Home page default login
Given user is on netbanking landing page
When user login into application with username <UserName> and password <password>
Then home page is populated
And cards displayed <cardDisplayed>

Examples:
| UserName | password | cardDisplayed |
| Kunu1    |1234      |true						|
| brij1 	 |4321			|false					|




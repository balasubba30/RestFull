Feature: User able to login and logout

#@Regression
#Scenario: User enter username, pasword and login to application
#Given User navigate to Gmail URL
#When User Enter user name "bala"
#Then User check home page


#@Sanity
#Scenario: User validate profile details
#Given User navigate to Profile details page
#When Enter city
#Then check Profile details
#
#@Regression
#Scenario: User enter username, pasword and login to application
#Given User navigate to Gmail URL
#When User Enter user name
#And User enter password
#
Scenario: user login details
Given  user navigate to home page
When  user navigate to login page
And user enter login details
	| bala |  | password1 |
	| subbu | |mass|
Then user logged in
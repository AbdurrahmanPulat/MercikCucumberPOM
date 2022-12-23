Feature: Login page feature

@Smoke
Scenario: Login with correct credentials
Given User is on login page
When User enters username "taiko.example@gmail.com" 
And User enters password "Test1234" 
And User cliks on Continue button
Then User gets title of the page
And Page title shoul be "Mercik Dashboard"

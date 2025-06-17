Feature: To validate the Flipkart Application

Background:

Given Launch the Flipkart Application
When Close the popup
Then It should nevigate to the Home page

@tc001 @Regression
Scenario: To validate the S	earch functionality

Given User enter the text in the search field
When Click the search button
Then It should navigate to the search result page and display the relevant details
Then Extract the Results and print in console
Then print the Third result and keep it tn the console
And Select Minimum and Maximun Amount
And Select the Brand 
And Select the Ram
And Select Battery Capacity
Then It should display the Relevant result


@tc002 @Regression
Scenario: To validate the Faction Functionality

Given User to move to the Faction link
When Cursor to move to the kids link
And Move to girls dress and click
And Click the price high to low link
Then It should display the relavent datails and get the title 

@tc003
Scenario Outline: To validate the sesrch functionality with different values
Given Enter the "<searchtext>" in the search field
When click the search button
Then It should navigate to the page display the corresponding page

Examples:
|searchtext|
|Mobile|
|Tv|
|Shirt|
|Router|
|Bags|



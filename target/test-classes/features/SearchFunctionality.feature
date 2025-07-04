Feature: To validate the Flipkart Application

@tc001 @Regression
Scenario: To validate the Search functionality

Given User enter the "Mobile Phone" in the search field
When Click the search button
Then It should navigate to the search result page and display the relevant details
Then Extract the Results and print in console
And Select Minimum and Maximun Amount
And Select the Brand 
And Select the Ram
And Select Battery Capacity
Then It should display the Relevant result


@tc003 @Regression
Scenario: To validate the Faction Functionality

Given User to move to the Faction link
When Cursor to move to the kids link
And Move to girls dress and click
And Click the price high to low link
Then It should display the relavent datails and get the title 

@tc002 @Regression
Scenario Outline: To validate the search functionality with different values
Given Enter the "<searchtext>" in the search field
When click the search button
Then It should navigate to the page display the corresponding "<searchtext>" page

Examples:
|searchtext|
|Mobile|
|Tv|
|Shirt|
|Router|
|Bags|

@tc004
Scenario: Search with non-existing item
  Given User searches for "xyzxxxxxxxx"
  Then No search results should be displayed  
  And Take Screenshot
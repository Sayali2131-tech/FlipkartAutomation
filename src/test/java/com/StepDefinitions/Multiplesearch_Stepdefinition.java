package com.StepDefinitions;

import BrowserSetup.BaseClass;
import Pages.Multiplesearch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import keyword.Keywords;

public class Multiplesearch_Stepdefinition{
	
	@Given("Enter the {string} in the search field")
	public void enter_the_in_the_search_field(String searchtext) {
		
		Multiplesearch.Entersearch(searchtext);
	}

	@When("click the search button")
	public void click_the_search_button() {
		Multiplesearch.clicksearch();
	}

	@Then("It should navigate to the page display the corresponding {string} page")
	public void it_should_navigate_to_the_page_display_the_corresponding_page(String SearchEx) {
		BaseClass.driver.getTitle();
		Keywords.log.info("*****************************");
		Keywords.takeScreenshot(SearchEx);
	}




}

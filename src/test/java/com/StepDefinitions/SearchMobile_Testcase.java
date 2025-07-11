package com.StepDefinitions;
import org.openqa.selenium.By;
import Pages.Searchpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import keyword.Keywords;

public class SearchMobile_Testcase {
	

	@Then("It should nevigate to the Home page")
	public void it_should_nevigate_to_the_Home_page() {
		Searchpage.homescreen();
	}

	@Given("User enter the {string} in the search field")
	public void user_enter_the_text_in_the_search_field(String Searchtext) {
	 
		Searchpage.user_enter_the_text_in_the_search_field(Searchtext);
	    
	}

	@When("Click the search button")
	public void click_the_search_button() {
		Searchpage.Clicksearch();
	
	}

	@Then("It should navigate to the search result page and display the relevant details")
	public void it_should_navigate_to_the_search_result_page_and_display_the_relevant_details() {
		Searchpage.Result();
		
	}
	@Then("Extract the Results and print in console")
	public void extract_the_results_and_print_in_console() {
		Searchpage.printentireresult();
		Keywords.log.info("******************"); 
	}
}

package com.StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseClass.Library;
import com.Pages.Searchpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchMobile_Testcase extends Library {
	Searchpage sp;
	@Given("Launch the Flipkart Application")
	public void launch_the_Flipkart_Application() throws IOException {
		launchapplication();   
		sp = new Searchpage(driver); 
	}

	@When("Close the popup")
	public void close_the_popup() {
	  System.out.println(driver.getTitle());  
	
	}

	@Then("It should nevigate to the Home page")
	public void it_should_nevigate_to_the_Home_page() {
	   sp=new Searchpage(driver);
	   sp.homescreen();
	
	}

	@Given("User enter the text in the search field")
	public void user_enter_the_text_in_the_search_field() {
	    
	    WebElement searchBox = driver.findElement(By.name("q"));
	    searchBox.sendKeys("mobile phone"); 
	

	}

	@When("Click the search button")
	public void click_the_search_button() {
	sp.Clicksearch();
	
	}

	@Then("It should navigate to the search result page and display the relevant details")
	public void it_should_navigate_to_the_search_result_page_and_display_the_relevant_details() {
			sp.Result();
		
	}
	@Then("Extract the Results and print in console")
	public void extract_the_results_and_print_in_console() {
		sp.printentireresult();
		System.out.println("******************");
	    
	}

	@Then("print the Third result and keep it tn the console")
	public void print_the_third_result_and_keep_it_tn_the_console() {
		sp.print3rdresult();
	    
	}




}

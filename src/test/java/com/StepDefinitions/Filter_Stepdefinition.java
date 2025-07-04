package com.StepDefinitions;



import Pages.Filter_page;
import io.cucumber.java.en.Then;


public class Filter_Stepdefinition{
	 
	  @Then("Select Minimum and Maximun Amount")
	  public void select_minimum_and_maximun_amount() throws InterruptedException {
		 
	      Filter_page.Min();
	      Thread.sleep(2000);
	      
	      Filter_page.Max();
	      Thread.sleep(2000); 
	  }


	@Then("Select the Brand")
	public void select_the_brand() throws InterruptedException
	{
		Filter_page.brand();
	    Thread.sleep(2000); 

	}

	@Then("Select the Ram")
	public void select_the_ram() throws InterruptedException
	{
		Filter_page.ram();
       Thread.sleep(2000);


	}

	@Then("Select Battery Capacity")
	public void select_battery_capacity() throws InterruptedException 
	{

		Filter_page.clickbattery();
      Thread.sleep(2000); 

	}

	@Then("It should display the Relevant result")
	public void it_should_display_the_relevant_result() 
	{
		Filter_page.it_should_display_the_relevant_result();
	}



} 
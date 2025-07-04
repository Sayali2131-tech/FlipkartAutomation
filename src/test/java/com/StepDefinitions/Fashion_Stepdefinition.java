package com.StepDefinitions;

import BrowserSetup.BaseClass;
import Pages.Fashion_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import keyword.Keywords;

public class Fashion_Stepdefinition{
	
	@Given("User to move to the Faction link")
	public void user_to_move_to_the_faction_link() throws InterruptedException {
		
        Keywords.log.info("Befor clicking Fashion");
        BaseClass.driver.getTitle();
	
        Fashion_page.movefashionlink();
	}

	@When("Cursor to move to the kids link")
	public void cursor_to_move_to_the_kids_link() throws InterruptedException {
		Fashion_page.movekidslink();
	}

	@When("Move to girls dress and click")
	public void move_to_girls_dress_and_click() throws InterruptedException {
		Fashion_page.clickgirlslink();
	}

	@When("Click the price high to low link")
	public void click_the_price_high_to_low_link() throws InterruptedException {
		Fashion_page.clickprice();
	}

	@Then("It should display the relavent datails and get the title")
	public void it_should_display_the_relavent_datails_and_get_the_title() {
		Keywords.log.info ("After clicking Fashionlink");
	  BaseClass.driver.getTitle();
	}

	}






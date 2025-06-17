package com.StepDefinitions;

import com.BaseClass.Library;
import com.Pages.Fashion_page;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fashion_Stepdefinition  extends Library{
	Fashion_page fp;
	@Given("User to move to the Faction link")
	public void user_to_move_to_the_faction_link() throws InterruptedException {
		SeleniumReusable se = new SeleniumReusable(driver);
        System.out.println("Befor clicking Fashion");
        se.gettitle();
		 fp=new Fashion_page(driver);
		 fp.movefashionlink();
	}

	@When("Cursor to move to the kids link")
	public void cursor_to_move_to_the_kids_link() throws InterruptedException {
	    fp.movekidslink();
	}

	@When("Move to girls dress and click")
	public void move_to_girls_dress_and_click() throws InterruptedException {
	   fp.clickgirlslink();
	}

	@When("Click the price high to low link")
	public void click_the_price_high_to_low_link() throws InterruptedException {
	    fp.clickprice();
	}

	@Then("It should display the relavent datails and get the title")
	public void it_should_display_the_relavent_datails_and_get_the_title() {
	    System.out.println("After clicking Fashionlink");
	    SeleniumReusable se = new SeleniumReusable(driver);
	    se.gettitle();
	}

	}






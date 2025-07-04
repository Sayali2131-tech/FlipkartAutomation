package com.StepDefinitions;

import io.cucumber.java.en.*;
import keyword.Keywords;

import org.testng.Assert;

import Pages.InvalidSearchPage;
import Pages.Searchpage;

public class InvalidSearchStepDef {

  

    @Given ("User searches for {string}")
    public void search_for_invalid_product(String product) {
        Searchpage.Search(product);
        Searchpage.Clicksearch();
    }

    @Then("No search results should be displayed")
    public void verify_no_search_results() {
        Assert.assertTrue(InvalidSearchPage.isNoResultFound(), "Expected no results message not displayed.");
        
        
    }
    @And("Take Screenshot")
    public void Capturerecord() {
    	Keywords.takeScreenshot("Invalidsearch");
    }
}

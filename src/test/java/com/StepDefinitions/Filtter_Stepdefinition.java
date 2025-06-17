package com.StepDefinitions;

import org.openqa.selenium.By;

import com.BaseClass.Library;
import com.Pages.Filter_page;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Then;

public class Filtter_Stepdefinition extends Library {
	 Filter_page fp;
	  SeleniumReusable se;
	  @Then("Select Minimum and Maximun Amount")
	  public void select_minimum_and_maximun_amount() throws InterruptedException {
	      fp = new Filter_page(driver);
	      String BeforeFilter = driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[2]/div[1]")).getText();
	      System.out.println("BEFOR FILTER :" + BeforeFilter);
	      
	      fp.Min();
	      Thread.sleep(2000); // Instead of se.wait()
	      
	      fp.Max();
	      Thread.sleep(2000); // Instead of se.wait()
	  }


	@Then("Select the Brand")
	public void select_the_brand() throws InterruptedException
	{
	    fp.brand();
	    Thread.sleep(2000); // sleeps for 2 seconds

	}

	@Then("Select the Ram")
	public void select_the_ram() throws InterruptedException
	{
       fp.ram();
       Thread.sleep(2000); // sleeps for 2 seconds


	}

	@Then("Select Battery Capacity")
	public void select_battery_capacity() throws InterruptedException 
	{

      fp.clickbattery();
      Thread.sleep(2000); // sleeps for 2 seconds

	}

	@Then("It should display the Relevant result")
	public void it_should_display_the_relevant_result() 
	{
		System.out.println("****************************************************");
		String AfterFilter=driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]")).getText();
	    System.out.println("After FILTER : "+AfterFilter);
	}



}

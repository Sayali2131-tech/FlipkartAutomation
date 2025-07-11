package com.TestRunner;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features="src/test/java/features",glue= {"com.StepDefinitions","hooks"},
                    plugin= {
                    		
                    		 "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},tags="@tc001")

public class runner extends AbstractTestNGCucumberTests{

}






/*
Component            	Purpose
@CucumberOptions	  Configures features, glue code, reporting, and test filtering.
features	          Path to your .feature files.
glue	              Step definition package.
tags	             Runs only tests marked with @tc002.
extends AbstractTestNGCucumberTests	Bridges Cucumber with TestNG runner.

*/
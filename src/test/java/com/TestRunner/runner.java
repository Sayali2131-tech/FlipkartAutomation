package com.TestRunner;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue= {"com/StepDefinitions"},
                    plugin= {
                    		
           "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},tags = "@tc002")

public class runner extends AbstractTestNGCucumberTests{

}

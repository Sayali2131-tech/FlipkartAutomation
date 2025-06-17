package com.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue= {"com/StepDefinitions"},
                    plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},tags = "@tc002")

public class runner {

}

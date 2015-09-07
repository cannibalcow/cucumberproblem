package com.sorkmos;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true, tags = {"@run", "~@ignore" }, 
        format = {"html:target/systemtest", "pretty" }, features = "classpath:features/",
        glue = {"com.sorkmos.stepdef" }, monochrome = true)
public class RunFeatures {

}

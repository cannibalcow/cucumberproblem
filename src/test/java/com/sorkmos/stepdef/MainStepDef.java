package com.sorkmos.stepdef;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MainStepDef {

    @Before
    public void setup() {
        System.out.println("This is OK!");
    }
    
    @Given("^stuff is created$")
    public void stuff_is_created() throws Throwable {
    }

    @When("^i do stuff$")
    public void i_do_stuff() throws Throwable {
    }

    @Then("^stuff will be done$")
    public void stuff_will_be_done() throws Throwable {
    }

}

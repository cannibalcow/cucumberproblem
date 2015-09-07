package com.sorkmos.stepdef;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class OtherStepDef {

    @Before
    public void setup() {
        throw new RuntimeException("No! Bad code! BAD CODE!");
    }
    
    @Given("^some other stuff is also created$")
    public void some_other_stuff_is_also_created() throws Throwable {
    }
}

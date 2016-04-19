package com.chrisgode.techtest.steps;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

@Steps
public class Story1 {

	@When("event with parameter $parameter happen")
	public void eventHappening(String parameter){
		// assertion
	}
	
	@Then("I expect a result with parameter $parameter")
	public void expectedResult(String parameter){
		// assertion
	}
}

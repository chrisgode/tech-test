package com.chrisgode.techtest.steps;

import org.jbehave.core.annotations.Given;

@Steps
public class SharedSteps {

	@Given("a first condition with parameter $parameter")
	public void theStocksHaveNoTrade(String parameter){
		// assertion
	}
	
}

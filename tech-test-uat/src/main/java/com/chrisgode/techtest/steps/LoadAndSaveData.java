package com.chrisgode.techtest.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import static org.junit.Assert.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.chrisgode.techtest.domain.People;
import com.chrisgode.techtest.service.PeopleService;

@Steps
public class LoadAndSaveData {

	WebDriver driver;
	
	@Value("${application.dns}")
	private String applicationDNS;
	
	@Value("${application.context}")
	private String applicationContext;
	
	@Value("${loadandsave.pattern}")
	private String loadandsavePattern;
	
	@Autowired
	PeopleService peopleService;
	
	@Given("the HTML form is displayed on my browser")
	public void theHTMLFormIsDisplayedOnMyBrowser(){
		driver = new FirefoxDriver();
		String url = applicationDNS + applicationContext + loadandsavePattern;
		System.out.println("Selenium driver is calling url: " + url);
		driver.get(url);
	}
	
	@When("I click on the submit button")
	public void iClickOnTheSubmitButton(){
		WebElement submitButton = driver.findElement(By.id("submit-button"));
		submitButton.click();
		driver.quit();
	}
	
	@Then("I expect that $firstName $lastName is saved on the server file")
	public void iExpectThatTheFormDataIsSavedOnAServerFile(String firstName, String surname){
		
		List<People> peopleList = peopleService.retrieveAllPeople();
		
		boolean isPresent = false;
		for(People people: peopleList){
			if(people.getFirstname().equals(firstName) && people.getSurname().equals(surname)){
				isPresent=true;
			}
		}
		
		assertTrue(isPresent);
	}
}

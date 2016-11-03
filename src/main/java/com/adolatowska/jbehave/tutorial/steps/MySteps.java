package com.adolatowska.jbehave.tutorial.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.adolatowska.jbehave.tutorial.pages.MyPage;

import junit.framework.Assert;

public class MySteps {
	
private MyPage myPage;
	
	@Given("I go to Google")
	public void firstStep(){
		myPage = new MyPage();
		myPage.openMyPage();
	}
	
	@When("I type $query")
	public void someAction(String query) {
		myPage.typeQuery(query);
	}
    
	@Then("I should find $query")
	public void someHappyAssertion(String query) {
		Assert.assertTrue(myPage.getQuery().equals(query));
		myPage.closeMyPage();
	}

}

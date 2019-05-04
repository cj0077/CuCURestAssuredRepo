package com.basic1;

import io.restassured.*;
import io.restassured.response.Response;
import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MyGoogleSD {

	Response res;
	
	@Given("^I want to open google$")
	public void i_want_to_open_google() {
		System.out.println("Hitting Google.com");
		res = RestAssured.given().get("https://www.google.com");
	    
	}

	@Then("^I want to check \"([^\"]*)\" status code$")
	public void i_want_to_check_status_code(String arg1) {
	   System.out.println("Validating status code");
	   int stCode = res.getStatusCode();
	   int a = Integer.parseInt(arg1);
	   Assert.assertEquals(a, stCode);
	}
	

}

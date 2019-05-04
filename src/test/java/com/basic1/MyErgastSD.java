package com.basic1;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
 

public class MyErgastSD {

	Response res;
	
	@Given("^I want to open ergast$")
	public void i_want_to_open_ergast() {
	   res =  RestAssured.given().get("https://ergast.com/api/f1/2017/circuits.json");
	}

	@Then("^I want to check \"([^\"]*)\" limit status$")
	public void i_want_to_check_limit_status(String limit) {
		String limitVal = res.getBody().jsonPath().getString("MRData.limit");
		Assert.assertEquals("30", limitVal);
		
		//verify size
		//res.then().assertThat().body("MRData.CircuitTable.Circuits.circuitId", hasSize(20));
	}
	
	
	@Then("^I want to check \"([^\"]*)\" value$")
	public void i_want_to_check_value(String arg1) {
	    System.out.println("verify single string");
	    res.getBody().jsonPath().getString("MRData.CircuitTable.Circuits.circuitId.albert_park");
	}

	
}

package com.basic1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( 
		features={"src/test/java/resources/basic/MyErgast.feature"},
		glue={"com/basic/"}
		)

public class RunMyErgastTest {

}

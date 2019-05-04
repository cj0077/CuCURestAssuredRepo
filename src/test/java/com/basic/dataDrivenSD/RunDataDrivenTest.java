package com.basic.dataDrivenSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		
			monochrome=true,
			dryRun=false,
			features= {"src/test/java/resources/com/basic/dataDrivenFF/DataDrivenJson.feature"},
			glue={"com/basic/dataDrivenSD/"},
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report11.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
			}
		)
		
//First_Maven/src/test/java/resources/com/basic/dataDrivenFF/DataDrivenJson.feature


//First_Maven/src/test/java/com/basic/dataDrivenSD/MyDataDriven.java
public class RunDataDrivenTest {


}

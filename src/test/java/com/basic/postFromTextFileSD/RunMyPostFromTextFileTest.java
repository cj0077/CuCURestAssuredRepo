package com.basic.postFromTextFileSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		
			monochrome=true,
			dryRun=false,
			features= {"src/test/java/com/basic/postStringJsonSD/PostFromTextFile.feature"},
					//First_Maven/src/test/java/com/basic/postStringJsonSD/PostFromTextFile.feature
			glue={"com/basic/postFromTextFileSD/"},
					//First_Maven/src/test/java/com/basic/postFromTextFileSD/MyPostFromTextFile.java
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report5.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
			}
		)
		

public class RunMyPostFromTextFileTest {


}

package com.basic.postUpdatedJsonSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		
		
			monochrome=true,
			dryRun=false,
			features= {"src/test/java/resources/com/basic/postUpdatedJsonFF/PostUpdatedJson.feature"},
			glue={"com/basic/postUpdatedJsonSD/"},
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report4.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
			}
		)
		
//First_Maven/src/test/java/resources/com/basic/postUpdatedJsonFF/PostUpdatedJson.feature
///First_Maven/src/test/java/com/basic/postUpdatedJsonSD/MyPostFromTextFile.java
public class RunMyPostFromTextFileTest {


}

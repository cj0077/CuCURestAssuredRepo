package com.basic1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test1StepDefs {

	WebDriver driver;
	
	@Given("the user is on facebook login Page")
	public void the_user_is_on_facebook_login_Page(){
		System.out.println("in setup");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Software\\chromedriver_win32_B45\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	//he enters "anil" as user name
	@When("^he enters \"([^\"]*)\" as user name and also \"([^\"]*)\" as password$$")
	public void he_enters_as_user_name(String userName, String pwd) {
		WebElement uName = driver.findElement(By.xpath("//input[@id='email']"));
		uName.sendKeys(userName);
		WebElement passW = driver.findElement(By.xpath("//input[@id='pass']"));
		passW.sendKeys(pwd);
	}

	/*@When("^he enters \"([^\"]*)\" as password$")
	public void he_enters_as_password(String pwd) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement ele = driver.findElement(By.xpath("//input[@id='pass']"));
		ele.sendKeys(pwd);
	}
*/	
	@Then("^check usename is present in textbox$")
	public void check_usename_is_present_in_textbox() throws Throwable {
		driver.findElement(By.xpath("//input[@id='email']")).getText();
	}

	@Then("^I am checking the login$")
	public void i_am_checking_the_login() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit']")).click();;
	}

}

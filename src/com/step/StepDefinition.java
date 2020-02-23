package com.step;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver = null;

	/*@Given("^User navigate to Gmail URL$")
	public void user_navigate_to_Gmail_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bala\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		System.out.println("Navigate URL");
	}
*/
	/*@When("^User Enter user name$")
	public void user_Enter_user_name() throws Throwable {
		WebElement email = driver.findElement(By.cssSelector("input[type='email']"));
		email.clear();
		email.sendKeys("balasubbarayudu2@gmail.com");
		WebElement next = driver.findElement(By.cssSelector("span[class='RveJvd snByac']"));
		next.click();
		System.out.println("User Name");
	}*/
	
	@When("^User Enter user name$")
	public void userEnterUserName(DataTable tables) throws Throwable {
	 List<List<String>>    data=tables.raw();
	 for(int i=0;i<data.size();i++) {
		 System.out.println(data.get(i).get(0)+"\t"+data.get(i).get(1));
	 }
	}

	@When("^User enter password$")
	public void user_enter_password() throws Throwable {
		/*Thread.sleep(3000);
		WebElement password = driver.findElement(By.cssSelector("input[aria-label='Enter your password']"));
		password.sendKeys("9535016848");*/
		System.out.println("Password");

	}

	@When("^User click login button$")
	public void user_click_login_button() throws Throwable {
		/*WebElement next1 = driver.findElement(By.cssSelector("span[class='RveJvd snByac']"));
		next1.click();*/
		System.out.println("Login Button");
	}

	@Then("^User check home page$")
	public void user_check_home_page() throws Throwable {
/*		Thread.sleep(3000);
		WebElement inbox = driver.findElement(By.linkText("Inbox"));
		inbox.click();*/
		System.out.println("Validate Details");
	}

	@Then("^check details$")
	public void check_details() throws Throwable {
		/*Thread.sleep(4000);
		WebElement sinouticon = driver.findElement(By.cssSelector("span[class='gb_Ba gbii']"));
		sinouticon.click();
		WebElement logout = driver.findElement(By.linkText("Sign out"));
		logout.click();*/
		System.out.println("Check Details");
	}
	
	@When("^User Enter user name \"(.*?)\"$")
	public void userEnterUserName(String name) throws Throwable {
	   System.out.println("============" + name);
	}
	
//	@When("^User Enter user name \"(.*?)\"$")
//	public void userEnterUserName(String name) throws Throwable {
//	    System.out.println("Hello "+name);
//	}
//
//	@When("^User enter password \"(.*?)\"$")
//	public void userEnterPassword(String pass) throws Throwable {
//		System.out.println("Hello "+pass);
//	}
	@Given("^user navigate to home page$")
	public void userNavigateToHomePage() throws Throwable {
	   System.out.println("Home page");
	}

	@When("^user navigate to login page$")
	public void userNavigateToLoginPage() throws Throwable {
		System.out.println("Login page");
	}

	@When("^user enter login details$")
	public void userEnterLoginDetails(DataTable arg1) throws Throwable {
	    
	List<List<String>> data=arg1.raw();
	for(int i=0;i<data.size();i++)
	{
		System.out.println(data.get(i).get(0)+"\t"+ data.get(i).get(1));
	}
	}

	@Then("^user logged in$")
	public void userLoggedIn() throws Throwable {
		System.out.println("success");

}
}

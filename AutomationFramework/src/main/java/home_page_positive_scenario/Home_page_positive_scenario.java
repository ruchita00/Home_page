package home_page_positive_scenario;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import Reusable_Functions.Generic_function;
import io.cucumber.java.en.*;

public class Home_page_positive_scenario extends Generic_function {	
	public static boolean value;
	
	/*Browser is launching*/
	@Given("Browser is open")
	public static void browser_is_open() {
		try {
			Browser_Launch();
			click("login");	
			driver.findElement(By.xpath(OR_reader("Object_Locator", "login_phone_number"))).sendKeys(td_reader("login_phone_number",0));
			browser_wait(12);		
			driver.findElement(By.xpath(OR_reader("Object_Locator", "login_password"))).sendKeys(td_reader("login_password",0));
			click("logout1");
			browser_wait(12);
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "logout1"))).isDisplayed();
			Assert.assertEquals(true,value);			
		} catch (IOException e) {
			e.printStackTrace();
		}	 
	}	

	/*TC_001 User is navigated to the payment manage page on clicking wallet tab */
	@Then("User is navigated to the payment manage page on clicking wallet tab")
	public static void home_page_positive_scenario_tc_001() {
		try {
			Map<String, Object> prefs = new HashMap<String, Object>();


			//Pass the argument 1 to allow and 2 to block
			prefs.put("profile.default_content_setting_values.notifications", 2);


			ChromeOptions options = new ChromeOptions();


			options.setExperimentalOption("prefs", prefs);


		    driver = new ChromeDriver(options);

			click("utilities");			
	        browser_wait(12);
			click("wallet");
			browser_wait(12);
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "wallet"))).isDisplayed();
			click("side_arrow");
			click("home");
			Assert.assertEquals(true,value);

		} catch (IOException e) {
			e.printStackTrace();

		}


	}

	/*TC_002 User is navigated to the bills page on the clicking bills tab */
//	@Then("User is navigated to the bills page on the clicking bills tab")
//	public void home_page_positive_scenario_tc_002() {
//		driver.navigate().back();
//
//		try {
//			click("bills");
//			str1= driver.findElement(By.xpath(OR_reader("Object Locator2","bills"))).isDisplayed();
//
//			Assert.assertEquals(true, str1);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}	
//
//	}
//
//	/*TC_003 User is able to click on the claims tab */
//	@Given("User is able to click on the claims tab")
//	public void home_page_positive_scenario_tc_003() {
//		driver.navigate().back();
//
//		try {
//			click("claims");
//			str1= driver.findElement(By.xpath(OR_reader("Object Locator2","claims"))).isDisplayed();
//			Assert.assertEquals(true, str1);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}	
//	}
//
//
//	/*TC_004 User is on the home page on clicking home tab*/ 
//	@Given("User is on the home page on clicking home tab")
//	public void home_page_positive_scenario_tc_004() {
//		driver.navigate().back();
//		try {
//			click("home");
//			str1= driver.findElement(By.xpath(OR_reader("Object Locator2","home"))).isDisplayed();
//			Assert.assertEquals(true, str1);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//	}
//	/*TC_005 User is navigated to the services page on clicking services tab*/
//	@Then("User is navigated to the services page on clicking services tab")
//	public void home_page_positive_scenario_tc_005() {
//		driver.navigate().back();
//		try {
//			click("services");
//			str1= driver.findElement(By.xpath(OR_reader("Object Locator2","services"))).isDisplayed();
//			Assert.assertEquals(true, str1);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	/*TC_006 User is navigated to the circles page on clicking circles tab*/
//	@Then("User is navigated to the circles page on clicking circles tab")
//	public void home_page_positive_scenario_tc_006(){
//		driver.navigate().back();
//		try {
//			click("circles");
//			str1= driver.findElement(By.xpath(OR_reader("Object Locator2","circles"))).isDisplayed();
//			Assert.assertEquals(true, str1);
//		} catch (IOException e) {
//			e.printStackTrace();	
//
//
//
//
//		}}
//
//	/*TC_007 User is navigated to the Utilities page on clicking utilities tab*/
//	@Then("User is navigated to the Utilities page on clicking utilities tab")
//	public void home_page_positive_scenario_tc_007(){
//		driver.navigate().back();
//		try {
//			click("utilities");
//			str1= driver.findElement(By.xpath(OR_reader("Object Locator2","utilities"))).isDisplayed();
//			Assert.assertEquals(true, str1);
//		} catch (IOException e) {
//			e.printStackTrace();	
//
//		}
//
//	}
//
//	/*TC_008 User is navigated to the award points page on clicking award points tab*/
//	@Then("User is navigated to the award points page on clicking award points tab")
//	public void home_page_positive_scenario_tc_008(){
//		driver.navigate().back();
//		try {
//			click("award_points");
//			str1= driver.findElement(By.xpath(OR_reader("Object Locator2","award_points"))).isDisplayed();
//			Assert.assertEquals(true, str1);
//		} catch (IOException e) {
//			e.printStackTrace();	
//
//		}
//
//
//	}
//
//	/*TC_009 User is navigated to the second opinion page on clicking request for second opinion button*/
//	@Then("User is navigated to the second opinion page on clicking request for second opinion button")
//	public void home_page_positive_scenario_tc_009(){
//		driver.navigate().back();
//		try {
//			click("request_for_second_opinion");
//			str1= driver.findElement(By.xpath(OR_reader("Object Locator2","request_for_second_opinion"))).isDisplayed();
//			Assert.assertEquals(true, str1);
//		} catch (IOException e) {
//			e.printStackTrace();	
//
//		}
//
//	}
//
//
//	/*TC_010 User is navigated to the refer a friend page on clicking refer a friend button*/
//	@Then("User is navigated to the refer a friend page on clicking refer a friend button")
//	public void home_page_positive_scenario_tc_010() {
//		driver.navigate().back();
//		try {
//			click("refer_a_friend");
//			str1= driver.findElement(By.xpath(OR_reader("Object Locator2","refer_a_friend"))).isDisplayed();
//			Assert.assertEquals(true, str1);
//		} catch (IOException e) {
//			e.printStackTrace();	
//
//		}
//
//
//	}
//
//	/*TC_011 User is navigated to the help page on clicking help tab*/
//	@Then("User is navigated to the help page on clicking help tab")
//	public void home_page_positive_scenario_tc_011(){
//		driver.navigate().back();
//		try {
//			click("help");
//			str1= driver.findElement(By.xpath(OR_reader("Object Locator2","help"))).isDisplayed();
//			Assert.assertEquals(true, str1);
//		} catch (IOException e) {
//			e.printStackTrace();	
//
//		}
//
//
//
//	}
//
//	/*TC_012 User is navigated to the  your alerts page on clicking your alerts tab*/
//	@Then("User is navigated to the  your alerts page on clicking your alerts tab")
//	public void home_page_positive_scenario_tc_012() {
//		driver.navigate().back();
//		try {
//			click("your_alerts");
//			str1= driver.findElement(By.xpath(OR_reader("Object Locator2","your_alerts"))).isDisplayed();
//			Assert.assertEquals(true, str1);
//		} catch (IOException e) {
//			e.printStackTrace();	
//
//		}
//
//
//	}
//
//	/*TC_013 User is able to click on the drop down tab*/
//	@Given("User is able to click on the drop down tab")
//	public void home_page_positive_scenario_tc_013(){
//		driver.navigate().back();
//		try {
//			click("drop_down");
//			str1= driver.findElement(By.xpath(OR_reader("Object Locator2","drop_down"))).isDisplayed();
//			Assert.assertEquals(true, str1);
//		} catch (IOException e) {
//			e.printStackTrace();	
//
//		}
//
//	}
//
//
//	/*TC_014 User is able to logout on clicking on the logout button*/
//	@Then("User is able to logout on clicking on the logout button")
//	public void home_page_positive_scenario_tc_014(){
//		driver.navigate().back();
//		try {
//			click("logout");
//			str1= driver.findElement(By.xpath(OR_reader("Object Locator2","logout"))).isDisplayed();
//			Assert.assertEquals(true, str1);
//		} catch (IOException e) {
//			e.printStackTrace();	
//		}
//
//	}
//
//	/*TC_015 User is navigated to the login page  from Home page on clicking the browser back option*/
//	@Then("User is navigated to the login page  from Home page on clicking the browser back option")
//	public void home_page_positive_scenario_tc_015(){
//		driver.navigate().back();
//	}



}	

//
//Scenario: Validate that the user is navigated to the bills page on clicking bills tab  
//Then User is navigated to the bills page on the clicking bills tab
//
//Scenario: Validate that the user is able to click on the claims tab
//Given User is able to click on the claims tab
//
//Scenario: Validate that the user is on the home page on clicking home tab  
//Given User is on the home page on clicking home tab
//
//Scenario: Validate that the user is navigated to the services page on clicking services tab 
//Then User is navigated to the services page on clicking services tab 
//
//Scenario: Validate that the user is navigated to the circles page on clicking circles tab
//Then User is navigated to the circles page on clicking circles tab 
//
//Scenario: Validate that the user is navigated to the Utilities page on clicking utilities tab
//Then User is navigated to the Utilities page on clicking utilities tab
//
//Scenario: Validate that the user is navigated to the award points page on clicking award points tab
//Then User is navigated to the award points page on clicking award points tab
//
//Scenario: Validate that the user is navigated to the second opinion page on clicking request for second opinion button
//Then User is navigated to the second opinion page on clicking request for second opinion button
//
//Scenario: Validate that the user is navigated to the refer  a friend page on clicking refer a friend button
//Then User is navigated to the refer a friend page on clicking refer a friend button
//
//Scenario: Validate that the user is navigated to the help page on clicking help tab
//Then User is navigated to the help pageon clicking help tab
//
//Scenario: Validate that the user is navigated to the  your alerts page on clicking your alerts tab
//Then User is navigated to the  your alerts page on clicking your alerts tab
//
//Scenario: Validate that user is able to click on the drop down tab
//Given User is able to click on the drop down tab
//
//Scenario: Validate that the user is able to logout on clicking on the logout button
//Then User is able to logout on clicking on the logout button
//
//Scenario: Validate that the user is navigated to the login page  from Home page on clicking the browser back option 
//Then User is navigated to the login page  from Home page on clicking the browser back option
//

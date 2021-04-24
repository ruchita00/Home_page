package home_page_positive_scenario;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
			browser_wait(4);		
			driver.findElement(By.xpath(OR_reader("Object_Locator", "login_password"))).sendKeys(td_reader("login_password",0));
			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "logout1"))).isDisplayed();
			Assert.assertEquals(true,value);
			click("logout1");
			browser_wait(5);
		} catch (IOException e) {
			e.printStackTrace();
		}	 
	}	

	@Then("user is navigated to the tabs on clicking any tab")
	public void user_is_navigated_to_the_tabs_on_clicking_any_tab() throws Exception {
			
			System.out.println("print1");
			//String str= OR_reader("Object_Locator", "common_one");
			boolean stopflag=false;
			boolean walletflag=false;
			boolean billsflag=false;
			boolean awardPointsflag=false;
			
			 
			List<WebElement> elements=driver.findElements(By.xpath("//span[@class='MuiBadge-root']//p"));
			int eleSize = elements.size();
			System.out.println("Element size is"+eleSize );
			
			System.out.println("print2");
			Iterator<WebElement> itr = elements. iterator();
			System.out.println("print3");
			
			WebElement wb = itr.next();
						
				System.out.println("print4");
				String eleText=wb.getText();
			System. out. println(eleText);
			
			int whilecounter = 0;
			
			do
			{
				driver.navigate().refresh();
				
				browser_wait(10);
				
				elements=driver.findElements(By.xpath("//span[@class='MuiBadge-root']//p"));
				itr = elements. iterator();
				wb = itr.next();
				eleText=wb.getText();
				
				if(eleText.equalsIgnoreCase("wallet"))
				{
				
					if(walletflag==false)
					{
					
						click("wallet");
						value = driver.findElement(By.xpath(OR_reader("Object_Locator", "wallet_page"))).isDisplayed();
						Assert.assertEquals(true,value,"wallet test case passed");	
						System.out.println("wallet test case passed");
						walletflag=true;
						whilecounter++;
						click("home");
						browser_wait(5); 

					
					}
					else
					{	
						wb = itr.next();
						eleText=wb.getText();
					}
				
				}
				else if(eleText.equalsIgnoreCase("bills"))
				{
					if( billsflag==false)
					{
						click("bills");
						value = driver.findElement(By.xpath(OR_reader("Object_Locator", "bills_page"))).isDisplayed();
						Assert.assertEquals(true,value,"bills test case passed");
						System.out.println("bill test case passed");
						billsflag=true;
						whilecounter++;
						System.out.println("While couner is "+whilecounter);
						click("home");  
						browser_wait(5);
						
					}
					else
					{
						wb = itr.next();
						eleText=wb.getText();
							
					}

				}
				else if(eleText.equalsIgnoreCase("award points"))
				{
				
					if(awardPointsflag==false)
					{
						click("award_points");
						value = driver.findElement(By.xpath(OR_reader("Object_Locator", "award_points_page"))).isDisplayed();
						Assert.assertEquals(true,value,"award points test case passed");
						System.out.println("award points test case passed");
						awardPointsflag=true;
						whilecounter++;
						System.out.println("While couner is "+whilecounter);
						click("home");  
						browser_wait(5);
						
					}
					else
					{
						wb = itr.next();
							eleText=wb.getText();
					}
				}
			}
			while(whilecounter <eleSize );
				
			}								
	
	}

//
//	/*TC_001 User is navigated to the payment manage page on clicking wallet tab */
//	@Then("User is navigated to the tabs on clicking any tab")
//	public static void home_page_positive_scenario_tc_00() {
//		try {			
//			List<WebElement> elements=driver.findElements(By.xpath(OR_reader("Object_Locator", "common_one")));
//			Iterator<WebElement> itr = elements. iterator();
//			while(itr. hasNext()) {
//				String eleText=itr. next(). getText();
//			System. out. println(eleText);
//			if(eleText.equalsIgnoreCase("wallet")) {
//				click("wallet");
//				value = driver.findElement(By.xpath(OR_reader("Object_Locator", "wallet_page"))).isDisplayed();
//				Assert.assertEquals(true,value,"wallet test case passed");	
//				click("home");
//				browser_wait(5);   
//				
//			}
//			else if(eleText.equalsIgnoreCase("bills")) {
//				click("bills");
//				value = driver.findElement(By.xpath(OR_reader("Object_Locator", "bills_page"))).isDisplayed();
//				Assert.assertEquals(true,value,"bills test case passed");
//				click("home");  
//				browser_wait(5);			
//
//			}
//			else if(eleText.equalsIgnoreCase("award points")) {
//				click("award_points");
//				value = driver.findElement(By.xpath(OR_reader("Object_Locator", "award_points_page"))).isDisplayed();
//				Assert.assertEquals(true,value,"award points test case passed");
//				click("home");  
//				browser_wait(5);
//			}	
//				
//			}								
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
////
//
//	
//	
//	
//	
//	/*TC_001 User is navigated to the payment manage page on clicking wallet tab */
//	@Then("User is navigated to the payment manage page on clicking wallet tab")
//	public static void home_page_positive_scenario_tc_001() {
//		try {			
//			click("wallet");
//			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "wallet_page"))).isDisplayed();
//			Assert.assertEquals(true,value);	
//			click("home");
//			browser_wait(5);							
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	/*TC_002 User is navigated to the bills page on the clicking bills tab */
//	@Then("User is navigated to the bills page on the clicking bills tab")
//	public void home_page_positive_scenario_tc_002() {
//		try {	
//			click("bills");
//			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "bills_page"))).isDisplayed();
//			Assert.assertEquals(true,value);
//			click("home");  
//			browser_wait(5);				
//		} catch (IOException e) {
//			e.printStackTrace();
//		}	
//	}
//
//	/*TC_003 User is navigated to the award points page on clicking award points tab*/
//	@Then("User is navigated to the award points page on clicking award points tab")
//	public void home_page_positive_scenario_tc_003() {
//		try {	
//			click("award_points");
//			value = driver.findElement(By.xpath(OR_reader("Object_Locator", "award_points_page"))).isDisplayed();
//			Assert.assertEquals(true,value);
//			click("home");  
//			browser_wait(5);				
//		} catch (IOException e) {
//			e.printStackTrace();
//		}	
//	}





//Scenario: Validate that the user is navigated to the payment manage page on clicking wallet tab
//Given Browser is open 
//Then User is navigated to the payment manage page on clicking wallet tab
//
//Scenario: Validate that the user is navigated to the bills page on clicking bills tab  
//Then User is navigated to the bills page on the clicking bills tab
//
//Scenario: Validate that the user is navigated to the award points page on clicking award points tab
//Then User is navigated to the award points page on clicking award points tab


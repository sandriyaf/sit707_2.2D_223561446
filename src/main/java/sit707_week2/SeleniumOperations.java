package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;


public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:/Users/sandr/Downloads/geckodriver-v0.34.0-win-aarch64/geckodriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up Firefox browser.");
		WebDriver driver = new FirefoxDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in firefox browser.
		driver.get(url);
		
		
		// Find first input field which is firstname
		WebElement element = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + element);
		// Send first name
		element.sendKeys("Sandriya");

		// Find  input field which is lastname
		WebElement elementln = driver.findElement(By.id("lastname"));
		System.out.println("Found element: " + elementln);
		// Send first name
		elementln.sendKeys("Fernandes");
				
		//Find input field which is Phone Number 
		WebElement elementpn = driver.findElement(By.id("phoneNumber"));
		System.out.println("Found element: " + elementpn);
		// Send phone number
		elementpn.sendKeys("0493703491");
				
		//Find input field which is Email Address
		WebElement email = driver.findElement(By.id("email"));
		System.out.println("Found element: " + email);
		// Send phone number
		email.sendKeys("sandriyafernandes35@gmail.com");
				
		//Find input field which is password
		WebElement password = driver.findElement(By.id("password"));
		System.out.println("Found element: " + password);
		// Send phone number
		password.sendKeys("San@12345");
				
		//Find input field which is confirm password
		WebElement cfpassword = driver.findElement(By.id("confirmPassword"));
		System.out.println("Found element: " + cfpassword);
		// Send phone number
		cfpassword.sendKeys("San@123");		
				
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		*/
		// Write code
		WebElement createacc = driver.findElement(By.xpath("//button[contains(text(),'Create account')]"));
		System.out.println("Found element: " + createacc);
		// Send phone number
		createacc.click();	
			
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			
			 // Save the screenshot to a file
			  FileUtils.copyFile(screenshotFile, new File("C:/Users/sandr/Downloads/screenshotsan.png"));
			  
			  } 
		catch (Exception e) {
			e.printStackTrace();
			}
			
		// Sleep a while
		sleep(20);
				
		// close chrome driver
		driver.close();	
	}
}
package SeleniumIntelligenceProving;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//In this test case we will use the locators ID, Name,Linked text,Partial Linked Text, ClassName and TagName.
		
		//Launch browser
		WebDriver driver = new ChromeDriver();
		
		//Navigate to facebook.com
		driver.get("https://www.facebook.com");
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Use ID Locator to enter value in Username field
		driver.findElement(By.id("email")).sendKeys("eknathmarathe1993@gmail.com");
		
		//Use Name Locator to enter Password
		driver.findElement(By.name("pass")).sendKeys("testpwd");
		
		//Use LinkText locator to click on 'Forgotten password?' link
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		//Use PartialLinkText locator to click on cancel button link
		//We do not prefer partial LinkText as there can be link elements having text which is matching to the partial linkText. 
		driver.findElement(By.partialLinkText("Cance")).click();
		
        // Click login button by using tagName locator
		//Note: We do not prefer TagName as there can be multiple tags with same TagName e.g. div, li etc.
		driver.findElement(By.tagName("button")).click();
		
		//Close the window
		//driver.quit();
		
		System.out.println("Test Passed");
	}

}

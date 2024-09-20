package SeleniumIntelligenceProving;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //findElements --> Return type is List of elements.
		//If findElements() method locator does not found any element on webpage it returns 0 i.e empty list
		//If findElements method locator found only one element on webpage then it return List with one element.
		
		
		//Launch the browser
	    WebDriver driver = new ChromeDriver();
	    
	    //Navigate to flipkart.com
	    driver.get("https://demo.opencart.com");
	    
	    //Maximize the window
	    driver.manage().window().maximize();
	    
	    //Identify the list of links that can be fetched by attribute className and store in a List
	    List<WebElement> list = driver.findElements(By.className("list-inline-item"));
	    System.out.println("Number of elements with className attribute : " + list.size());
	    
	    //Identify total links on the page
	    //Note: We use TagName and ClassName to fetch list of elements.
	    //elements are stored in list and not in set because elements can be duplicates.
	    
	    List<WebElement> list1 = driver.findElements(By.tagName("aa"));
	    System.out.println("Number of links on the page with TagName attribute : " + list1.size());
	    System.out.println(list1);
	   
	    //Close the window
	    driver.quit();
	   
	}

}

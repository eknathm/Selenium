package SeleniumIntelligenceProving;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch the browser
	       WebDriver driver = new ChromeDriver();
	       
	       //Navigate to the url
	       driver.get("https://www.facebook.com");
	       
	       //Maximize the window
	       driver.manage().window().maximize();
	       
	     //findElement by xpath
	       driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("name1");
	       	       
	       System.out.println("Test Case 5 Passed");
	       
	       driver.quit();
	}

}

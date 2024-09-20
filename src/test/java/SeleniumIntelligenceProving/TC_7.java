package SeleniumIntelligenceProving;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Waits in Selenium
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.oracle.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.facebook.com");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='inputtext _55r1 _6luy']")));
        ele.sendKeys("TestName");
        Wait<WebDriver> Fwait = new FluentWait<WebDriver>(driver)
                                .withTimeout(Duration.ofSeconds(30))
                                .pollingEvery(Duration.ofSeconds(5))
                                .ignoring(NoSuchElementException.class);   
        
		driver.navigate().to("https://www.selenium.com");
		
		
        
	}

}

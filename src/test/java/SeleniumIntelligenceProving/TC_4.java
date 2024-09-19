package SeleniumIntelligenceProving;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Note: Tag is optional in css
		
	   //Launch the browser
       WebDriver driver = new ChromeDriver();
       
       //Navigate to the url
       driver.get("https://www.facebook.com");
       
       //Maximize the window
       driver.manage().window().maximize();
       
       //findElement by css selector tag#id
       driver.findElement(By.cssSelector("input#email")).sendKeys("name1");
       
      //findElement by css selector tag.className
       driver.findElement(By.cssSelector("input.inputtext")).sendKeys("name2");
       
     //findElement by css selector tag[Attribute='value']
       driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy']")).sendKeys("name3");
       
     //findElement by css selector tag[Attribute='value']
       driver.findElement(By.cssSelector("input.inputtext[placeholder='Email address or phone number']")).sendKeys("name4");
       
       System.out.println("Test Passed");
	}

}

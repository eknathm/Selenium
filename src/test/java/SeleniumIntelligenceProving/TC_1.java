package SeleniumIntelligenceProving;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_1 {
	
	
	public static void main(String[] args) {
		
		//1) Launch the Chrome browser
		WebDriver driver = new ChromeDriver();
		
		//2) Get the URL www.facebook.com
		driver.get("https://www.facebook.com");
		
		//3) Validate the title 'facebook – log in or sign up'
		driver.getTitle();
		
		if(driver.getTitle().equals("Facebook – log in or sign up")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		//4) Close the window
		driver.close();
	}

}

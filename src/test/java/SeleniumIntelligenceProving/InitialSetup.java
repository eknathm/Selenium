package SeleniumIntelligenceProving;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class InitialSetup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is selenium framework !");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazon.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.myntra.com");
		driver.switchTo().newWindow(WindowType.WINDOW);
		String handle = driver.getWindowHandle();
		System.out.println("This is a handle" + handle);
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println("AllWindows" + allWindows);

//		driver.navigate().to("https://www.flipkart.com/");
		driver.quit();
	}

}

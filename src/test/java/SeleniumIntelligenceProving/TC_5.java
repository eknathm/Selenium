package SeleniumIntelligenceProving;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		driver.switchTo().newWindow(WindowType.TAB);
	}

}

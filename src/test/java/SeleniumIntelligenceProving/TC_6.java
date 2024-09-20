package SeleniumIntelligenceProving;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//getWindowHandle() --> Return type is String.
		//getWindowHandles() --> Return type is Set of Strings.
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);

	}

}

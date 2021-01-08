package selenium_new_feature;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New_Window {

	
	@Test
	public void getNewWindow() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\api\\Drivers\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.google.com/");
		  driver.switchTo().newWindow(WindowType.WINDOW);
		  
		 Set<String> window =  driver.getWindowHandles();
		 List<String> li = new ArrayList<String>(window);
		 String Parent = li.get(0);
		 String Child = li.get(1);
		 driver.get("https://www.facebook.com/");
		  System.out.println(driver.getTitle());
		  driver.close();
		  
		  driver.switchTo().window(Parent);
		  System.out.println(driver.getTitle());
	}
}

package selenium_new_feature;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class New_Tab {

	
	@Test
	public void getNewTab() {
		
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\api\\Drivers\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.switchTo().newWindow(WindowType.TAB);
	  
	  Set<String> windows =driver.getWindowHandles();
	  
	  List<String> li = new ArrayList<String>(windows);
	  
	  String ParentWindow = li.get(0);
	  String ChildWindow = li.get(1);
	  System.out.println(ParentWindow);
	  System.out.println(ChildWindow);
	  driver.get("https://www.facebook.com/");
	  System.out.println(driver.getTitle());
	  driver.close();
	  driver.switchTo().window(ParentWindow);
	  System.out.println(driver.getTitle());
	}
	
}

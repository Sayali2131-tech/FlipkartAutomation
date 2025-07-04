package BrowserSetup;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import keyword.Keywords;

public class BaseClass {
	
	public static RemoteWebDriver driver = null;

	public static void launchBrowser(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}else if(BrowserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}else if(BrowserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if(BrowserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Keywords.log.info("BrowserLaunched...");
	}
	
	public static void tearDown() {
	  driver.quit();
	}
}

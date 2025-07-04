package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BrowserSetup.BaseClass;

public class InvalidSearchPage {

	   public static By noResultText = By.xpath("//*[contains(text(),'Sorry, no results found!')]");

	

	    public static boolean isNoResultFound() {
	        return BaseClass.driver.findElements(noResultText).size() > 0;
	    }
	}


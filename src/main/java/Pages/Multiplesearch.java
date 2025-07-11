package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import BrowserSetup.BaseClass;
import keyword.Keywords;
import propertyUtil.Property;

public class Multiplesearch{

	public static By Searchfield = By.xpath("//input[@name='q']");
	 
	
	public static void  Entersearch(String SearchText){
		BaseClass.driver.get(Property.getProperty("url"));
		Keywords.getElement(Searchfield).clear();;
		Keywords.log.info("Clearing and entering text: " + SearchText);
	 Keywords.enterText(Searchfield, SearchText);    


	 }
	
   public static void clicksearch() {
	   Keywords.sendSpecialKey(Searchfield,Keys.ENTER);
   }
}

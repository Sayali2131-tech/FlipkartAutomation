package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import BrowserSetup.BaseClass;
import keyword.Keywords;

public class Searchpage {

	public static By Searchtext = By.xpath("//input[@name='q']");
	public static By Homepage = By.xpath("//html[@lang='en-IN']");
	public static By Searchresult = By.xpath("//html[@lang='en']");
	public static By Entireresult = By
			.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]");
	public static By ThirdResult = By
			.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[2]/div[1]");
	public static  By searchBox = By.name("q");
	
	public static void user_enter_the_text_in_the_search_field(String SearchText) {
		
		Keywords.enterText(searchBox,SearchText); 
	}
	
	public static void Search(String Text)

	{
		Keywords.enterText(Searchtext, Text);

	}

	public static void Clicksearch() {
		Keywords.sendSpecialKey(Searchtext, Keys.ENTER);
	}

	public static void homescreen() {
		Keywords.log.info(Keywords.isdisplayed(Homepage));
	}

	public static void Result() {
		Keywords.log.info(Keywords.isdisplayed(Searchresult));
		Keywords.log.info(BaseClass.driver.getTitle());
	}

	public static void printentireresult() {
		Keywords.getText(Entireresult);

	}
}
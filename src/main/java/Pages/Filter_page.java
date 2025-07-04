package Pages;



import org.openqa.selenium.By;

import keyword.Keywords;

public class Filter_page  {
	                         
	public static By MinimunAmount = By.xpath("//*[@id='container']/div/div[3]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[1]/select");
    public static By MaximumAmount = By.xpath("//*[@id='container']/div/div[3]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select");
	public static By Brand = By.xpath("//div[text()='vivo']/preceding-sibling::div");
    public static By Ram = By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[7]/div/div");
    public static By RamValue = By.xpath("//div[text()='3 GB']/preceding-sibling::div");
  
    public static By InternalStorage = By.xpath("//*[@id='container']/div/div[3]/div/div[1]/div/div[1]/div/section[8]/div[1]/div");
    
    public static By InternalStoragevalue = By.xpath("//div[text()='64 - 127.9 GB']/preceding-sibling::div");
    
    public static By afterFilterResult = By.xpath("//*[@id='container']/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]");

	public static void Min() {
		By BeforeFilter= By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[2]/div[1]");
	      String text  = Keywords.getText(BeforeFilter);
	      Keywords.log.info("BEFOR FILTER :" + text);
		
		Keywords.selectDropdownByVisibleText(MinimunAmount, "₹10000");
	}

	public static void Max() {
		Keywords.selectDropdownByVisibleText(MaximumAmount, "₹20000");
	}

	public static void brand() {
		Keywords.click(Brand);

	}

	public static void ram() {
		Keywords.scrollToElement(Ram);
		Keywords.click(RamValue);
	}

	public static void clickbattery() {		
		Keywords.ScrollBy(500);
		Keywords.click(InternalStorage);
		Keywords.waitTillVisible(InternalStoragevalue);
        Keywords.click(InternalStoragevalue);
	}
	
	public static void it_should_display_the_relevant_result() {
		Keywords.log.info("****************************************************");
		String AfterFilter=Keywords.getText(afterFilterResult);
	    Keywords.log.info("After FILTER : "+AfterFilter);
	}

}

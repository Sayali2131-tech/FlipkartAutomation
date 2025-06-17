package com.ReusableFunctions;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseClass.Library;


public class SeleniumReusable extends Library {
	Actions act;
	public SeleniumReusable(WebDriver driver) {

		this.driver = driver;
	
	}

	// Enter the text Element
	public void EnterValue(WebElement element, String Text) 
	{
		try 
		{
			element.sendKeys(Text);
		} 
		catch (Exception e) 
		{
			System.out.println("No such element Exception");
		}
	
		 
	}

	// Click the Element
	public void click(WebElement elemnt) 
	{
		
		try {
			
			elemnt.click();
		} 
		
		catch (Exception e) 
		{
			System.out.println("no susch element Exception");
		}
	}
	
	// get the title of page
	public void gettitle() {
		
		try 
		{
			System.out.println(driver.getTitle());
		} 
		catch (Exception e) 
		{
			System.out.println("couldnt get the Title");
		}

		
	}

	// take a screenshot of the test
	public void screenshot(String path) {

		TakesScreenshot Ts = (TakesScreenshot) driver;
		File source = Ts.getScreenshotAs(OutputType.FILE);
		
		try 
		{
			FileUtils.copyFile(source, new File(path));
		} 
		catch (Exception e) 
		{
			System.out.println("Screenshot not found");
		}

	}
	
    public void MultipleGettext(List<WebElement> element) 
    {
    	List<WebElement> text=element;
		System.out.println(text.size());
		
		for(WebElement textcount:text) {
			String Totallist=textcount.getText();
			System.out.println("**********************");
			System.out.println(Totallist);
		}
	}
    
    public void Getvalue(WebElement element) 
    {
		String Text=element.getText();
		System.out.println(Text);
	}
    
    public void dropdown(WebElement element,String Text)
    
    {
    	Select drp=new Select(element);
    	drp.selectByValue(Text);
		
	}
    
    public void Scrolldown(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    
    public void waits() throws InterruptedException 
    {
		Thread.sleep(2000);
	
	}
    
    public void mousehover(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(element));
            new Actions(driver).moveToElement(element).perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void movelement(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(element));
            new Actions(driver).moveToElement(element).perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void screenshot2(String path) {
    	TakesScreenshot ts=(TakesScreenshot)driver;
          File source=ts.getScreenshotAs(OutputType.FILE); 
          try 
  		{
  			FileUtils.copyFile(source, new File(path));
  		} 
  		catch (Exception e) 
  		{
  			System.out.println("Couldnt take screenshot");
  		}

 }

}
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;

import BrowserSetup.BaseClass;
import keyword.Keywords;
import listeners.MyListener;

@Listeners(MyListener.class)
public class Fashion_page {

    public static By fashionlink = By.xpath("//*[@id='container']//span[normalize-space()='Fashion']");
    public static By kidslink = By.xpath("//a[contains(text(),'Kids')]");
    public static By girlsDressLink = By.linkText("Girls Dresses");
    public static By priceLowToHigh = By.xpath("//div[text()='Price -- Low to High']");

    public static void movefashionlink() throws InterruptedException {
        Keywords.waitTillVisible(fashionlink);

        WebElement fashion = Keywords.getElement(fashionlink); 
        Actions act = new Actions(BaseClass.driver);
        act.moveToElement(fashion).perform();

        Keywords.log.info("move to fashion page");
    }

    public static void movekidslink() throws InterruptedException {
        Keywords.waitTillVisible(kidslink);

        WebElement kids = Keywords.getElement(kidslink); 
        Actions act = new Actions(BaseClass.driver);
        act.moveToElement(kids).perform();

        Keywords.log.info("move to kids page");
    }

    public static void clickgirlslink() throws InterruptedException {
        Keywords.waitTillVisible(girlsDressLink);

        WebElement girls = Keywords.getElement(girlsDressLink); 
        Actions act = new Actions(BaseClass.driver);
        act.moveToElement(girls).click().perform();

        Keywords.log.info("move to girls section");
    }

    public static void clickprice() throws InterruptedException {
        Keywords.waitTillClickable(priceLowToHigh);

        WebElement price = Keywords.getElement(priceLowToHigh); 
        Actions act = new Actions(BaseClass.driver);
        act.moveToElement(price).click().perform();

        Keywords.log.info("price changed to low to high");
    }
}

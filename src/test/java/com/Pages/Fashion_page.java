package com.Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseClass.Library;

public class Fashion_page extends Library {

    public Fashion_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='container']//span[normalize-space()='Fashion']")
    WebElement fashionlink;

    @FindBy(xpath = "//a[contains(text(),'Kids')]")  
    WebElement kidslink;

    @FindBy(linkText = "Girls Dresses")
    WebElement girlsDressLink;

    @FindBy(xpath = "//div[text()='Price -- Low to High']")
    WebElement priceLowToHigh;

    public void movefashionlink() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(fashionlink));

        Actions act = new Actions(driver);
        act.moveToElement(fashionlink).perform();
    }

    public void movekidslink() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(kidslink));

        Actions act = new Actions(driver);
        act.moveToElement(kidslink).perform();
    }

    public void clickgirlslink() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(girlsDressLink));

        Actions act = new Actions(driver);
        act.moveToElement(girlsDressLink).click().perform();
    }

    public void clickprice() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(priceLowToHigh));

        Actions act = new Actions(driver);
        act.moveToElement(priceLowToHigh).click().perform();
    }
}

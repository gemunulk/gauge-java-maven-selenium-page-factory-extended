package com.aut.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected static String Url = System.getenv("APP_ENDPOINT");
    public final WebDriver driver;

    public BasePage(){
        //this.driver = DriverFactory.getDriver();
        this.driver = PageFactory.driver;
    }

    public void sendKeys(By locator, String text){
        new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(locator));
        this.driver.findElement(locator).clear();
        this.driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator){
        new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(locator));
        this.driver.findElement(locator).click();
    }

    public void selectByVisibleText(By locator, String visibleText){
        new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(locator));
        Select select = new Select(this.driver.findElement(locator));
        select.selectByVisibleText(visibleText);

    }

    public String getText(By locator){
        new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(locator));
        return this.driver.findElement(locator).getText();
    }


}

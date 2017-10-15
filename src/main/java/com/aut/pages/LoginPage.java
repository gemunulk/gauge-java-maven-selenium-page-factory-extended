package com.aut.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage extends BasePage {

    // Login Page locators
    private static By usernameText = By.xpath("//input[@name='userName']");
    private static By passwordText = By.xpath("//input[@name='password']");
    private static By loginButton  = By.xpath("//input[@name='login']");

    public void visit(){
        driver.get(Url);
    }

    public void login(String username, String password){
        sendKeys(LoginPage.usernameText, username);
        sendKeys(LoginPage.passwordText, password);
        click(LoginPage.loginButton);
    }


}

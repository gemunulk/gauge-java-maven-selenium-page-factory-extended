package com.aut.pages;

import com.thoughtworks.gauge.BeforeSuite;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;

public class PageFactory extends org.openqa.selenium.support.PageFactory {

    public static WebDriver driver;

    public static LoginPage loginPage;
    public static LogoutPage logoutPage;
    public static RegistrationPage registrationPage;
    public static CreateAccountSuccessPage createAccountSuccessPage;

    @BeforeSuite
    public void init(){
        driver          = DriverFactory.getDriver();

        loginPage       = PageFactory.initElements(driver, LoginPage.class);
        logoutPage      = PageFactory.initElements(driver, LogoutPage.class);
        registrationPage = PageFactory.initElements(driver, RegistrationPage.class);
        createAccountSuccessPage = PageFactory.initElements(driver, CreateAccountSuccessPage.class);
    }

}

package com.aut.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;


public class RegistrationPage extends BasePage {

    // Registration Page locators
    private static By firstNameText = By.xpath("//input[@name='firstName']");
    private static By lastNameText  = By.xpath("//input[@name='lastName']");
    private static By address1Text  = By.xpath("//input[@name='address1']");
    private static By address2Text  = By.xpath("//input[@name='address2']");
    private static By countryDropdown = By.xpath("//select[@name='country']");
    private static By submitButton  = By.xpath("//input[@name='register']");


    public void visit(){
        driver.get(Url.concat("/mercuryregister.php"));
        driver.manage().window().maximize();
    }

    public void fillContactInformationSection(String firstName, String lastName, String phoneNumber, String email){
        sendKeys(RegistrationPage.firstNameText, firstName);
        sendKeys(RegistrationPage.lastNameText, lastName);
    }

    public void fillMailingInformationSection(String address1, String address2, String city, String stateProvince, String postCode, String country){
        sendKeys(RegistrationPage.address1Text, address1);
        sendKeys(RegistrationPage.address2Text, address2);
        selectByVisibleText(RegistrationPage.countryDropdown, country);
    }

    public void submitUserRegistrationFrom(){
        click(RegistrationPage.submitButton);
    }


}

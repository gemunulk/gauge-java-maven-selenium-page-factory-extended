package com.aut.pages;

import com.thoughtworks.gauge.Gauge;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class CreateAccountSuccessPage extends BasePage {

    private static By firstNameText  = By.xpath("//b");

    public void visit(){
        driver.get(Url.concat("/create_account_success.php"));
    }
    

    public String getActualFirstName(){
        
        String actualFirstName = null;
        actualFirstName = getText(CreateAccountSuccessPage.firstNameText);
        return actualFirstName;
    }

    public void validateFirstNameIs(String expectedFirstName){

        String actualFirstName = getActualFirstName();
        Gauge.writeMessage(actualFirstName);

        assert expectedFirstName == actualFirstName;
    }


}

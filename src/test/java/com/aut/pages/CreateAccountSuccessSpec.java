package com.aut.pages;

import com.thoughtworks.gauge.Step;

public class CreateAccountSuccessSpec {
    @Step("Validate username is <firstName>")
    public void validateUsername(String firstName) {

        PageFactory.createAccountSuccessPage.validateFirstNameIs(firstName);

    }
}

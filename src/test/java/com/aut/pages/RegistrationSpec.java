package com.aut.pages;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;

public class RegistrationSpec {
    @Step("On User Registration Page")
    public void visitUserRegistrationPage() {
        PageFactory.registrationPage.visit();
    }

    @Step("Fill Contact Information section <table>")
    public void fillContactInformationSection(Table table) {

        for (TableRow row : table.getTableRows()) {

            PageFactory.registrationPage.fillContactInformationSection(
                    row.getCell("FirstName"),
                    row.getCell("LastName"),
                    row.getCell("Phone"),
                    row.getCell("Email")
            );

        }


    }

    @Step("Fill Mailing Information section <table>")
    public void fillMailingInfo(Table table) {

        for (TableRow row : table.getTableRows()) {

            PageFactory.registrationPage.fillMailingInformationSection(
                    row.getCell("Address1"),
                    row.getCell("Address2"),
                    row.getCell("City"),
                    row.getCell("State/Province"),
                    row.getCell("PostCode"),
                    row.getCell("Country")
            );

        }


    }

    @Step("Submit user registration form")
    public void implementation4() {
        PageFactory.registrationPage.submitUserRegistrationFrom();
    }
}

package com.epam.ivalua.stepdefinitions;

import com.epam.ivalua.pagesteps.LoginPageSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class Login {

    @Autowired
    public LoginPageSteps loginPageSteps;

    @Given("^I am on the Login screen$")
    public void givenIamOnTheLoginScreen() {
        loginPageSteps.navigateToLoginPage();
    }

    @When("^I enter the following for Login$")
    public void whenIEnterTheFollowingForLogin(DataTable dataTable) {
        loginPageSteps.enterUserNameAndPassword(dataTable);
    }

    @And("^I click on Login button$")
    public void whenIClickOnLoginButton() {
        loginPageSteps.clickOnLogin();
    }

    @Then("^I should be redirected to the Homepage$")
    public void thenIShouldBeRedirectedToTheHomePage() {
        loginPageSteps.navigateToHomePage();
    }

    @Then("^I should not be redirected to the Homepage$")
    public void thenIShouldNotBeRedirectedToTheHomePage() {
        loginPageSteps.navigateToLoginPage();
    }
}
package org.example.step_def;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pages.LoginPage;
import org.example.pages.LoginsPage;

public class LogInWithInvalidEmailSteps {
    LoginPage loginPage=new LoginPage();
    LoginsPage loginsPage=new LoginsPage();
    @Then("^I click on log in on login pages$")
    public void i_click_on_log_in_on_login_page() throws Throwable {
        loginPage.clickOnLoginSubmitButton();

    }
    @Then("^I will Enter Invalid Email \"([^\"]*)\" But Valid Password \"([^\"]*)\"$")
    public void i_will_Enter_Invalid_Email_But_Valid_Password(String email, String pass) throws Throwable {
    loginPage.enterEmailAndPassword(email, pass);
    }



}

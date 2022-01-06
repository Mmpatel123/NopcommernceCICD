package org.example.step_def;

import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pages.LoginPage;
import org.example.pages.LoginsPage;
import org.example.pages.ProductListPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;

public class LogIn {
    LoginPage loginPage=new LoginPage();
    LoginsPage loginsPage=new LoginsPage();
    ProductListPage productListPage=new ProductListPage();
    @And("^I click on log in on login pages$")
    public void i_click_on_log_in_on_login_page() throws Throwable {
        loginPage.clickOnLoginSubmitButton();

    }
    @And("^I will Enter Invalid Email \"([^\"]*)\" But Valid Password \"([^\"]*)\"$")
    public void i_will_Enter_Invalid_Email_But_Valid_Password(String email, String pass) throws Throwable {
    loginPage.enterEmailAndPassword(email, pass);
    }
    @And("^I will Enter valid Email \"([^\"]*)\" But Invalid Password \"([^\"]*)\"$")
    public void il_will_Enter_Invalid_Email_But_Valid_Password(String email, String pass) throws Throwable {
        loginPage.enterEmailAndPassword(email, pass);
    }
    @Given("^I will Enter Empty email \"([^\"]*)\" But Valid Password \"([^\"]*)\"$")
    public void i_will_Enter_Empty_email_But_Valid_Password(String email, String pass) throws Throwable {

   loginPage.enterEmailAndPassword(email,pass);
    }

    @Given("^I will Valid email \"([^\"]*)\" But empty Password \"([^\"]*)\"$")
    public void il_will_Enter_Empty_email_But_Valid_Password(String email, String pass) throws Throwable {

        loginPage.enterEmailAndPassword(email,pass);
    }
    @Then("^I should see \"([^\"]*)\" Text on result pages$")
    public void i_should_see_text_on_result_page(String expText) {
        String actualTextOnPlp=productListPage.EmailWrong();
        System.out.println(actualTextOnPlp);
        assertThat(actualTextOnPlp, is(equalToIgnoringCase(expText)));
    }
    @When("^I enter emails \"([^\"]*)\" and passwords \"([^\"]*)\"$")
    public void i_enter_email_and_password(String email, String password) throws Throwable {
        loginPage.enterEmailAndPassword(email, password);
    }
    @Then("^I should see \"([^\"]*)\" Text on Result pages$")
    public void i_should_see_text_on_result_pages(String expText) {
        String actualTextOnPlp=productListPage.wrong();
        System.out.println(actualTextOnPlp);
        assertThat(actualTextOnPlp, is(equalToIgnoringCase(expText)));
    }

}

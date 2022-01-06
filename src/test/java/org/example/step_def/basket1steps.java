package org.example.step_def;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.Basket1Page;
import org.example.pages.HomePage;
import org.example.pages.ProductListPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.StringContains.containsString;

public class basket1steps extends DriverManager {
    DriverManager driverManager=new DriverManager();
    Basket1Page basket1Page=new Basket1Page();
        HomePage homePage=new HomePage();
        ProductListPage productListPage=new ProductListPage();

@Then("^I will wait$")
    public void i_will_wait() throws InterruptedException {
    Thread.sleep(5000L);
}

    @When("^I click on the \"([^\"]*)\" button$")
    public void iClickOnTheButton(String buttonName) throws Throwable {
        switch (buttonName){
            case "Contact Us":
                basket1Page.ClickOnContactUsButtons();
                break;
            case "Jewelry":
                homePage.clickOnJewelry();
                break;
            case "Register":
                homePage.clickOnRegister();
                break;
            case "Log in":
                homePage.clickOnLogIn();
                break;
            case "Electronics":
                homePage.ClickOnElectronicsButton();
                break;

            default:
                throw new IllegalAccessException("Unexpected header button");
        }


    }
    @Then("^I should see \"([^\"]*)\" Text on result page$")
    public void i_should_see_text_on_result_page(String expText) throws Throwable {
        String actualTextOnPlp=productListPage.getTextFromListPage();
        System.out.println(actualTextOnPlp);
        assertThat(actualTextOnPlp, is(equalToIgnoringCase(expText)));
    }
    @Then("^the url should contain with \"([^\"]*)\" button$")
    public void the_url_should_contain_with(String expUrl) throws Throwable {
        String actualUrl= driverManager.getUrl();
        assertThat(actualUrl, containsString(expUrl));

    }
}

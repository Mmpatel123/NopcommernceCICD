package org.example.step_def;

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
    Thread.sleep(1000L);
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


            default:
                throw new IllegalAccessException("Unexpected header button");
        }


    }
    @Then("^I should see \"([^\"]*)\" Text on result page$")
    public void i_should_see_text_on_result_page(String expText) {
        String actualTextOnPlp=productListPage.getTextFromListPage();
        System.out.println(actualTextOnPlp);
        assertThat(actualTextOnPlp, is(equalToIgnoringCase(expText)));
    }
    @Then("^the url should contain with \"([^\"]*)\" button$")
    public void the_url_should_contain_with(String expUrl) {
        String actualUrl= driverManager.getUrl();
        assertThat(actualUrl, containsString(expUrl));

    }
    @Then("^i will enter my name \"([^\"]*)\" my Email \"([^\"]*)\" and the enquiry is \"([^\"]*)\"$")
    public void i_will_enter_my_name_my_Email_and_the_enquiry_is(String name, String email, String enquiry) throws Throwable {
       basket1Page.EnterMyNameMyEmailAndEnquiry(name,email,enquiry);

    }
    @Then("^Click on the submit button$")
    public void click_on_the_submit_button() throws Throwable {
     basket1Page.ClickOnSubmitBtn();

    }
    @Then("^I should she \"([^\"]*)\" Text$")
    public void i_should_she_Text(String arg1) throws Throwable {
String ValidateMyEnquiry= basket1Page.Validation();
        System.out.println(ValidateMyEnquiry);
        assertThat(ValidateMyEnquiry,is(equalToIgnoringCase("Your enquiry has been successfully sent to the store owner.")));

    }


}

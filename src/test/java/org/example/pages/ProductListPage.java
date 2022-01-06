package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductListPage extends DriverManager {
    @FindBy(css = "#Email-error")
    private WebElement emailError;
    @FindBy(css = ".page-title")
    private WebElement textOnListPage;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]/ul/li")
    private WebElement WrongThings;

    public String getTextFromListPage() {

        return textOnListPage.getText();
    }

    public String EmailWrong() {
        return emailError.getText();
    }
    public String wrong(){
        return  WrongThings.getText();
    }
}
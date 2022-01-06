package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginsPage {
    @FindBy(id = "Email")
    public WebElement EMAILS;

    @FindBy(id = "Password")
    public WebElement PASSWORD;

    public void EmailAndPassword(String Password,String Email){
        EMAILS.sendKeys(Email);
        PASSWORD.sendKeys(Password);
    }

}

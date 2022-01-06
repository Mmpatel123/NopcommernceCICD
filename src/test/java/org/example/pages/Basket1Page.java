package org.example.pages;

import org.example.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Basket1Page extends DriverManager {
@FindBy(id = "FullName")
private WebElement MyName;

@FindBy(id = "Email")
private WebElement MyEmail;

@FindBy(id = "Enquiry")
private WebElement Enquiry;

@FindBy(xpath = "//*[@name='send-email']")
private  WebElement SubmitBtn;

@FindBy(linkText = "Contact us")
private WebElement ContactUsButton;

@FindBy(xpath = "//*[@class='result']")
private WebElement ValidationText;

    public void ClickOnContactUsButtons(){
        ContactUsButton.click();
    }
    public void EnterMyNameMyEmailAndEnquiry(String myName,String myEmail,String enquiry){
        MyName.sendKeys(myName);
        MyEmail.sendKeys(myEmail);
        Enquiry.sendKeys(enquiry);
    }
    public void ClickOnSubmitBtn(){
        SubmitBtn.click();
    }
    public String Validation(){
        return ValidationText.getText();

    }
}

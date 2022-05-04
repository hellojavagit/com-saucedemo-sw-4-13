package login.com.herokuapp.internet_the.pages;

import login.com.herokuapp.internet_the.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By textToCompare = By.xpath("//body[1]/div[2]/div[1]/div[1]/h2[1]");
    By emailField = By.id("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[@class='radius']");
    By errorMessage = By.xpath("//div[@id='flash']");


    //public String getWelcomeText() {
        //return getTextFromElement(welcomeText);
    //}
    public String getTextToCompare() {
        return getTextFromElement(textToCompare);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }
}

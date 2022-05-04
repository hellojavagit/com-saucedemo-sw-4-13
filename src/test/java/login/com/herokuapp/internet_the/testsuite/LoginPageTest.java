package login.com.herokuapp.internet_the.testsuite;

import login.com.herokuapp.internet_the.pages.LoginPage;
import login.com.herokuapp.internet_the.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage = new LoginPage();

   @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginPage.enterEmailId("tomsmith");
        loginPage.enterPassword("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Secure Area";
        String  actualErrorMessage = loginPage.getTextToCompare();
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage,"Messages does not match");

    }
   @Test
    public void verifyTheUsernameErrorMessage(){
       loginPage.enterEmailId("tomsmith1");
       loginPage.enterPassword("SuperSecretPassword");
       loginPage.clickOnLoginButton();
       String expectedErrorMessage = "Your username is invalid!\n"+"×";
       String  actualErrorMessage = loginPage.getErrorMessage();
       Assert.assertEquals(actualErrorMessage,expectedErrorMessage,"InvalidUserName");

    }
    @Test
    public void  verifyThePasswordErrorMessage(){
        loginPage.enterEmailId("tomsmith");
        loginPage.enterPassword("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Your password is invalid!\n"+"×";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage,"InvalidPassWord");

    }

}

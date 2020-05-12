package login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTest {

    @Test
    public void testSuccessfullLogin(){
        LoginPage loginPage = homePage.clickOnFormAuthenticationLink();
        SecureAreaPage secureAreaPage = loginPage.loginAs("tomsmith","SuperSecretPassword!");

        Assert.assertTrue(secureAreaPage.getSuccessAlertMessage().contains("You logged into a secure area!"));
    }
}

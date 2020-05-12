package login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeePage;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    @Test
    public void testSuccesfulLogin(){
        LoginPage loginPage = new LoginPage(webDriver);
        EmployeePage employeePage = loginPage.loginAs("user1","admin");
        Assert.assertTrue(employeePage.isEmployeePageDisplayed());
    }
}

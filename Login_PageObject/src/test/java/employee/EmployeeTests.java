package employee;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeePage;
import pages.LoginPage;

public class EmployeeTests extends BaseTest {

    @Test
    public void testAddEmployee(){
        LoginPage loginPage = new LoginPage(webDriver);
        EmployeePage employeePage = loginPage.loginAs("user","123");
        employeePage.addEmployee("Juan","Juan@gmail.com","125463","5222");
        Assert.assertTrue(employeePage.isAlertPresent());
    }
}

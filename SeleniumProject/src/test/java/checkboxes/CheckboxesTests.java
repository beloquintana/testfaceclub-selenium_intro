package checkboxes;

import base.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pages.CheckboxesPage;

public class CheckboxesTests extends BaseTest {

    @Test
    public void testCheckCheckbox1(){
        CheckboxesPage checkboxesPage = homePage.clickOnCheckboxesLink();
        Reporter.log("Checkbox1Status: " + checkboxesPage.getCheckbox1Status());
        checkboxesPage.clickOnCheckbox1();
        Reporter.log("Checkbox1Status: " + checkboxesPage.getCheckbox1Status());
        Assert.assertTrue(checkboxesPage.getCheckbox1Status());
    }

    @Test
    public void testUnCheckCheckbox2(){
        CheckboxesPage checkboxesPage = homePage.clickOnCheckboxesLink();
        Reporter.log("Checkbox2Status: " + checkboxesPage.getCheckbox2Status());
        checkboxesPage.clickOnCheckbox2();
        Reporter.log("Checkbox2Status: " + checkboxesPage.getCheckbox2Status());
        Assert.assertFalse(checkboxesPage.getCheckbox2Status());
    }
}

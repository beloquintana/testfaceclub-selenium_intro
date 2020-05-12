package addAndRemoveElements;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddAndRemoveElementsPage;

public class RemoveElementTests extends BaseTest {

    private AddAndRemoveElementsPage addAndRemoveElementsPage;

    @BeforeMethod
    public void addElement(){
        addAndRemoveElementsPage = homePage.clickOnAddAndRemoveElementsLink();
        addAndRemoveElementsPage.clickOnAddElementButton();
    }

    @Test
    public void testRemoveElement(){
        int expectedElementCount = addAndRemoveElementsPage.getButtonElementsCount() - 1;
        addAndRemoveElementsPage.removeElement(1);
        Assert.assertEquals(addAndRemoveElementsPage.getButtonElementsCount(), expectedElementCount);
    }
}

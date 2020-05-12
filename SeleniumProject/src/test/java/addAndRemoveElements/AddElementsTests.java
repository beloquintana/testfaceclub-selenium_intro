package addAndRemoveElements;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddAndRemoveElementsPage;

public class AddElementsTests extends BaseTest {

    @Test
    public void testAddElement() {
        AddAndRemoveElementsPage addAndRemoveElementsPage = homePage.clickOnAddAndRemoveElementsLink();
        addAndRemoveElementsPage.clickOnAddElementButton();

        Assert.assertEquals(addAndRemoveElementsPage.getButtonElementsCount(), 1);
    }
}


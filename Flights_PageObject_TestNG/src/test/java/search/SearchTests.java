package search;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ResultSearchPage;
import pages.SearchPage;

public class SearchTests extends BaseTest {

    @Test
    public void testSearch(){
        SearchPage searchPage = new SearchPage(webDriver);
        ResultSearchPage resultSearchPage = searchPage.search(true,"Montevideo (MVD)","Buenos Aires (BUE)","06/25/2020",
                "09/10/2020","Primera","2");

        Assert.assertTrue(resultSearchPage.getResultCount() >= 1);
    }
}

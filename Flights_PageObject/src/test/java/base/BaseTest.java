package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ConfirmationPage;
import pages.PaymentPage;
import pages.ResultSearchPage;
import pages.SearchPage;

public class BaseTest {
    private WebDriver webDriver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://testfaceclub.com/aut-vuelos/");

        SearchPage searchPage = new SearchPage(webDriver);
        ResultSearchPage resultSearchPage = searchPage.search(true,"Montevideo (MVD)","Buenos Aires (BUE)","06/25/2020",
                "09/10/2020","Primera","2");

        PaymentPage paymentPage = resultSearchPage.selectFirstTravel();

        ConfirmationPage confirmationPage = paymentPage.payTravel("Maestro","456678952359","123","10","2024",
                "Juan","Patricio","Cuba");

        webDriver.quit();
    }

    public static void main(String arg[]){
        BaseTest baseTest = new BaseTest();
        baseTest.setUp();
    }
}

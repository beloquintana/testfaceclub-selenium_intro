package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.EmployeePage;
import pages.LoginPage;

public class BaseTest {
    protected WebDriver webDriver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://testfaceclub.com/ejercicios/");
    }

    @AfterMethod
    public void tearDown(){
        if(webDriver != null)
            webDriver.quit();
    }
}

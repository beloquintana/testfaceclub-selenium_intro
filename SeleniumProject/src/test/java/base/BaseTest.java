package base;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.io.File;
import java.io.IOException;

public class BaseTest {
    protected WebDriver webDriver;
    protected HomePage homePage;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        webDriver = new ChromeDriver();

        webDriver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(webDriver);
    }

    @AfterMethod
    public void tearDown(ITestResult result){
        Reporter.setCurrentTestResult(result);
        if(ITestResult.FAILURE == result.getStatus()){
            Reporter.log("Failed Test " + result.getThrowable().getMessage());
            String imagePath = takeScreenShot(result.getName());
            Reporter.log("<br><img src='../" + imagePath + "'/><br>");
        }

        if(webDriver != null)
            webDriver.quit();
    }

    private String takeScreenShot(String imagesName){
        TakesScreenshot takesScreenshot = (TakesScreenshot)webDriver;
        File screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String imagePath = "resources/screenshots/" + imagesName +".png";
        try {
            Files.move(screenshot, new File(imagePath));
            return imagePath;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}

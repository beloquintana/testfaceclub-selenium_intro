package dynamic.loading;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class DynamicLoadingTests {
    private WebDriver webDriver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://the-internet.herokuapp.com/");

        WebElement linkDynamicLoading = webDriver.findElement(By.linkText("Dynamic Loading"));
        linkDynamicLoading.click();

        WebElement linkExample1 = webDriver.findElement(By.linkText("Example 1: Element on page that is hidden"));
        linkExample1.click();

        WebElement buttonStart = webDriver.findElement(By.xpath("//*[@id=\"start\"]/button"));
        buttonStart.click();

        WebElement textElement = webDriver.findElement(By.xpath("//*[@id=\"finish\"]/h4"));

        WebDriverWait wait = new WebDriverWait(webDriver, 5);
        wait.until(ExpectedConditions.visibilityOf(textElement));

        System.out.println(textElement.getText());
        takeScreenShot("DynamicLoadingTests");

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

    public static void main(String[] args) {
        DynamicLoadingTests dynamicLoadingTests = new DynamicLoadingTests();
        dynamicLoadingTests.setUp();
    }
}

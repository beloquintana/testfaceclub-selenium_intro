package dynamic.loading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

        webDriver.quit();
    }

    public static void main(String[] args) {
        DynamicLoadingTests dynamicLoadingTests = new DynamicLoadingTests();
        dynamicLoadingTests.setUp();
    }
}

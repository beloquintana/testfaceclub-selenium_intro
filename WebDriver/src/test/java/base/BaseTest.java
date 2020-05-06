package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTest {
    private WebDriver webDriver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://the-internet.herokuapp.com/");
        System.out.println(webDriver.getTitle());
        webDriver.manage().window().maximize();

        List<WebElement> list = webDriver.findElements(By.tagName("a"));
        System.out.println("Cantidad de links: " + list.size());

        WebElement inputLink = webDriver.findElement(By.linkText("Inputs"));
        inputLink.click();

        WebElement input = webDriver.findElement(By.tagName("input"));
        input.sendKeys("586");

        webDriver.quit();
    }

    public static void main(String[] args) {
        BaseTest baseTest = new BaseTest();
        baseTest.setUp();
    }
}

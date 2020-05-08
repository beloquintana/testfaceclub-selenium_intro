package menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ShiftingContentTest {
    private WebDriver webDriver;

    private void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://the-internet.herokuapp.com/");

        WebElement link = webDriver.findElement(By.linkText("Shifting Content"));
        link.click();

        WebElement linkExample1 = webDriver.findElement(By.linkText("Example 1: Menu Element"));
        linkExample1.click();

        List<WebElement> elements = webDriver.findElements(By.xpath("//*[@id='content']/div/ul/li"));
        for (int i=0;i<elements.size();i++){
            System.out.println(elements.get(i).getText());
        }

        webDriver.quit();
    }

    public static void main(String arg[]){
        ShiftingContentTest shiftingContentTest = new ShiftingContentTest();
        shiftingContentTest.setUp();
    }
}

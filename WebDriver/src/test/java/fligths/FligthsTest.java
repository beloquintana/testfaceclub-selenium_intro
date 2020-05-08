package fligths;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FligthsTest {
    private WebDriver webDriver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://testfaceclub.com/aut-vuelos/");

        search();

        webDriver.quit();
    }

    private void search(){
        WebElement radioButton = webDriver.findElement(By.name("optradio2"));
        radioButton.click();

        Select fromSelect = new Select(webDriver.findElement(By.id("from")));
        fromSelect.selectByVisibleText("Montevideo (MVD)");

        Select toSelect = new Select(webDriver.findElement(By.id("to")));
        toSelect.selectByVisibleText("Buenos Aires (BUE)");

        WebElement dateFromInput = webDriver.findElement(By.xpath("//*[@ng-model=\"dateFrom\"]"));
        dateFromInput.sendKeys("06/25/2020");
        dateFromInput.sendKeys(Keys.ENTER);

        WebElement dateToInput = webDriver.findElement(By.xpath("//*[@ng-model=\"dateto\"]"));
        dateToInput.sendKeys("09/10/2020");
        dateToInput.sendKeys(Keys.ENTER);

        Select classSelect = new Select(webDriver.findElement(By.id("classId")));
        classSelect.selectByVisibleText("Primera");

        Select passengerSelect = new Select(webDriver.findElement(By.id("passenger")));
        passengerSelect.selectByVisibleText("2");

        WebElement searchButton = webDriver.findElement(By.tagName("button"));
        searchButton.click();
    }

    public static void main(String arg[]){
        FligthsTest baseTest = new FligthsTest();
        baseTest.setUp();
    }
}

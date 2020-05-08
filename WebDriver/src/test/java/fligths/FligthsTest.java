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
        selectTravel();
        payTravel();

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

    private void selectTravel(){
        WebElement optionOne = webDriver.findElement(By.xpath("//*[@id='flights']/div[1]/a"));
        optionOne.click();
    }

    private void payTravel() {
        Select cardTypeSelect = new Select(webDriver.findElement(By.id("cards")));
        cardTypeSelect.selectByVisibleText("Maestro");

        WebElement cardNumberInput = webDriver.findElement(By.id("cardNumber"));
        cardNumberInput.sendKeys("456678952359");

        WebElement codeInput = webDriver.findElement(By.id("code"));
        codeInput.sendKeys("123");

        Select monthSelect = new Select(webDriver.findElement(By.id("month")));
        monthSelect.selectByVisibleText("10");

        Select yearSelect = new Select(webDriver.findElement(By.id("year")));
        yearSelect.selectByVisibleText("2024");

        WebElement nameInput = webDriver.findElement(By.xpath("//*[@id='paymentMethod']/div[2]/div[1]/input"));
        nameInput.sendKeys("Juan");

        WebElement lastNameInput = webDriver.findElement(By.xpath("//*[@id='paymentMethod']/div[2]/div[2]/input"));
        lastNameInput.sendKeys("Patricio");

        Select countrySelect = new Select(webDriver.findElement(By.id("country")));
        countrySelect.selectByVisibleText("Cuba");

        WebElement payButton = webDriver.findElement(By.xpath("//*[@id='paymentMethod']//button"));
        payButton.click();
    }

    public static void main(String arg[]){
        FligthsTest baseTest = new FligthsTest();
        baseTest.setUp();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {
    private By radioButton = By.name("optradio2");
    private By formSelect = By.id("from");
    private By toSelect = By.id("to");
    private By dateFromInput = By.xpath("//*[@id='mainpanel']/div[2]/form/div[2]/div[3]//input");
    private By dateToInput = By.xpath("//*[@id='mainpanel']/div[2]/form/div[2]/div[4]//input");
    private By classSelect = By.id("classId");
    private By passengerSelect = By.id("passenger");
    private By searchButton = By.tagName("button");

    public SearchPage(WebDriver webDriver){
        super(webDriver);
    }

    private void typeAndEnter(String text, By elementBy){
        WebElement element = webDriver.findElement(elementBy);
        element.sendKeys(text);
        element.sendKeys(Keys.ENTER);
    }

    public ResultSearchPage search(boolean oneWay, String origin, String dest, String dateFrom, String dateTo, String classValue,
                                   String passengerNumber){
        if(oneWay == true)
            webDriver.findElement(radioButton).click();
        selectByVisibleText(origin, formSelect);
        selectByVisibleText(dest, toSelect);
        typeAndEnter(dateFrom, dateFromInput);
        typeAndEnter(dateTo, dateToInput);
        selectByVisibleText(classValue, classSelect);
        selectByVisibleText(passengerNumber, passengerSelect);
        webDriver.findElement(searchButton).click();
        return new ResultSearchPage(webDriver);
    }
}

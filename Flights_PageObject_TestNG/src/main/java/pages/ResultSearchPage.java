package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultSearchPage extends BasePage {
    private By optionOne = By.xpath("//*[@id='flights']/div[1]/a");
    private By optionList = By.xpath("//*[@id='flights']/div");

    public ResultSearchPage(WebDriver webDriver){
        super(webDriver);
    }

    public PaymentPage selectFirstTravel(){
        webDriver.findElement(optionOne).click();
        return new PaymentPage(webDriver);
    }

    public int getResultCount(){
        List<WebElement> list = webDriver.findElements(optionList);
        return list.size();
    }
}

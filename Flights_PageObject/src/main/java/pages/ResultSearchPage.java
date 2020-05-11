package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultSearchPage extends BasePage {
    private By optionOne = By.xpath("//*[@id='flights']/div[1]/a");

    public ResultSearchPage(WebDriver webDriver){
        super(webDriver);
    }

    public PaymentPage selectFirstTravel(){
        webDriver.findElement(optionOne).click();
        return new PaymentPage(webDriver);
    }
}

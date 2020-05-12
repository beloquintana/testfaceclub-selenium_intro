package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage extends BasePage {
    private By cardTypeSelect = By.id("cards");
    private By cardNumberInput = By.id("cardNumber");
    private By codeInput = By.id("code");
    private By monthSelect = By.id("month");
    private By yearSelect = By.id("year");
    private By nameInput = By.xpath("//*[@id='paymentMethod']/div[2]/div[1]/input");
    private By lastNameInput = By.xpath("//*[@id='paymentMethod']/div[2]/div[2]/input");
    private By countrySelect = By.id("country");
    private By payButton = By.xpath("//*[@id='paymentMethod']//button");

    public PaymentPage(WebDriver webDriver){
        super(webDriver);
    }

    public ConfirmationPage payTravel(String card, String cardNumber, String code, String month, String year, String name,
                                      String lastName, String country){
        selectByVisibleText(card,cardTypeSelect);
        webDriver.findElement(cardNumberInput).sendKeys(cardNumber);
        webDriver.findElement(codeInput).sendKeys(code);
        selectByVisibleText(month,monthSelect);
        selectByVisibleText(year,yearSelect);
        webDriver.findElement(nameInput).sendKeys(name);
        webDriver.findElement(lastNameInput).sendKeys(lastName);
        selectByVisibleText(country,countrySelect);
        webDriver.findElement(payButton).click();
        return new ConfirmationPage(webDriver);
    }
}

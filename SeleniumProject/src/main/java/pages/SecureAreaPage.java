package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage extends BasePage {
    private By successAlert = By.id("flash");

    public SecureAreaPage(WebDriver webDriver){
        super(webDriver);
    }

    public String getSuccessAlertMessage(){
        return webDriver.findElement(successAlert).getText();
    }
}

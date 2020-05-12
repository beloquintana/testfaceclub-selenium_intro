package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private By userNameInput = By.id("username");
    private By passwordInput = By.id("password");
    private By loginButton = By.xpath("//*[@id=\"login\"]/button");

    public LoginPage(WebDriver webDriver){
        super(webDriver);
    }

    public SecureAreaPage loginAs(String userName, String password){
        webDriver.findElement(userNameInput).sendKeys(userName);
        webDriver.findElement(passwordInput).sendKeys(password);
        webDriver.findElement(loginButton).click();
        return new SecureAreaPage(webDriver);
    }
}

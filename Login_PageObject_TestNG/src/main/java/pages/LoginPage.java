package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver webDriver;
    private By userInput = By.id("user");
    private By passWordInput = By.id("pass");
    private By loginButton = By.id("loginButton");

    public LoginPage(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void typeUserName(String user){
        WebElement element = webDriver.findElement(userInput);
        element.sendKeys(user);
    }

    public void typePassWord(String passWord){
        WebElement element = webDriver.findElement(passWordInput);
        element.sendKeys(passWord);
    }

    public EmployeePage clickOnLoginButton(){
        WebElement element = webDriver.findElement(loginButton);
        element.click();
        return new EmployeePage(webDriver);
    }

    public EmployeePage loginAs(String user, String passWord){
        typeUserName(user);
        typePassWord(passWord);
        return clickOnLoginButton();
    }
}

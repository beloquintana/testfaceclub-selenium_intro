package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmployeePage {
    private WebDriver webDriver;
    private By nameInput = By.xpath("//*[@id='formEmployee']/div[2]/div[1]/input");
    private By emailInput = By.xpath("//*[@id='formEmployee']/div[2]/div[2]/input");
    private By addressInput = By.id("address");
    private By phoneInput = By.id("phone");
    private By addButtonButton = By.id("addButton");
    private By formEmployee = By.id("formEmployee");

    public EmployeePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void addEmployee(String name, String email, String address, String phone){
        webDriver.findElement(nameInput).sendKeys(name);
        webDriver.findElement(emailInput).sendKeys(email);
        webDriver.findElement(addressInput).sendKeys(address);
        webDriver.findElement(phoneInput).sendKeys(phone);
        webDriver.findElement(addButtonButton).click();
    }

    public boolean isEmployeePageDisplayed(){
        WebElement element = webDriver.findElement(formEmployee);
        return element.isDisplayed();
    }

    public boolean isAlertPresent(){
        try {
            WebDriverWait wait = new WebDriverWait(webDriver, 3);
            wait.until(ExpectedConditions.alertIsPresent());
            return true;
        }catch (Exception e){
            return false;
        }
    }
}

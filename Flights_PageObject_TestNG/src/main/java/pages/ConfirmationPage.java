package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage extends BasePage {
    private By panelMessage = By.xpath("//*[@class='panel panel-success']/div[1]");

    public ConfirmationPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getPanelMessage(){
        return webDriver.findElement(panelMessage).getText();
    }
}

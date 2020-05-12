package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxesPage extends BasePage {
    private By checkbox1 = By.xpath("//*[@id=\"checkboxes\"]/input[1]");
    private By checkbox2 = By.xpath("//*[@id=\"checkboxes\"]/input[2]");

    public CheckboxesPage(WebDriver webDriver){
        super(webDriver);
    }

    public void clickOnCheckbox1(){
        webDriver.findElement(checkbox1).click();
    }

    public void clickOnCheckbox2(){
        webDriver.findElement(checkbox2).click();
    }

    public boolean getCheckbox1Status(){
        return webDriver.findElement(checkbox1).isSelected();
    }

    public boolean getCheckbox2Status(){
        return webDriver.findElement(checkbox2).isSelected();
    }
}

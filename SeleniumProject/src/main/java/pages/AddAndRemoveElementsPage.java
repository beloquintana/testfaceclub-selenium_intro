package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddAndRemoveElementsPage extends BasePage {
    private By addElementButton = By.xpath("//*[@id=\"content\"]//button");
    private By buttonElements = By.xpath("//*[@id=\"elements\"]/button");

    public AddAndRemoveElementsPage(WebDriver webDriver){
        super(webDriver);
    }

    public void clickOnAddElementButton(){
        webDriver.findElement(addElementButton).click();
    }

    public int getButtonElementsCount(){
        return webDriver.findElements(buttonElements).size();
    }

    public void removeElement(int index){
        List<WebElement> list = webDriver.findElements(buttonElements);
        list.get(index - 1).click();
    }
}

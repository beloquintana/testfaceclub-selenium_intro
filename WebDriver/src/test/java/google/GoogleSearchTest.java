package google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class GoogleSearchTest {
    private WebDriver webDriver;

    private void setUp(String word){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com/");

        WebElement inputSearch = webDriver.findElement(By.name("q"));
        inputSearch.sendKeys(word);

        inputSearch.sendKeys(Keys.ENTER);

        WebElement result = webDriver.findElement(By.id("result-stats"));
        System.out.println("La palabra " + word + " tiene " + result.getText());

        webDriver.quit();
    }

    public static void main(String arg[]){
        GoogleSearchTest googleSearchTest = new GoogleSearchTest();
        System.out.println("Entre la palabra que desea buscar en google");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        scanner.close();

        googleSearchTest.setUp(word);
    }
}

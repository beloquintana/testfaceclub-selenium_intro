package login;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver webDriver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("http://testfaceclub.com/ejercicios/");
        webDriver.manage().window().maximize();

        //Login
        WebElement inputName = webDriver.findElement(By.id("user"));
        inputName.sendKeys("username");

        WebElement inputPass = webDriver.findElement(By.id("pass"));
        inputPass.sendKeys("password");

        WebElement loginButton = webDriver.findElement(By.id("loginButton"));
        loginButton.click();

        //Employee
        WebElement inputNameEmployee = webDriver.findElement(By.xpath("//*[@id='formEmployee']/div[2]/div[1]/input"));
        inputNameEmployee.sendKeys("Juan");

        WebElement inputEmailEmployee = webDriver.findElement(By.xpath("//*[@id='formEmployee']/div[2]/div[2]/input"));
        inputEmailEmployee.sendKeys("Juan@gmail.com");

        WebElement textAreaAddress = webDriver.findElement(By.id("address"));
        textAreaAddress.sendKeys("El Pinar, Cuidad de la Costa");

        WebElement inputPhone = webDriver.findElement(By.id("phone"));
        inputPhone.sendKeys("55589666");

        WebElement addButton = webDriver.findElement(By.id("addButton"));
        addButton.click();

        //Obtener una alerta
        Alert alert = webDriver.switchTo().alert();

        //Obtener mensaje de una alerta
        String alertMessage = alert.getText();
        System.out.println(alertMessage);

        //Aceptando una alerta
        alert.accept();

        webDriver.quit();
    }

    public static void main(String arg[]){
        LoginTest loginTest = new LoginTest();
        loginTest.setUp();
    }
}

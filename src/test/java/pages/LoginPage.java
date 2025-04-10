package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private  WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //locater
    private By textUserName=By.name("UserName");
    private By txtPassword=By.name("Password");
    private By btnLogin=By.cssSelector(".btn");


    //Actions methods
    public void  PerformLogin(String UserName, String password){
        driver.findElement(textUserName).sendKeys(UserName);
        driver.findElement(txtPassword).sendKeys(password);
        driver.findElement(btnLogin).click();


    }






}

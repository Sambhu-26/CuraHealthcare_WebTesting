package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cura_LoginPage {

    private WebDriver driver;
    //constructer
    public Cura_LoginPage(WebDriver driver){
        this.driver=driver;
    }

    //locaters
    private By fieldUsrname= By.name("username");
    private By fieldPssword=By.name("password");
    private By btnLogin=By.xpath("//button[text()='Login']");

    //performing actions
    public void enterTextUsr(String username){
        driver.findElement(fieldUsrname).sendKeys(username);
    }

    public void enterTextPass(String password){
        driver.findElement(fieldPssword).sendKeys(password);
    }

    public void clickLoginbtn(){
        driver.findElement(btnLogin).click();
    }

}

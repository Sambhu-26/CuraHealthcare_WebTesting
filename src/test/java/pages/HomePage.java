package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {


    private WebDriver driver;

    //constructor
    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    //locater of login page  //locater for Employeelist
    private By lnkLogin=By.id("loginLink");
    private By emplList=By.linkText("Employee List");


    //cura locater
    private By btnMakeAppt=By.id("btn-make-appointment");
    private By txtUserName=By.id("txt-username");
    private By txtPasswrd=By.id("txt-password");
    private By btnLogin=By.id("btn-login");
    private By txtFcility=By.name("facility");


    //perform actions
    public void clickLogin(){
        driver.findElement(lnkLogin).click();
       // return new LoginPage(driver);
    }

    public void employeeList(){
        driver.findElement(emplList).click();
        //return new EmployeeListPage(driver);

    }

    public void clickMakeAppointmentBtn(){
        driver.findElement(btnMakeAppt).click();
    }
    public void enterTextLogin(String usrName){
        driver.findElement(txtUserName).sendKeys(usrName);
    }
    public void enterTextPass(String usrPass){
        driver.findElement(txtPasswrd).sendKeys(usrPass);
    }
    public void clickLoginBtn(){
        driver.findElement(btnLogin).click();
    }
    public void getText(){
        String faciText=driver.findElement(txtFcility).getText();
        System.out.println(faciText);
    }
    public void getAttributes(){
        String IdAttr=driver.findElement(txtFcility).getAttribute("id");
        System.out.println(IdAttr);
    }

}

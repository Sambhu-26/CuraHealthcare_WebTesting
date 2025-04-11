package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cura_HomePage {


    private WebDriver driver;
    //constructor
    public Cura_HomePage(WebDriver driver){
        this.driver=driver;
    }

    //locaters
    private By txtCuraService=By.xpath("//h1[text()='CURA Healthcare Service']");
    private By btnMakeAppnt=By.xpath("//a[@id='btn-make-appointment']");

    //performing Actions on them
    public void getTextValue(){
        String homeText=driver.findElement(txtCuraService).getText();
        System.out.println("hoempage text:"+ homeText);

    }

    public void performClick(){
        driver.findElement(btnMakeAppnt).click();
    }



}

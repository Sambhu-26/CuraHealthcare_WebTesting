package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cura_SummaryPage {

    private WebDriver driver;

    public Cura_SummaryPage(WebDriver driver){
        this.driver = driver;
    }

    //locaters
    private By txtConfirm=By.xpath("//h2[text()='Appointment Confirmation']");
    private By btnGoToHomePage=By.xpath("//a[text()='Go to Homepage']");

    //actions

    public void getText(){
        String confirmText=driver.findElement(txtConfirm).getText();
        System.out.println(confirmText);
    }

    public void performClick(){
        driver.findElement(btnGoToHomePage).click();
    }

}

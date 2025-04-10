package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cura_Kebab {

    private WebDriver driver;
    public Cura_Kebab(WebDriver driver){
        this.driver=driver;
    }
    //locaters
    private By toggle= By.id("menu-toggle");
    private By toggleHistory=By.xpath("//a[contains(@href,'history')]");
    private By toggleProfile=By.xpath("//a[contains(@href,'profile')]");
    private By toggleLogout=By.xpath("//a[contains(@href,'logout')]");

    //actions
    public void clickToggle(){
        driver.findElement(toggle).click();
    }

    public void clickHistory(){
        driver.findElement(toggleHistory).click();
    }

    public void clickLogout(){
        driver.findElement(toggleLogout).click();
    }




}

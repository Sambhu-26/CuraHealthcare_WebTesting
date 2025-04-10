package CommonUtilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class UiElementExtension {

    public static void performClearAndEnterText(WebDriver driver, By locator, String value){
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(value);
    }

    public static void performClick(WebDriver driver,By locater){
        driver.findElement(locater).click();
    }
    public  static  void performSelectDropdownByText(WebDriver driver,By locater, String dropdownText){
        var select=new Select(driver.findElement(locater));
        select.selectByVisibleText(dropdownText);
    }

    public static void performSelectDropdownByIndex(WebDriver driver,By locater, int index){
        var select=new Select(driver.findElement(locater));
        select.selectByIndex(index);
    }

    public static void performAfterFindingErrorMsg(WebDriver driver, By locater, By durationWorkField, String msg){
        if(driver.findElement(locater).isDisplayed()){
            driver.findElement(locater).sendKeys(msg);
        }
        else {

        }
    }


}

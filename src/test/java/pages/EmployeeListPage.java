package pages;

import CommonUtilities.UiElementExtension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeeListPage {

    private WebDriver driver;

    public EmployeeListPage(WebDriver driver) {
        this.driver = driver;

    }

    //createNewEmployee

    private By headerEmpList = By.linkText("Employee List");
    //grid with all the list of employee
    private By BtnCreatNew=By.linkText("Create New");


    public void clickEmployeeList() {
        UiElementExtension.performClick(driver, headerEmpList);
    }
    public void clickCreateNewEmployee() {
        UiElementExtension.performClick(driver, BtnCreatNew);
    }
}

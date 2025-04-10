package pages;

import CommonUtilities.UiElementExtension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateEmployeePage {

    private WebDriver driver;

    public CreateEmployeePage(WebDriver driver){
        this.driver = driver;

    }

    //name

    private By txtName= By.id("Name");
    //salary
    private By intSalary=By.id("Salary");
    //grade
    private By ddl=By.name("Grade");

    //email
    private By txtEmail=By.id("Email");

    //create btn
    private By btnCreate=By.xpath("//input[@value='Create']");

    private By durationWork=By.linkText("The DurationWorked field is required.");
    private By durationWorkField=By.name("DurationWorked");

    //actions to perform

    public void createEmployee(String name,String salary,String grade,String email){
        UiElementExtension.performClearAndEnterText(driver,txtName,name);
        UiElementExtension.performClearAndEnterText(driver,intSalary,salary);
        UiElementExtension.performClearAndEnterText(driver,txtEmail,email);
        UiElementExtension.performSelectDropdownByText(driver,ddl,grade);
        UiElementExtension.performClick(driver,btnCreate);
    }

    public void errorConfirm(String Message){
        UiElementExtension.performAfterFindingErrorMsg(driver,durationWork,durationWorkField,Message);

    }



}

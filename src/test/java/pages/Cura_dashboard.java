package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Cura_dashboard {
    private WebDriver driver;

    //constructor

    public Cura_dashboard(WebDriver driver){
        this.driver=driver;
    }

    //locaters
    private By dropdown= By.id("combo_facility");
    private By checkBox=By.name("hospital_readmission");
    private By radioBox=By.id("radio_program_medicaid");
    private By ChooseDate=By.xpath("//input[@name='visit_date']");
    private By selectDate=By.id("txt_visit_date");
    private By BoxComments=By.name("comment");
    private By btnBookAppt=By.id("btn-book-appointment");
    private By btnMakeAppt=By.linkText("Make Appointment");

    //Actions on elements
    public void selectFacility(){
       Select seoul=new Select(driver.findElement(dropdown));
       seoul.selectByVisibleText("Seoul CURA Healthcare Center");
    }

    public void selectChecbox(){
        WebElement chec=driver.findElement(checkBox);
        boolean isBoxCheck=chec.isSelected();
        if(!isBoxCheck){
            chec.click();
        }
    }
    public void selectRadio(){
        driver.findElement(radioBox).click();
    }

    public void selectCalender(String days){
        driver.findElement(ChooseDate).sendKeys(days);
    }

    public void enterCommentsField(String comments){
        driver.findElement(BoxComments).sendKeys(comments);
    }

    public void clickBookAppointment(){
        driver.findElement(btnBookAppt).click();
    }


    public void clickMakeAppt(){
        driver.findElement(btnMakeAppt).click();
    }
    public void selectFacilityHongKong(){
       Select hongKong= new Select(driver.findElement(dropdown));
       hongKong.selectByVisibleText("Hongkong CURA Healthcare Center");
    }



}

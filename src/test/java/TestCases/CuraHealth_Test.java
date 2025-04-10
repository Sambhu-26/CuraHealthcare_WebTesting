package TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

import static CommonUtilities.Constants.PASSWORD;
import static CommonUtilities.Constants.USER_NAME;

public class CuraHealth_Test {

    private static final Logger log = LoggerFactory.getLogger(CuraHealth_Test.class);
    private WebDriver driver;


    @BeforeTest
    public void LaunchBrowser(){
        driver=new ChromeDriver();
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/profile.php#login");

    }

    @Test
    public void A_testHomePage(){
        Cura_HomePage hompage=new Cura_HomePage(driver);
        hompage.getTextValue();
        hompage.performClick();
    }

    @Test
    public void B_testLogin(){
        Cura_LoginPage loginpage=new Cura_LoginPage(driver);
        loginpage.enterTextUsr(USER_NAME);
        loginpage.enterTextPass(PASSWORD);
        loginpage.enterTextPass(PASSWORD);
        loginpage.clickLoginbtn();
    }

    @Test
    public void testC_BookAppointment() throws InterruptedException {
        Cura_dashboard cura_dashboard=new Cura_dashboard(driver);
//        Alert alert = driver.switchTo().alert();
//        System.out.println("Alert says: " + alert.getText());
//        alert.accept();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("prefs", new java.util.HashMap<String, Object>() {{
            put("credentials_enable_service", false);
            put("profile.password_manager_enabled", false);
        }});

        cura_dashboard.selectFacility();
        cura_dashboard.selectChecbox();
        cura_dashboard.selectRadio();
        Thread.sleep(5000);
        cura_dashboard.selectCalender("24/06/25");
        cura_dashboard.enterCommentsField("Provide Evidence – Logs, screenshots, and steps to reproduce.\n" +
                "Reproduce the Bug with Them – Show the issue on their environment.");
        cura_dashboard.clickBookAppointment();
    }


    @Test
    public void testD_Confirmation(){
        Cura_SummaryPage cura_summarypage=new Cura_SummaryPage(driver);
        cura_summarypage.getText();
        cura_summarypage.performClick();
    }

    @Test
    public void testE_Toggle(){
        Cura_Kebab cura_kebab=new Cura_Kebab(driver);
        Cura_SummaryPage cura_summarypage=new Cura_SummaryPage(driver);
        cura_kebab.clickToggle();
        cura_kebab.clickHistory();
        cura_summarypage.performClick();
    }






}



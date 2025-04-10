package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.Cura_dashboard;
import pages.HomePage;


public class TestNgTestsCases     {

    private WebDriver driver;
    //private HomePage homepage;

    @BeforeTest
    public void testLoginRunBeforeTest(){
        driver=new ChromeDriver();
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");

    }


    @Parameters({"UserName","Password"})
    @Test
    public void testA_Login(){
        HomePage homepage=new HomePage(driver);
        homepage.clickMakeAppointmentBtn();
        homepage.enterTextLogin("John Doe");
        homepage.enterTextPass("ThisIsNotAPassword");
        homepage.clickLoginBtn();
    }

    @Test
    public void testB_GetTextValue(){
        HomePage homepage=new HomePage(driver);
        homepage.getText();
        homepage.getAttributes();
    }


}

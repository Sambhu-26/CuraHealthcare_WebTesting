package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;


public class TestNgTestsCases2 {

    private WebDriver driver;
    //private HomePage homepage;

    @BeforeTest
    public void testLoginRunBeforeTest(){
        driver=new ChromeDriver();
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");

    }

    @Test
    public void testALogin(){
        HomePage homepage=new HomePage(driver);
        homepage.clickMakeAppointmentBtn();
        homepage.enterTextLogin("John Doe");
        homepage.enterTextPass("ThisIsNotAPassword");
        homepage.clickLoginBtn();
    }

    @Test
    public void testBGetTextValue(){
        HomePage homepage=new HomePage(driver);
        homepage.getText();
        homepage.getAttributes();

    }
}

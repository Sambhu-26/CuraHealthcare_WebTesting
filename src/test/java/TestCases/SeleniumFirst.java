package TestCases;

import CommonUtilities.UiElementExtension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class SeleniumFirst {

    public static void main(String[] args) {
        //1.create  a webdriver with chromedriver object
        //2.Launch the browser
        WebDriver driver=new ChromeDriver();
//        Login(driver);
//       CreateEmployee(driver);
//        NegativeTesting(driver);
//        SelectDropdown(driver);
        //driver.navigate().to("http://eaapp.somee.com/");
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
        HomePage homepage=new HomePage(driver);
        homepage.clickMakeAppointmentBtn();
        homepage.enterTextLogin("John Doe");
        homepage.enterTextPass("ThisIsNotAPassword");
        homepage.clickLoginBtn();
        homepage.getText();
        homepage.getAttributes();


//        LoginPage loginPage=new LoginPage(driver);
//        EmployeeListPage employeeListPage=new EmployeeListPage(driver);
//        CreateEmployeePage createEmployeePage=new CreateEmployeePage(driver);
//
//        homepage.clickLogin();
//        loginPage.PerformLogin("admin","password");
//        employeeListPage.clickEmployeeList();
//        employeeListPage.clickCreateNewEmployee();
//
//        createEmployeePage.createEmployee("user2","30000","Middle","user2@yopmail.com");
//        createEmployeePage.errorConfirm("20");
//        //driver.close();







    }

    public static void Login(WebDriver driver) {
        driver.navigate().to("http://eaapp.somee.com/");
        //driver.manage().window().fullscreen();
        // driver.manage().window().maximize();
        By locater= By.linkText("Login");
        WebElement loginbtn=driver.findElement(locater);
        loginbtn.click();


        WebElement usernme= driver.findElement(By.id("UserName"));
        usernme.sendKeys("admin");

        WebElement password=driver.findElement(By.id("Password"));
        //password.click();
        password.sendKeys("password");

        WebElement loginbtnclick=driver.findElement(By.id("loginIn"));
        loginbtnclick.click();
    }

    public static void CreateEmployee(WebDriver driver) {
        driver.findElement(By.linkText("Employee List")).click();
        driver.findElement(By.cssSelector("a[href='/Employee/Edit/1']")).click();
//        driver.findElement(By.name("Name")).clear();
//        driver.findElement(By.id("Name")).sendKeys("kapoor");
        UiElementExtension.performClearAndEnterText(driver,By.name("Name"),"kapoor");

        driver.findElement(By.id("Salary")).clear();
        driver.findElement(By.id("Salary")).sendKeys("40000");
        driver.findElement(By.name("DurationWorked")).clear();
        driver.findElement(By.name("DurationWorked")).sendKeys("50");
        driver.findElement(By.xpath("//input[@value='Save']")).click();

    }

    public static void NegativeTesting(WebDriver driver){
        driver.findElement(By.cssSelector("a[href='/Employee/Edit/4']")).click();
        driver.findElement(By.name("Salary")).clear();
        driver.findElement(By.xpath("//input[@value='Save']")).click();

        if (driver.findElement(By.xpath("//span[text()='The Salary field is required.']")).isDisplayed()){
            driver.findElement(By.name("Salary")).sendKeys("250000");
        }
        else {
            //do nothing
        }
        driver.findElement(By.xpath("//input[@value='Save']")).click();
    }

    public static void SelectDropdown(WebDriver driver) {
        driver.findElement(By.linkText("Create New")).click();

//        Select grade=new Select(driver.findElement(By.id("Grade")));
//        grade.selectByVisibleText("Senior");
        UiElementExtension.performSelectDropdownByText(driver,By.id("Grade"),"Senior");

    }



}


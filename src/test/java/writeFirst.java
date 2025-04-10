import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class writeFirst {
    static WebDriver driver=WebDriverManager.chromedriver().create();
    // WebDriver driver=new ChromeDriver();

    @BeforeTest
    public static void main(String[] args) {




        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


    }


    @Test
     void testSteps() throws InterruptedException {
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//li[text()='Sign In Portal']")).click();
        driver.findElement(By.xpath("//input[@id='usr']")).sendKeys("sam");
        driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("sam");
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        WebElement formalShoe=driver.findElement(By.xpath("//h3[text()='Formal Shoes']"));
        String actual=formalShoe.getText();
        String expected="Formal Shoes";
        Assert.assertEquals(expected,actual);
        System.out.println(formalShoe.getText());

//        driver.close();

    }
}

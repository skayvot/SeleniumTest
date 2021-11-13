import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class FirstTest {

     @Test
     public void checkAuthFB() throws InterruptedException {
          System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();
          driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

          By passwordFacebook = By.xpath("//input[@id='pass']");

          driver.get("https://www.facebook.com/");
          driver.manage().window().maximize();
          driver.findElement(By.xpath("//input[@data-testid='royal_email']")).clear();
          driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("opabfle_narayanansky_1636829733@tfbnw.net");
          driver.findElement(By.xpath("//input[@data-testid='royal_pass']")).clear();
          driver.findElement(passwordFacebook).sendKeys("gdlvplxv19z");
          //driver.findElement(By.xpath("//div[@class='_9lsb _9ls8']")).click();

          driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();

          //проверка значений, после действий

          WebElement facebookBanner = driver.findElement(By.xpath("//div[@role='banner']"));
          if (facebookBanner.isDisplayed()){
               System.out.println("PASS");
          } else {
               System.out.println("FAIL");
          }

          //System.out.println("password" + driver.findElement(passwordFacebook).getText());
          //Assert.assertEquals("gdlvplxv19z", driver.findElement(passwordFacebook).getText());
     }
}
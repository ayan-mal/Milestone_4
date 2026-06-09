package Openkart_demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Openkart_test {
	WebDriver driver;
	WebDriverWait wait;
	@BeforeTest(alwaysRun=true)
	  public void beforeTest() {
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		}
  @Test
  public void Registration() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
	  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("input-firstname")).sendKeys("Ayan");
	  driver.findElement(By.id("input-lastname")).sendKeys("Mal");
	  driver.findElement(By.id("input-email")).sendKeys("Ayan1234@gmail.com");
	  driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
	  driver.findElement(By.id("input-password")).sendKeys("Ayan@123");
	  driver.findElement(By.id("input-confirm")).sendKeys("Ayan@123");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
	  driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
	  Thread.sleep(2000);
	  System.out.println("Registration Successfull");
  }
  @Test
  public void Logib() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
	  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("input-email")).sendKeys("Ayan1234@gmail.com");
	  driver.findElement(By.id("input-password")).sendKeys("Ayan@123");
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
	  Thread.sleep(2000);
	  System.out.println("Login Successfull");
	  
  }
  
  

  @AfterTest
  public void afterTest() {
  }

}

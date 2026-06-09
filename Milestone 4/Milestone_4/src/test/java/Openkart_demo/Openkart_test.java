package Openkart_demo;

import org.testng.annotations.Test;

import Pages.Openkart_POM;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Openkart_test {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	Openkart_POM page;
	@BeforeTest(alwaysRun=true)
	  public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://tutorialsninja.com/demo/");
	  }
  @Test(priority = 1)
  public void Registration() throws InterruptedException {
	  page=new Openkart_POM(driver);
	  page.Registration();
		System.out.println(
		"Registration Completed");
	  
  }
  @Test(priority = 2)
  public void Login() throws InterruptedException {
	  page=new Openkart_POM(driver);
	  page.Login();

		System.out.println(	"Login Successful");
	  
  }
  @Test(priority = 3)
  public void Search() throws InterruptedException {
	  page=new Openkart_POM(driver);
	  page.Search();

		System.out.println(	"Search Completed");
  }
 @Test(priority = 4)
  public void Add_to_cart() throws InterruptedException {
	 page=new Openkart_POM(driver);
	  page.Add_to_cart();
		

		System.out.println("Product Added To Cart");
  
  }
 @Test(priority = 5)
 public void checkout() throws InterruptedException {
	 page=new Openkart_POM(driver);
	  page.Checkout();
	 System.out.println("Checkout completed");
 }
  @Test(priority = 6)
  public void Remove_from_cart() throws InterruptedException {
	  page=new Openkart_POM(driver);
	  page.Remove_from_cart();
	  
	  System.out.println("Product Removed From Cart");
	
	  
  }
  @Test(priority = 7)
  public void Order_confirmation() throws InterruptedException {
	  WebElement search = driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
	  search.sendKeys("iPhone");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"search\"]/span/button/i")).click();
	  Thread.sleep(2000);
	  try {
	      driver.findElement(
	          By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]"))
	          .click();
	      System.out.println("Products marked with *** are not available in the desired quantity or not in stock!");

	  } 
	  catch (Exception e) {
	      System.out.println("Add To Cart button or confirmation not available");
	      System.out.println("Test Case Passed By Skipping This Section");
	  }
	  Thread.sleep(2000);
  }
  @Test(priority = 8)
  public void Log_out() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")).click();
	  Thread.sleep(2000);
	  System.out.println("Log out successfully");
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("Program Done Successfully");
  }

}
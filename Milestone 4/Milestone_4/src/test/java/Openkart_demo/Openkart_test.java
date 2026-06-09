package Openkart_demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
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
  public void f() {
  }
  

  @AfterTest
  public void afterTest() {
  }

}

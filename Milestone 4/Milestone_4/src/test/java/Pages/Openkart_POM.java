package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Openkart_POM {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	//Registration
	By Account=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i");
	By Registration=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
	By First_name=By.id("input-firstname");
	By Last_name=By.id("input-lastname");
	By Email=By.id("input-email");
	By Telephone=By.id("input-telephone");
	By Password=By.id("input-password");
	By cnf_password=By.id("input-confirm");
	By Checkbox=By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
	By submit=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	//Login
	By Account1=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i");
	By Login=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a");
	By email=By.id("input-email");
	By password=By.id("input-password");
	By btn1=By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	//Search
	By search_bar=By.xpath("//*[@id=\"search\"]/input");
	By search_btn=By.xpath("//*[@id=\"search\"]/span/button");
	By search_bar1=By.xpath("//*[@id='search']/input");
	By search_bar2=By.xpath("//*[@id=\"search\"]/input");
	By search_btn1=By.xpath("//*[@id=\"search\"]/span/button/i");
	public Openkart_POM(WebDriver driver) {
		this.driver=driver;
	}
	public void Registration() throws InterruptedException {
		driver.findElement(Account).click();
		  driver.findElement(Registration).click();
		  Thread.sleep(2000);

			driver.findElement(First_name).sendKeys("Ayan");
			
			driver.findElement(Last_name).sendKeys("Mal");

			
			driver.findElement(Email).sendKeys("Ayan1234@gmail.com");
			
			driver.findElement(Telephone).sendKeys("1234567890");

			
			driver.findElement(Password).sendKeys("Ayan@123");
			
			driver.findElement(cnf_password).sendKeys("Ayan@123");
			Thread.sleep(2000);
			driver.findElement(Checkbox).click();

			Thread.sleep(2000);
			driver.findElement(submit).click();

			Thread.sleep(3000);

	}
	public void Login() throws InterruptedException {
		 driver.findElement(Account1).click();
		  driver.findElement(Login).click();
		  Thread.sleep(2000);
		  driver.findElement(email).sendKeys("Ayan1234@gmail.com");

			Thread.sleep(2000);
			driver.findElement(password).sendKeys("Ayan@123");

			Thread.sleep(2000);
			driver.findElement(btn1).click();

			Thread.sleep(3000);
	}
	public void Search() throws InterruptedException {
		 WebElement search =driver.findElement(search_bar);
			search.sendKeys("Canon EOS 5D");

			Thread.sleep(2000);
			driver.findElement(	search_btn).click();
			
			Thread.sleep(3000);
			search = driver.findElement(search_bar1);
			search.clear();

			WebElement search1 =driver.findElement(search_bar2);
			search1.sendKeys("MacBook");

			Thread.sleep(2000);
			driver.findElement(	search_btn1).click();
			Thread.sleep(3000);
			search = driver.findElement(search_bar1);
			search.clear();
	}

}

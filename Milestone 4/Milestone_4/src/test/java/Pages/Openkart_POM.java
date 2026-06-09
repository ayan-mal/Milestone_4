package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
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
	
	public Openkart_POM(WebDriver driver) {
		this.driver=driver;
	}
	public void Registration() {
		
	}

}

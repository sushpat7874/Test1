package test;

import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import Pojo.BrowserCallingClass;

public class LoggerTest {
	static Logger log = Logger.getLogger(LoggerTest.class.getName());
	
	@Test
	public void Test1Login() {
			log.info("Test1 Started");
			
		WebDriver driver = BrowserCallingClass.BrowserCallingMethod("https://www.facebook.com/");
			
			log.info("Browser Luanched");	
//			
//		WebElement email = driver.findElement(By.id("email"));
//		email.sendKeys("Sushant");
//			log.info("Username passed");
//			
//		WebElement pass = driver.findElement(By.name("pass"));
//		pass.sendKeys("123456");
//			log.info("Password passed");
//			
//		WebElement login = driver.findElement(By.tagName("button"));
//		login.click();
//			log.info("Clicked on Login button");
//			
	}
}
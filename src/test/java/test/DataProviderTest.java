package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Pojo.BrowserCallingClass;

public class DataProviderTest {
	
//uses=	passing valid as well as invalid creds to any login page in same line & at same time.
	@DataProvider(name = "myData")
	public Object[][] dataProviderTest(){ 
	return new Object[][] {{"Sushant2","abcd1234"},{"Sushyaa1","abc123"}};
	}
	
	@Test (dataProvider = "myData")
	public void Test7(String id, String pass) {
		WebDriver driver = BrowserCallingClass.BrowserCallingMethod("https://www.facebook.com/");
		
		WebElement ID = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		ID.sendKeys(id);

		WebElement Password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		Password.sendKeys(pass);

		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	}
}
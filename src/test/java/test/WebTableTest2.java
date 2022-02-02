package test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pojo.BrowserCallingClass;

public class WebTableTest2 {
	@Test
	public void TableTest2() {
		WebDriver driver = BrowserCallingClass.BrowserCallingMethod("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> column = driver.findElements(By.xpath("//table//tbody/tr[1]/td"));
		System.out.println(column.size());
	
	}
}
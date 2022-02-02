package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Pojo.BrowserCallingClass;

public class WebTableTest1 {
	
	@Test

//	public static void main(String[] args) throws InterruptedException {
	public void TestT() {
		WebDriver driver = BrowserCallingClass.BrowserCallingMethod("https://demo.guru99.com/test/write-xpath-table.html");
		
		WebElement data = driver.findElement(By.xpath("//table//tr[2]/td[1]"));
		System.out.println(data.getText());
		
	}
}
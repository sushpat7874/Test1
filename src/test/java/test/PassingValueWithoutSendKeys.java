package test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import Pojo.BrowserCallingClass;

public class PassingValueWithoutSendKeys {

	public static void main(String[] args) {
		WebDriver driver = BrowserCallingClass.BrowserCallingMethod("https://phptravels.org/login");
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript ("document.getElementById('inputEmail').value='sush@123'");
		
		
//		WebDriver driver = BrowserCallingClass.BrowserCallingMethod("https://www.tutorialspoint.com/index.htm");
//		
//		JavascriptExecutor j = (JavascriptExecutor)driver;
//		j.executeScript ("document.getElementById('search-strings').value='ABCD'");

	}
}
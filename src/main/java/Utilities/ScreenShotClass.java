package Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotClass {
	public void takeScreenShot(WebDriver driver, String fileName) throws IOException {
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\RELIANCE\\eclipse-workspace\\RegressionSuite"+fileName+".png");
		FileHandler.copy(Source, Destination);
	}
	
}

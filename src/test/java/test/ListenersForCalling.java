package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersForCalling implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("\nTest is started = "+result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is successfully ran = "+result.getName());
	}
	
	public void onTestFailure(ITestResult result) { 
		System.out.println("Test is failed = "+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is skipped = "+result.getName());
	}

	public void onStart(ITestResult context) {
		System.out.println("started = "+context.getName());
	}

	public void onFinish(ITestResult context) {
		System.out.println("Test is Finished = "+context.getName());
	}

}
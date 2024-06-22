package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Execution Started!");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		//System.out.println("I successfully executed Listeners pass code");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed!" + " -> "+  result.getName());
	}

	
	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

}

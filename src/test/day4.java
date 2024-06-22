package test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day4 {
	
	@Test(groups = {"Smoke"})
	public void plan() {
		
		System.out.println("good");
	}
	
	@Test(groups = {"Smoke"})
	public void plan1() {
		
		System.out.println("good");
	}
	
	@BeforeMethod
	public void bMethod() {
		
		System.out.println("Executed before method 1");
	}
	
	@BeforeTest
	public void prerequisite() {
		
		System.out.println("I will execute first");
	}

	
	@AfterTest
	public void postrequisite() {
		
		System.out.println("I will execute last");
	}
	

	@BeforeSuite
	public void bSuite() {
		
		System.out.println("I am no 1");
	}
	

	@AfterSuite
	public void Asuite() {
		
		System.out.println("I am last");
	}
	
	
	
}

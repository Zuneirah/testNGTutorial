package test;

import org.testng.annotations.Test;



public class day1 {
	
	
	@Test
	public void Demo() {
		System.out.println("hello");
	}
	
	@Test(groups = {"Sanity"})
	public void Demo1() {
		System.out.println("hello 1");
	}
	
	@Test(dependsOnMethods={"Test1"})
	public void Demo2() {
		System.out.println("hello 2");
	}

	@Test
	public void Test1() {
		System.out.println("hello 3");
	}
	
	

}

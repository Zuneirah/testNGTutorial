package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day5 {
	

	@Parameters({"URL"})
	@Test
	public void WebLoginCarLogin(String urlname) {
		
		System.out.println("weblogin car");
		System.out.println(urlname);
		Assert.assertTrue(false);
		
	}
	
	@Test(dataProvider="getData")
	public void MobileLoginCarLogin(String username, String password) {
		System.out.println("MOBILE SIGNOUT");
		System.out.println(username);
		System.out.println(password);
		
	}
	
	
	@Test(dataProvider="getData1")
	public void APILoginCarLogin(String username, String phonenumber, String emailaddress) {
		System.out.println("API SIGNOUT");
		System.out.println(username);
		System.out.println(phonenumber);
		System.out.println(emailaddress);
		
	}
	
	
	@DataProvider
	public Object[][]  getData() {
		
		Object [][] data = new Object[3][2];
		data[0][0] = "firstsetusername";
		data[0][1] = "firstsetpassword";
		
		data[1][0] = "secondsetusername";
		data[1][1]= "secondsetpassword";
		
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdsetpassword";
		
		return data;
		
	}
	
	
	@DataProvider
	public Object[][] getData1(){
		Object[][] data1 = new Object[1][3];
		data1[0][0]="samshaikh01";
		data1[0][1]="98912229999";
		data1[0][2]="test@gmail.com";
		
		return data1;
	}
	
	
	
}

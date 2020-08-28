package MyTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//hard assertion or hard validation : if a test assertion is getting failed,immediately test case will be marked as failed and will be terminated.
//soft assertion or soft validation : if a soft assertion is getting failed, test case will not be marked as passed as well as next lines will be executed.
// assertAll: to mark test case as failed, if any soft assertion is getting failed. 
public class TestCases {
	
	
	@Test
	public void test1() {
		SoftAssert softassert1 = new SoftAssert();
		
		System.out.println("open the Browser");
		Assert.assertEquals(true, true); 
		System.out.println("enter the username");
		System.out.println("enter the password");
		System.out.println("click on signin button");
		Assert.assertEquals(true, true); 
		
		System.out.println("validate home page");
		softassert1.assertEquals(true, false,"home page title is missing"); //soft assertion
		
		System.out.println("go to deals page");
		System.out.println("create a deal");
		softassert1.assertEquals(true, false,"not able to create a deal"); //soft Assertion
		
		softassert1.assertAll();
	}
	
		@Test
		public void test2() {
			SoftAssert softassert2 = new SoftAssert();
			System.out.println("logout");
			softassert2.assertEquals(true, false);
			softassert2.assertAll();
		}
		
		@AfterClass
		public void teardown() {
			
		}
		
	}
	
	
	
	



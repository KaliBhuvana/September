package Week5Day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnAnnotations extends BaseClass {
	
	@Test
	public void test1() {
		
		
		System.out.println("test1");
	}
	@BeforeMethod
public void beforeMethod1() {
		
		
		System.out.println("beforeMethod test1");
	}
	/*@BeforeClass
	public void beforeclass() {
			
			
			System.out.println("beforeClass2");
		}
	
	@BeforeTest
	public void beforeTest1() {
			
			
			System.out.println("beforeTest1");
		}
	@BeforeClass
public void beforeClass() {
	
	
	System.out.println("beforeClass1");
}
@AfterClass
	public void afterClass() {
		
		
		System.out.println("afterClass");
	}
@AfterMethod
public void afterMethod() {
	
	
	System.out.println("afterMethod1");
}
@AfterMethod
public void afterMethod2() {
	
	
	System.out.println("afterMethod2");
}
@BeforeMethod
public void beforeMethod2() {
		
		
		System.out.println("beforeMethod2");
}



@BeforeTest
public void beforeTest2() {
		
		
		System.out.println("beforeTest2");
	}



@BeforeSuite
public void beforeSuite() {
		
		
		System.out.println("beforeSuite");
	}
@BeforeSuite
public void beforeSuite1() {
		
		
		System.out.println("beforeSuite1");
	}
*/}
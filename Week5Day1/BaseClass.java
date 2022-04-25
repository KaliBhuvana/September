package Week5Day1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
@AfterMethod
	public void preCondition() {
		
		System.out.println("Common PostCondition");
	}
}

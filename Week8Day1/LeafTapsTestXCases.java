package Week8Day1;

import org.testng.annotations.Test;

public class LeafTapsTestXCases {
@Test(retryAnalyzer=Week8Day1.RetryFailedTest.class)
	public void createLead() {
		System.out.println("CreateLead");
		throw new RuntimeException();
	}
@Test	
public void editLead() {
	System.out.println("EditLead");
	//throw new RuntimeException();
	}
@Test
public void deleteLead() {
	System.out.println("EditLead");
}



}

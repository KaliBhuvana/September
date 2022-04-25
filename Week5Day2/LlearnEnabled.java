package Week5Day2;

import org.testng.annotations.Test;

public class LlearnEnabled {
	@Test()
	public void createLead() {
System.out.println("CreateLead");
	}
	@Test()
	public void editLead() {
System.out.println("EditLead");
	}
	@Test(enabled=false)
	public void deleteLead() {
System.out.println("DeleteLead");
	}

}

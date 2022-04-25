package Week5Day2;

import org.testng.annotations.Test;

public class LearnPriority {
	@Test(priority = -1)
	public void createLead() {
System.out.println("CreateLead");
	}
	@Test(priority = 0)
	public void editLead() {
System.out.println("EditLead");
	}
	@Test(priority = 1)
	public void deleteLead() {
System.out.println("DeleteLead");
	}
	@Test(priority = 2)
	public void mergeLead() {
System.out.println("MergeLead");
	}
	@Test(priority = 3)
	public void duplicateLead() {
System.out.println("DuplicateLead");
	}
}

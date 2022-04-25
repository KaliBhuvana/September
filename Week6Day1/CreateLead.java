package Week6Day1;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Week5Day2.BaseClass;

public class CreateLead extends BaseClass {
	@BeforeTest
	public void setFileName() {
		setFileName="CreateLead";
		}
	
		@Test(dataProvider="sendData")
			public void runCreateLead(String Company, String FirstName, String LastName,String Number) {
			driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Company);
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
				driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(Number);
				driver.findElement(By.name("submitButton")).click();
				
		}
}
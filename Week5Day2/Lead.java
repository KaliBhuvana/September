package Week5Day2;




import org.openqa.selenium.By;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Lead extends BaseClass {
@Test(dataProvider="sendData")
	public void runCreateLead(String Company, String FirstName, String LastName,String Number) {
	driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(Number);
		driver.findElement(By.name("submitButton")).click();
		
}
@DataProvider
public String[][] sendData(){
	
	String[][] data=new String[2][4];
	
	data[0][0]="CTS";
	data[0][1]="Kali Bhuvana";
			data[0][2]="M";
					data[0][3]="89033";
					
					data[1][0]="Auro";
					data[1][1]="Ashok Nath";
							data[1][2]="S";
									data[1][3]="74023";
									return data;
}
}







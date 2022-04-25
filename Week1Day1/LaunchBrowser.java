/**
 * 
 */
package Week1Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps/control/main");


WebElement userName = driver.findElement(By.id("username"));
userName.sendKeys("demosalesmanager");

WebElement passWord = driver.findElement(By.id("password"));
passWord.sendKeys("crmsfa");
WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
loginButton.click();
WebElement crmsfaLink = driver.findElement(By.linkText("CRM/SFA"));
crmsfaLink.click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("BA@");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kali Bhuvana");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Moorthy");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Bhuvi");
driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Bhu");
driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms.");
driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("06/07/1995");
driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Business");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ProjectManagement");
driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000000000");
driver.findElement(By.name("numberEmployees")).sendKeys("500000");
driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1234567890");
driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$$$$$");
driver.findElement(By.id("createLeadForm_description")).sendKeys("It is a test sample");
driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Don't forget");
WebElement countryPin = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
countryPin.clear();
countryPin.sendKeys("4");
driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("987654321");
driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("04563");
driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Bhuvana");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Bhuvan@123.com");
driver.findElement(By.className("smallSubmit")).click();	
}

}

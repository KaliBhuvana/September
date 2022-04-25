package Week7Day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToReadDatafromPropertiedFile {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("/September/src/main/java/Week6Day2/config.properties");
		
		Properties prop=new Properties();
		
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		text.replaceAll("\\D", "");
		
//to save data into property files
		/*FileInputStream fos=new FileInputStream("./src/main/resources/config.properties");
				prop.setProperty("leadId", id)*/
	}

}

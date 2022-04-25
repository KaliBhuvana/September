package Week6Day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Week5Day2.ReadExcel;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static ChromeDriver driver;

	public static String excelName;
		@DataProvider(name="sendData")
		public String[][] readData() throws IOException {
			 return ReadExcel.readData(excelName);
		
	}
	@Parameters({"url", "UserName", "Password"})
	@BeforeMethod
		public  void preCondition(String url, String name, String PW) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys(name);
			driver.findElement(By.id("password")).sendKeys(PW);
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();		

		}
	@AfterMethod
	public void postCondition() {
	System.out.println(driver.getTitle());
		driver.close();

}
}

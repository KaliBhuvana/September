package Week6Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAssertion {
	@Test
	public void login() {
		String expTitle="Leaftaps - TestLeaf Automation Platform";
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	String actutitle = driver.getTitle();
	boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
	//softAssert
	SoftAssert softAssert= new SoftAssert();
	softAssert.assertEquals(actutitle, expTitle);
	softAssert.assertAll();
	//HardAssert
	//to check boolean value
	Assert.assertTrue(displayed);//when the value is true, then it shows theis is passed or if the value is false it throws fail
	Assert.assertFalse(displayed);//when the value is false, then it shows this is passed if the value is true it throws fail
	//To check the 2value
	Assert.assertEquals(actutitle, expTitle );
		

	}

}

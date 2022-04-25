package Week4Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leafground.com/pages/disapper.html");
WebElement webDisappear = driver.findElement(By.xpath("//button[@id='btn']"));
WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.invisibilityOf(webDisappear));
	
	}

}

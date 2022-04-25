package Week4Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/");
		WebElement resizable = driver.findElement(By.linkText("Resizable"));
		resizable.click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement hold = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
	Point location = driver.findElement(By.xpath("//div[@id='resizable']")).getLocation();
		Actions builder= new Actions(driver);
		builder.clickAndHold(hold).perform();
		builder.dragAndDropBy(hold, -100, -100).perform();
	}

}

package Week4Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leafground.com/pages/frame.html");
///driver.findElement(By.id("Click")).click();//It throws NoSuchElementException
		WebElement frame0 = driver.findElement(By.xpath("(//div[@id='wrapframe']/iframe)[1]"));
		driver.switchTo().frame(frame0);
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();//
	
		WebElement secondFrame = driver.findElement(By.xpath("(//div[@id='wrapframe']/iframe)[2]"));
driver.switchTo().frame(secondFrame);
	driver.switchTo().frame("frame2");
	driver.findElement (By.id("Click1")).click();	
	driver.switchTo().defaultContent();
	List<WebElement> numofFrames = driver.findElements(By.xpath("//iframe"));
	int size = numofFrames.size();
	System.out.println("Total no of Frames;" +size);
	}

}

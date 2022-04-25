package Week1Day1;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");


	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("demosalesmanager");
	String text1 = driver.findElement(By.xpath("//input[@type='text']")).getText();
System.out.println(text1);
String text2=driver.findElement(By.xpath("//input[@type='text']")).getAttribute("class");
System.out.println(text2);
	driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
	
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	
	driver.findElement(By.xpath("//a[@style='color: black;']")).click();
	}

}

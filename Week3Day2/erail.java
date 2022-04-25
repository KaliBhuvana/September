package Week3Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class erail {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://erail.in/");
		
WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
fromStation.clear();
fromStation.sendKeys("MS",Keys.ENTER);
WebElement toStation = driver.findElement(By.id("txtStationTo"));
toStation.clear();
toStation.sendKeys("MDU",Keys.ENTER);
driver.findElement(By.id("chkSelectDateOnly")).click();
List<WebElement> trainName = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]/a"));
ArrayList<String> str =new ArrayList<String>();
int size = trainName.size();
	System.out.println("Total no.of.Trains" +size );
	for (int i = 0; i < size; i++) {
		String trainNumb = trainName.get(i).getText();
		//System.out.println(trainNumb);
		
		str.add(trainNumb);
		}
	Collections.sort(str);
	for (int i = 0; i < str.size(); i++) {
		System.out.println(str.get(i));
		
	}
	}
}
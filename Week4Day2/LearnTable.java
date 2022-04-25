package Week4Day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leafground.com/pages/table.html");
		WebElement webTable = driver.findElement(By.id("table_id"));
List<WebElement> tableRows = webTable.findElements(By.tagName("tr"));
int size = tableRows.size();
System.out.println("No of Rows;" +tableRows.size() );
WebElement firstRow = tableRows.get(1);
List<WebElement> Columns = firstRow.findElements(By.tagName("td"));
System.out.println("No of Columns:" +Columns.size());
for (int i = 1; i < tableRows.size(); i++) {
	WebElement indivRow = tableRows.get(i);
	List<WebElement> indivColumn = indivRow.findElements(By.tagName("td"));
	String text = indivColumn.get(4).getText();
	System.out.println("Elements in 2 Column" +text);
	
}
}
}
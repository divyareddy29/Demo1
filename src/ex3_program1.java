import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/IBM/Desktop/selenium3.html");
		WebElement table1=driver.findElement(By.xpath("/html/body/table/tbody"));
		List<WebElement> rows=table1.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		driver.close();

	}

}

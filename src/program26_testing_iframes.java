import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program26_testing_iframes {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/iframe.html");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.id("one")).sendKeys("divya");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.id("two")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		List<WebElement> gender=  driver.findElements(By.name("three"));
		gender.get(1).click();
	}

}

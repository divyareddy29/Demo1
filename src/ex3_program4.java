import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		WebElement customerid=driver.findElement(By.name("cusid"));
		customerid.sendKeys("divya123");
        WebElement submit=driver.findElement(By.name("submit"));
        submit.click();
        Alert alert=driver.switchTo().alert();
		alert.accept();
		
	}

}

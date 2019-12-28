import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex3_program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		  
		driver.findElement(By.name("user_login")).sendKeys("divya");
		driver.findElement(By.name("user_login")).sendKeys(Keys.CONTROL,"a");
		driver.findElement(By.name("user_login")).sendKeys(Keys.CONTROL,"c");
		driver.findElement(By.name("user_password")).sendKeys(Keys.CONTROL,"v");
	     
	     driver.close();
	     

	}

}

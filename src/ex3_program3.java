import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex3_program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com");
		String s;
		s=driver.getTitle();
		System.out.println(s);
		Actions action = new Actions(driver);
		WebElement computers=driver.findElement(By.linkText("COMPUTERS"));
		action.moveToElement(computers).build().perform();
		WebElement accessories=driver.findElement(By.linkText("Accessories"));
		accessories.click();
		//driver.close();

	}

}

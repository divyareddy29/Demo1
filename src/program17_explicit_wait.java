import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class program17_explicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,20);
		driver.get("file:///C:/Users/IBM/Desktop/selenium.html");
		WebElement username;
		username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("textbox1")));
		username.sendKeys("divya");
		
		

	}

}

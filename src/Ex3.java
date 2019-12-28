import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		WebElement admin=driver.findElement(By.linkText("Administrator"));
		 admin.click();
		WebElement username, password;
		username=driver.findElement(By.name("login"));
		password=driver.findElement(By.name("password"));
		username.sendKeys("admin");
		password.sendKeys("admin123");
		driver.close();
		
		
	}

}

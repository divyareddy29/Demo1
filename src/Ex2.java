import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		WebElement admin;
		admin=driver.findElement(By.linkText("Administrator"));
		admin.click();
		String s;
		s=driver.getTitle();
		System.out.println(s);
		driver.close();

		

	}

}

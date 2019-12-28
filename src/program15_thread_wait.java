import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program15_thread_wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/IBM/Desktop/selenium.html");
		driver.findElement(By.id("textbox1")).sendKeys("divya1");
		Thread.sleep(7000);
		driver.findElement(By.id("textbox2")).sendKeys("divya2");


	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class program13_mouse_over {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/IBM/Desktop/selenium.html");
		Actions action=new Actions(driver);
		WebElement tooltipobj=driver.findElement(By.className("tooltip"));
		action.moveToElement(tooltipobj).build().perform();

	}

}

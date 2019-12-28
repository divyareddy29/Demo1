import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program11_relativr_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/IBM/Desktop/selenium.html");
		//driver.findElement(By.xpath("//*[contains(@id,'box1')]")).sendKeys();
		driver.findElement(By.id("textbox1")).sendKeys("divya");
String s;
		s=driver.findElement(By.xpath("//*[contains(text(),'Dec')]")).getText();
		s=driver.findElement(By.xpath("/html/body/div")).getText();
		System.out.println(s);
		
	}

}

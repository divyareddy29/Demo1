import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program8_exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("http://www.google.co.in");
		String s;
		s=driver.getTitle();
		System.out.println(s);
		driver.close();

	}

}

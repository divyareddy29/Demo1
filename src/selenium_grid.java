import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class selenium_grid {

	static WebDriver driver;
	static String nodeURL;
	public static void main(String[] args) throws MalformedURLException 
	{
		nodeURL = "http://172.24.94.9.4444/wd/hub";
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL(nodeURL), capabilities);
		driver.get("http://www.newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		
	}


	}



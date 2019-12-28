import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class program25_extent_reports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtentReports extent;
		ExtentTest logger;
		extent = new ExtentReports("E:\\mytestResult.html");
		logger = extent.startTest("testcase1-home page");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		String expTitle="Demo Web Shop";
		String actTitle=driver.getTitle();
		if(expTitle.equals(actTitle))
		{
		logger.log(LogStatus.PASS, "testcase1 is pass");
		}
		else
		{
			logger.log(LogStatus.FAIL, "testcase1 is Fail");
		}
		extent.flush();
		extent.endTest(logger);
		
		logger= extent.startTest("testcase2");
		driver.findElement(By.linkText("Log in")).click();
		expTitle="Demo Web Shop. Login";
		actTitle=driver.getTitle();
		if(expTitle.equals(actTitle))
		{
		logger.log(LogStatus.PASS, "testcase2 is pass");
		}
		else
		{
			logger.log(LogStatus.FAIL, "testcase2 is fail");	
		}
		extent.flush();
		extent.endTest(logger);
		extent.close();

	}

}

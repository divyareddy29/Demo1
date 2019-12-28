import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exprogram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com");
		String s;
		s = driver.getTitle();
		System.out.println(s);
         WebElement login;
		login = driver.findElement(By.linkText("Register"));
		login.click();
		String a;
		a = driver.getTitle();
		System.out.println(a);
		WebElement Firstname,Lastname,Email,Password,Confirmpassword,register;
		 List<WebElement>gender=driver.findElements(By.name("Gender"));
		 gender.get(0).click();
		Firstname = driver.findElement(By.id("FirstName"));
		Lastname = driver.findElement(By.id("LastName"));
		Email = driver.findElement(By.id("Email"));
		Password = driver.findElement(By.id("Password"));
		Confirmpassword = driver.findElement(By.id("ConfirmPassword"));
		
		Firstname.sendKeys("Divya");
		Lastname.sendKeys("Reddy");
		Email.sendKeys("divya123@gmail.com");
		Password.sendKeys("pass123$");
		Confirmpassword.sendKeys("pass123$");
		register = driver.findElement(By.id("register-button"));
		register.click();

		driver.close();
		


	}

}

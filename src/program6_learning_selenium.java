import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program6_learning_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("file:///C:/Users/IBM/Desktop/selenium.html");
		WebElement textbox1=driver.findElement(By.id("textbox1"));
		textbox1.sendKeys("my name is selenium");
		boolean output;
		WebElement check1=driver.findElement(By.id("checkbox1"));
		output=check1.isSelected();
		System.out.println(output);
		Select combobox1=new Select(driver.findElement(By.id("combo1")));
		combobox1.selectByVisibleText("Australia");
		int total=combobox1.getOptions().size();
		System.out.println(total);
		List<WebElement>gender=driver.findElements(By.name("gender"));
		gender.get(0).click();
		gender.get(1).click();
		
				

	}

}

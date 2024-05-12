package supplyToDataAnotherClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ScriptToSignup_Facebook {

	@Test(dataProvider = "supplyTheData", dataProviderClass = SupplyTheDataToAnotherClass.class)

	public void acceptTheData(String firstName, String lastName, String mobileNumber, String pwd)
			throws InterruptedException {
		System.out.println(firstName + " : " + lastName + " : " + mobileNumber + " : " + pwd);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.name("firstname")).sendKeys("Kanhaiya");
		driver.findElement(By.name("lastname")).sendKeys("Singh");
		driver.findElement(By.name("reg_email__")).sendKeys("9336372223");
		driver.findElement(By.id("password_step_input")).sendKeys("22171212");
		WebElement dropdown1 = driver.findElement(By.id("day"));
		Select select1 = new Select(dropdown1);
		select1.selectByValue("10");
		
	
		
		WebElement dropdown2 = driver.findElement(By.id("month"));
		Select select2 = new Select(dropdown2);
		select2.selectByValue("11");
		
		
		
		WebElement dropdown3 = driver.findElement(By.id("year"));
		Select select3 = new Select(dropdown3);
		select3.selectByValue("1997");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		driver.quit();

	}

}

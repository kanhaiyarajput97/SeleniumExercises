package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithItsPreCondition {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.vtiger.com/vtigercrm/");
WebElement userNameTextfield=driver.findElement(By.id("username"));
Thread.sleep(5000);
userNameTextfield.clear();
Thread.sleep(5000);
userNameTextfield.sendKeys("admin");
Thread.sleep(5000);
WebElement passwordTextfield=driver.findElement(By.id("password"));
passwordTextfield.clear();
Thread.sleep(5000);
passwordTextfield.sendKeys("admin");
Thread.sleep(5000);
driver.manage().window().maximize();
driver.quit();
	}

}

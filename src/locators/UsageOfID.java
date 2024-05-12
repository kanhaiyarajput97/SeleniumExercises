package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfID {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	WebElement PasswordTextField=driver.findElement(By.id("pass"));
	PasswordTextField.sendKeys("123456789");
	Thread.sleep(90000);
	driver.manage().window().minimize();
	driver.quit();
  }
}

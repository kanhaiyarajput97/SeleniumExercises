package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDataWithoutSendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
WebElement emailTextField = driver.findElement(By.id("email"));
emailTextField.sendKeys(Keys.chord("abc123@gmail.com"));
Thread.sleep(2000);
WebElement passwordTextField = driver.findElement(By.id("pass"));
passwordTextField.sendKeys(Keys.chord("123456"));
Thread.sleep(2000);
driver.manage().window().maximize();
driver.quit();
	}

}

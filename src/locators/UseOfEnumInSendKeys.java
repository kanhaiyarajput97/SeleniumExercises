package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class UseOfEnumInSendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.vtiger.com/vtigercrm/");
Thread.sleep(2000);
WebElement usernameTextField=driver.findElement(By.id("username"));
usernameTextField.sendKeys(Keys.CONTROL+"a");
usernameTextField.sendKeys(Keys.DELETE);
Thread.sleep(2000);
usernameTextField.sendKeys(Keys.chord("admin"));
Thread.sleep(2000);
driver.manage().window().minimize();
driver.quit();

	}

}

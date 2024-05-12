package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValueAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.vtiger.com/vtigercrm/");
Thread.sleep(2000);
WebElement usernameTextField = driver.findElement(By.id("username"));
String userNameValue = usernameTextField.getAttribute("value");
System.out.println("userNameValue= "+userNameValue);
if(userNameValue.isEmpty()){
usernameTextField.sendKeys("abc");
}else {
usernameTextField.clear();
Thread.sleep(2000);
usernameTextField.sendKeys("xyz");
    }

  }
}
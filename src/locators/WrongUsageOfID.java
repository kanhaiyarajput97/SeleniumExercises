package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongUsageOfID {
	//if id attribute is not there
	//if id attribute is dynamic
	//id id attribute is duplicate
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.facebook.com/");
      WebElement loginButton=driver.findElement(By.id("u_0_7_z7"));
	  loginButton.click();
	}
}



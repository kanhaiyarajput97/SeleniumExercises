package Excirise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyTheColor {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/login");
		WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
		String loginButtonValue = loginButton.getCssValue("background-color");
		System.out.println("loginButtonValue="+loginButtonValue);
		String hexaDecimal=Color.fromString(loginButtonValue).asHex();
		System.out.println("hexaDecimal ="+hexaDecimal);

		

	}

}

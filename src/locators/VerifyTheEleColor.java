package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyTheEleColor {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement loginButton = driver.findElement(By.name("login"));
	String backgroundColorOfLogin = loginButton.getCssValue("background-color");
	System.out.println("backgroundColorOfLogin= "+backgroundColorOfLogin);
	// Color is sel class
	// fromString()...static method...Color class
	// asHex()...non static method...from Color class..return type is String
	String hexadecimalValue = Color.fromString(backgroundColorOfLogin).asHex();
	System.out.println("hexadecimalValue= "+hexadecimalValue);

		}

}



package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyColorOfMalaichaRegisterButton {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://shop-global.malaicha.com/login/");
	WebElement registerOption = driver.findElement(By.xpath("//button[text()='Register']"));
	String backgroundColorOfRegister = registerOption.getCssValue("background-color");
	System.out.println("backgroundColorOfRegister= "+backgroundColorOfRegister);
	// Color is sel class
	// fromString()...static method...Color class
	// asHex()...non static method...from Color class..return type is String
	String hexadecimalValue = Color.fromString(backgroundColorOfRegister).asHex();
	System.out.println("hexadecimalValue= "+hexadecimalValue);

		}

}



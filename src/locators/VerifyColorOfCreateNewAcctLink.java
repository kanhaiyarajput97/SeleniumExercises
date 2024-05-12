package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyColorOfCreateNewAcctLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
WebElement createNewAccountLink = driver.findElement(By.xpath("//a[text()='Create new account']"));
String backgroundColorOfNewAcct = createNewAccountLink.getCssValue("background-color");
System.out.println("backgroundColorOfNewAct"+backgroundColorOfNewAcct);
String hexadecimalValue = Color.fromString(backgroundColorOfNewAcct).asHex();
System.out.println("hexadecimalValue= "+hexadecimalValue);

	}

}

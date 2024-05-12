package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheVisibilityOfDayDropdown {
	// Ele is also present and source code is also present
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize(); 
	driver.get("https://www.facebook.com/signup"); 
	WebElement dayDropDown= driver.findElement(By.id("day"));
	if (dayDropDown.isDisplayed()) {
	System.out.println("A/c to method ---- True");
	System.out.println("A/c to client True");
	} else {
	System.out.println("A/c to method False");
	System.out.println("A/c to client False");
	}
	driver.manage().window().minimize();
	driver.quit();
	   }
	}

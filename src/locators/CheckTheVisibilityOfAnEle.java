package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTheVisibilityOfAnEle {

	// ele is not is present in the UI of an appln, but the ele source code is 
	// present in the HTML document. [not to use isDisplayed() upon this scenario.]
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
	WebElement invisibleEle = driver.findElement(By.name("preferred_pronoun"));
	if (invisibleEle.isDisplayed()) {
	System.out.println("method True");
	System.out.println("Client false");
	} else {
	System.out.println("method false");
	System.out.println("Client --- True");
	}
	driver.manage().window().minimize();
	driver.quit();
	   }
	}

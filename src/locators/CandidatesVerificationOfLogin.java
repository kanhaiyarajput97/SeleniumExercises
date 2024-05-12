package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CandidatesVerificationOfLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
WebElement loginButton=driver.findElement(By.name("login"));
if(loginButton.isEnabled()) {
	loginButton.submit();
	System.out.println("a/c to client --- True");
} else {
	System.out.println("The button is disabled --- Method(false)");
	System.out.println("a/c to client --- False");
 }
	}

}

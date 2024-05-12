package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyFemaleRadioButtonOnFbSignupPg {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
	WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@name='sex']/..//label[@text='female']"));
	Thread.sleep(2000);
	femaleRadioButton.click();
	Thread.sleep(5000);
	driver.manage().window().maximize();
	driver.quit();
	
}
}

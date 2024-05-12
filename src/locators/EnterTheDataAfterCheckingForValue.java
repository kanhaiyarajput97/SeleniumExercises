package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTheDataAfterCheckingForValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement firstnameTextField = driver.findElement(By.name("firstname"));
		String firstnameValue = firstnameTextField.getAttribute("value");
		System.out.println("firstnameValue= "+firstnameValue);
		if(firstnameValue.isEmpty()){
			firstnameTextField.sendKeys("abc");
			}else {
			firstnameTextField.clear();
			firstnameTextField.sendKeys("xyz");
		
		
	}
	}
}

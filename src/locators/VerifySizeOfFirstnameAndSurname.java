package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySizeOfFirstnameAndSurname {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		//firstname
		WebElement firstnameTextField = driver.findElement(By.name("firstname"));
		int firstnameHeight = firstnameTextField.getSize().getHeight();
		System.out.println("firstnameHeight= "+firstnameHeight);
		int firstnameWidth = firstnameTextField.getSize().getWidth();
		System.out.println("firstnameWidth= "+firstnameWidth);
		//surname
		WebElement surnameTextField = driver.findElement(By.name("lastname"));
		int surnameHeight = surnameTextField.getSize().getHeight();
		System.out.println("surnameHeight= "+surnameHeight);
		int surnameWidth = surnameTextField.getSize().getWidth();
		System.out.println("surnameWidth= "+surnameWidth);
		if(firstnameHeight==surnameHeight && firstnameWidth==surnameWidth) {
		System.out.println("Pass:The firstname and surname size is verified and found correct");	
		}else {
		System.out.println("Fail:The firstname and surname size is verified and found incorrect");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}


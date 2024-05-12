package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerifyLocOfEmailOrPhoneAndPwdTF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
			WebElement emailOrPhoneTxtFld = driver.findElement(By.name("email"));
			int emailOrPhoneStartY = emailOrPhoneTxtFld.getLocation().getY();
			System.out.println("emailOrPhonestartY= "+emailOrPhoneStartY);
			WebElement passwordTxtFld = driver.findElement(By.name("pass"));
			int passwordStartY = passwordTxtFld.getLocation().getY();
			System.out.println("passwordStartY= "+passwordStartY);
			if(emailOrPhoneStartY==passwordStartY) {
				System.out.println("Pass:The location of email or phone and password are starting with the same location on y axis ");
			} else {
				System.out.println("Fail:The location of email or phone and password are not starting with the same location on y axis ");
			}
	}

}
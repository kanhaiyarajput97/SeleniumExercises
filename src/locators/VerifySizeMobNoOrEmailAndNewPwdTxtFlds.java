package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySizeMobNoOrEmailAndNewPwdTxtFlds {

		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/signup");
			//mobile number or email address
			WebElement mobNoOrEmailTextField = driver.findElement(By.name("reg_email__"));
			int mobNoOrEmailHeight = mobNoOrEmailTextField.getSize().getHeight();
			System.out.println("mobNoOrEmailHeight= "+mobNoOrEmailHeight);
			int mobNoOrEmailWidth = mobNoOrEmailTextField.getSize().getWidth();
			System.out.println("mobNoOrEmailWidth= "+mobNoOrEmailWidth);
			//New password
			WebElement newPasswordTextField = driver.findElement(By.name("reg_passwd__"));
			int newPasswordHeight = newPasswordTextField.getSize().getHeight();
			System.out.println("newPasswordHeight= "+newPasswordHeight);
			int newPasswordWidth = newPasswordTextField.getSize().getWidth();
			System.out.println("newPasswordWidth= "+newPasswordWidth);
			if(mobNoOrEmailHeight==newPasswordHeight && mobNoOrEmailWidth ==newPasswordWidth) {
			System.out.println("Pass:The mobile number or email address and New password size is verified and found correct");	
			}else {
			System.out.println("Fail:The mobile number or email address and New password size is verified and found incorrect");
			}
			driver.manage().window().minimize();
			driver.quit();
		}
}

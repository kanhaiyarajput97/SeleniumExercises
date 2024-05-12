package Excirise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookEmailandPassword {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		Thread.sleep(5000);
		WebElement emailTextField = driver.findElement(By.xpath("//input[@type='email']"));
		int emailYaxis = emailTextField.getLocation().getY();
		System.out.println("emailYaxis" + emailYaxis);
		WebElement passWordTextField = driver.findElement(By.name("pass"));
		int passwordYaxis = passWordTextField.getLocation().getY();
		System.out.println("passwordYaxis  " + passwordYaxis);
		if(emailYaxis==passwordYaxis)
		
		{
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	}

}

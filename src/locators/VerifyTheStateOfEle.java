package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheStateOfEle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
Thread.sleep(2000);
WebElement submitOpt=driver.findElement(By.name("submit"));
if(submitOpt.isEnabled()) {
	System.out.println("The submitOpt is enabled ----- Method(True)");
	System.out.println("But a/c client it is False");
}else {
	System.out.println("The submitOpt is enabled ----- Method(False)");
	System.out.println("But a/c client it is True");
	WebElement acceptTermsOfServiceOpt=driver.findElement(By.xpath("//button[text()='Accept Terms of Service']"));
	acceptTermsOfServiceOpt.click();
	Thread.sleep(2000);
	WebElement acceptTermsOfServiceCheckBox=driver.findElement(By.id("confbtn"));
	acceptTermsOfServiceCheckBox.click();
	Thread.sleep(2000);
	WebElement closeOpt=driver.findElement(By.xpath("//button[text()='Close']"));
	closeOpt.click();
	Thread.sleep(2000);
	submitOpt.click();
	Thread.sleep(2000);
}
driver.manage().window().minimize();
driver.quit();
	}

}

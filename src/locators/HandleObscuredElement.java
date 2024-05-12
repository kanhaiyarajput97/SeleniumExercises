package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleObscuredElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		WebElement dismissOpt=driver.findElement(By.xpath("//span[contains(text(),'dismiss')]/..//a[type='submit']"));
		dismissOpt.click();
		Thread.sleep(2000);
		WebElement customerServiceLink=driver.findElement(By.xpath("//a[text()='Customer Service']"));
		
	}

}

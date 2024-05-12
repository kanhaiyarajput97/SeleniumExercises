package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
Thread.sleep(2000);
driver.get("https://www.facebook.com/");
driver.findElement(By.partialLinkText("हिन्दी"));
Thread.sleep(2000);
driver.findElement(By.partialLinkText("English (UK)"));
Thread.sleep(2000);
driver.manage().window().maximize();
driver.quit();
	}

}

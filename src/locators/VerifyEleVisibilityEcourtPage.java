package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyEleVisibilityEcourtPage {

			public static void main(String[] args){
		//ele is not present in the UI but the element source code is present in the HTML DOM
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://services.ecourts.gov.in/ecourtindia_v6/?p=casestatus/index&app_token=16c1b2afa0b7a24259d263d9aec08415b6ab01f089c0215c87826ee24zf7434a2");
			WebElement invisibleEle=driver.findElement(By.id("court_est_code"));
			if(invisibleEle.isDisplayed()) {
			System.out.println("method True");
			System.out.println("Client false");
			} else {
			System.out.println("method false");
			System.out.println("Client True");
			}
			driver.manage().window().minimize();
			driver.quit();
}
}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyToolTipTextOfTitleAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
WebElement flipkartLogo = driver.findElement(By.xpath("//img[contains(@src,'https://static-assets-web.flixcart.com/batman-returns/batman-returns/p/images/fkh')]"));
String flipkartLogoTitle = flipkartLogo.getAttribute("title");
System.out.println("flipkartLogoTitle= "+flipkartLogoTitle);

	}

}

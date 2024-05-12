package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAltText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
//		WebElement groceryImg = driver.findElement(By.xpath("//a[@aria-label='Grocery']//img"));
//		String groceryImgAltText = groceryImg.getAttribute("alt");
//		System.out.println("groceryImgAltText= "+groceryImgAltText);
		WebElement groceryImgAltText = driver.findElement(By.xpath("//img[contains(@src\"https://rukminim1.flixcart.com/flap/64/64/image/29')]"));
	}

}

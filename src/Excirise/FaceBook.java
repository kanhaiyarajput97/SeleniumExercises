package Excirise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("kanhaiyasingh3197@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Kanhaiyasingh");
		
		driver.findElement(By.id("loginbutton")).click();
	}

}

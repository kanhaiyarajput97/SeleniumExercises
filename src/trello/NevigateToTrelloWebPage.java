package trello;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NevigateToTrelloWebPage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://trello.com/en/login");
		driver.findElement(By.id("user")).sendKeys("kanhaiyasingh3197@gmail.com");
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("user")).sendKeys("kanhaiya123");


		



	}

}

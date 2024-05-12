package sendKeys;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");

		WebElement userTextField = driver.findElement(By.id("email"));
		WebElement passwordextField = driver.findElement(By.id("pass"));
		WebElement loginButton = driver.findElement(By.name("login"));

		Actions actions = new Actions(driver);
		actions.sendKeys(userTextField,"kanhaiyasingh3197@gmail.com").sendKeys(passwordextField, "1234567989").click(loginButton)
				.perform();
	}

}

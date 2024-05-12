package optional;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Optional {

	WebDriver driver;

	@Parameters({ "browsername", "url", "username", "password" })
	@Test
	public void loginToVtiger(@org.testng.annotations.Optional("firefox") String browsername, String url,
			String username, String password) throws InterruptedException {

		if (browsername.equals("chrome")) {

			driver = new ChromeDriver();
		} else if (browsername.equals("edge")) {

			driver = new EdgeDriver();

		} else if (browsername.equals("firefox")) {

			driver = new FirefoxDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get(url);
			WebElement usernameTextField = driver.findElement(By.id("username"));
			usernameTextField.clear();
			usernameTextField.sendKeys(username);
			WebElement passwordTextField = driver.findElement(By.id("password"));
			passwordTextField.clear();
			passwordTextField.sendKeys(password);
			driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
			
			Thread.sleep(2000);
			driver.quit();

		}
	}
}
package verifyMyntraReverse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyMyntraReverse {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		Actions action = new Actions(driver);
		WebElement studio = driver.findElement(By.xpath("//div[@class='desktop-navLink']/a[@style='border-bottom-color:#ff3f6c;']"));
		

	}

}

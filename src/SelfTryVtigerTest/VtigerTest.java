package SelfTryVtigerTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerTest {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.clear();
		usernameTextField.sendKeys("admin");
		WebElement passwordTextField = driver.findElement(By.id("password"));
		passwordTextField.clear();
		passwordTextField.sendKeys("admin");
		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		driver.findElement(By.xpath("//button[@class='btn btn-default reArrangeTabs dropdown-toggle']")).click();
		driver.findElement(By.id("newDashBoardLi")).click();
	    driver.findElement(By.xpath("//input[@class='inputElement']")).click();
	    driver.findElement(By.xpath("//input[@class='inputElement']")).sendKeys("KanhaiyaSinghDashboard");
	
		driver.findElement(By.name("saveButton")).submit();
		driver.findElement(By.id(""))
		
		
	}

}

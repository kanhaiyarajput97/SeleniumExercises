package assignment;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage extends BaseClass {
	@Test(priority = 3)
	public void enterTheEmail() throws InterruptedException {
		driver.findElement(By.name("login")).click();
		Assert.assertEquals("Log in to continue - Log in with Atlassian account ", driver.getTitle(),
				"Login page has not been verified.");
		Thread.sleep(2000);
		driver.findElement(By.id("login")).sendKeys("kanhaiyasingh3197@gmail.com");
		Thread.sleep(2000);
	}

	@Test(priority = 4)
	public void clickOnContinueBtn() throws InterruptedException {

		driver.findElement(By.name("lo gin")).click();
		Assert.assertEquals("Log in to continue - Log in with Atlassian account", driver.getTitle(),
				"Login page has not been verified.");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("kanhaiyasingh3197@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).submit();
		Thread.sleep(2000);
	}

	@Test(priority = 5)
	public void enterthePassword() throws InterruptedException {
		driver.findElement(By.name("login")).click();
		Assert.assertEquals("Log in to continue - Log in with Atlassian account", driver.getTitle(),
				"Login page has not been verified.");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("kanhaiyasingh3197@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).submit();
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Kanhaiya@9336372223");
		Thread.sleep(2000);

	}

	@Test(priority = 6)
	public void clickOnLoginBtn() throws InterruptedException {
		driver.findElement(By.name("login")).click();
		Assert.assertEquals("Log in to continue - Log in with Atlassian account", driver.getTitle(),
				"Login page has not been verified.");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("kanhaiyasingh3197@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).submit();
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Kanhaiya@9336372223");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).submit();
		Thread.sleep(null);

	}
}

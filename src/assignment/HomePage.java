package assignment;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends BaseClass {
	@Test(priority = 1)
	public void clickLoginLink() throws InterruptedException {
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void vAndValLoginPage() throws InterruptedException {
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		Assert.assertEquals("Log in to continue - Log in with Atlassian account", driver.getTitle(),
				"Login page has not been verified.");
		Thread.sleep(2000);
	}
}

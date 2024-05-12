package screenShots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-maharajas.com/");
		WebElement maharajaslogo = driver.findElement(By.xpath("a[class='navbar-brand mr-0 py-0']"));
		File tempFile = maharajaslogo.getScreenshotAs(OutputType.FILE);
		File parmFile = new File("./bugshots/maharajas.png");
		FileUtils.copyFile(tempFile, parmFile);

	}

}

package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.firstcry.com/");
		WebElement boyFashionlink = driver.findElement(By.xpath("//a[text()='BOY FASHION']"));
		WebElement girlfashionLink = driver.findElement(By.xpath("//a[text()=' //a[text()='GIRL FASHION']"));
		WebElement footWearLink = driver.findElement(By.xpath("//a[text()='//a[text()=' Footwear']"));
		WebElement toysLink = driver.findElement(By.xpath("//a[text()='//a[text()=' Toys']']"));
		WebElement diaperingLink = driver.findElement(By.xpath("//a[text()='//a[text()=' Diapering']"));
		WebElement gearLink = driver.findElement(By.xpath("//a[text()='//a[text()=' Gear']"));
		WebElement feedingLink = driver.findElement(By.xpath("//a[text()='//a[text()=' Feeding']"));
		WebElement bathLINK = driver.findElement(By.xpath("//a[text()='//a[text()='//a[text()=' Bath']"));
		WebElement nursaryLink = driver.findElement(By.xpath("//a[text()='//a[text()='//a[text()=' Nursery']"));
		WebElement momsLnk = driver.findElement(By.xpath("//a[text()='//a[text()='//a[text()=' Moms']"));
		WebElement healthLink = driver.findElement(By.xpath("//a[text()='//a[text()='//a[text()=' Health']"));
		WebElement boutiquesLink = driver
				.findElement(By.xpath("//a[text()='//a[text()='//a[text()='//a[text()=' Boutiques']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(boyFashionlink).pause(1000).moveToElement(girlfashionLink).pause(1000)
				.moveToElement(footWearLink).pause(1000).moveToElement(toysLink).pause(1000)
				.moveToElement(diaperingLink).pause(1000).moveToElement(gearLink).pause(1000).moveToElement(feedingLink)
				.pause(1000).moveToElement(bathLINK).pause(1000).moveToElement(nursaryLink).pause(1000)
				.moveToElement(momsLnk).pause(1000).moveToElement(healthLink).pause(1000).moveToElement(boutiquesLink)
				.perform();

	}

}

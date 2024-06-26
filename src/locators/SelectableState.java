package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectableState {

public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/signup");
Thread.sleep(2000);
WebElement customRadioButton = driver.findElement(By.xpath("//label[text()='Custom']/..//input[@type='radio']"));
if (customRadioButton.isSelected()) {
System.out.println("A/c to the method True");
System.out.println("A/c to client it is false bcoz it should be not selected");
} else {
System.out.println("A/c to the method False"); 
System.out.println("A/c to client it is True");
customRadioButton.click();
}
Thread.sleep(2000);
driver.manage().window().minimize();
driver.quit();
  }
}
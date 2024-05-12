package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyFbConnectTextOnLoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
WebElement connectText = driver.findElement(By.xpath("//h2[@class='_8eso']"));
String tagText = connectText.getText();
if(tagText.equals("Facebook helps you connect and share with the people in your life.")) {
  System.out.println("pass");
}else {
	System.out.println("fail");
}
	}

}
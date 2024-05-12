package Excirise;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class FirstAutometionTest {
	    public static void main(String[] args) {
	        // Set the path to the ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Create a new instance of the ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Now you can use the 'driver' object to interact with the Chrome browser

	        // For example, navigate to a website
	        driver.get("https://www.example.com");

	        // Perform other actions or tests using the WebDriver

	        // Close the browser window
	        driver.quit();
	    }
	}

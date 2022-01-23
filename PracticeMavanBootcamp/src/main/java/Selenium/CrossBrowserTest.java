package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {
	static WebDriver driver;

	public static void main(String[] args) {
		 String local = System.getProperty("user.dir");
		 		 
		 System.setProperty("webdriver.chrome.driver", local+ "\\src\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://google.com");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
	
		 System.setProperty("webdriver.gecko.driver", local+ "\\src\\Driver\\geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.get("http://facebook.com");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 System.setProperty("webdriver.edge.driver", local+ "\\src\\Driver\\msedgedriver.exe");
		 driver = new EdgeDriver();
		 driver.get("http://amazon.com");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
	}
}
package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_url_links {
	public static  WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		String local = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", local+ "\\src\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for (int i = 0; i<allLinks.size(); i++) {
		System.out.println(allLinks.get(i).getText());
		}
	}
}

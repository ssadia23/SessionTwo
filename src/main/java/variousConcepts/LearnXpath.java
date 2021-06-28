package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

WebDriver driver;
	
	@Before
	public void inIt() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver ();
		driver.get("https://objectspy.space/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void testvariousIdentifiers() {
		//Relative:
			//--- //Tag[@Attribute Node='Value']
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sadia");
			//--- //Tag[@Attribute Node='Value' and @Attribute Node='Value]
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='Selenium Webdriver']")).click();
		
		//Xpath for links:
			//Tag[text()='Value']
		//driver.findElement(By.xpath("//a[text()='API Documentations']")).click();
			//Tag[contains(text(),Value)]
		driver.findElement(By.xpath("//a[contains(text(),'API Documentations')]")).click();
		
		//Absolute (/)
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[1]/a/strong")).click();
				
	}
	
	//@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}

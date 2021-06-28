package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnIdentifiers {
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
		//Name identifier
		driver.findElement(By.name("firstname")).sendKeys("Sadia");
		driver.findElement(By.name("lastname")).sendKeys("Sultana");
		
		//Id identifier
		driver.findElement(By.id("sex-1")).click();
		
		//Class identifier
		//driver.findElement(By.className("input-file")).click();
		
		//Linked text identifier
		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		
		//Partial linked text identifier
		driver.findElement(By.partialLinkText("Product Backend")).click();
	}
	
	//@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}

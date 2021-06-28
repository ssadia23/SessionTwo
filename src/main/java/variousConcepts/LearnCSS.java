package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCSS {

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
		//CSS id: (TagName#Value)
		driver.findElement(By.cssSelector("input#exp-4")).click();
		
		//CSS class: (TagName.Value)
		//driver.findElement(By.cssSelector("")).click();
		
		//(TagName[attribute='value'])
		//driver.findElement(By.cssSelector("input[value='Automation Tester']")).click();
		
		//double attribute was used to find unique string
		driver.findElement(By.cssSelector("input[name='profession'][id='profession-1']")).click();
		
		//(TagName.class[attribute='value'])
	}
	
	//@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	
}

package CursoSelenium.CursoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearchTest {
	
	
	@Test
	public void buscarEltiempo() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath +  "/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.google.com");
			
		WebElement searchInput = driver.findElement(By.name("q"));
		searchInput.sendKeys("ElTiempo");
		searchInput.sendKeys(Keys.RETURN);
		
		
		driver.close();
		
	}
	
	
}

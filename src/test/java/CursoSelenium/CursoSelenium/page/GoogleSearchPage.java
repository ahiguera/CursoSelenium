package CursoSelenium.CursoSelenium.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPage {
	
	public By txtBuscar = By.name("q");
	
	public By btnBuscar = By.name("btnK");
	
	public By btnSuerte = By.name("btnI");
	
	
	
	public void buscar(String buscarEnGoogle) {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath +  "/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://www.google.com");
			
		WebElement searchInput = driver.findElement(txtBuscar);
		searchInput.sendKeys(buscarEnGoogle);
		searchInput.sendKeys(Keys.RETURN);
		
		
		driver.close();
		
	}
	
}

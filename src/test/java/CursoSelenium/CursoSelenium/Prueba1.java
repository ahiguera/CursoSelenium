package CursoSelenium.CursoSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prueba1 {

	public static void main(String[] args) {
		
		
		String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chrome/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}
}

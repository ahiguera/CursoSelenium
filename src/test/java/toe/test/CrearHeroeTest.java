package toe.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import toe.dto.HeroeDto;
import toe.pages.HeaderPage;
import toe.pages.HeroesPage;

public class CrearHeroeTest {

	

	
	@Test
	public void CrearHeroe() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath +  "/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:4200");
		
		//Crea instancias de los page object model
		HeaderPage headerPage = new HeaderPage();
		HeroesPage heroesPage = new HeroesPage();
		
		
		// Se crea el dto con los datos del heroe a crear.
		HeroeDto heroeDto = new HeroeDto();
		heroeDto.setNombre("Storm");
		heroeDto.setTelefono("3101234578");
		heroeDto.setTelefono("4500 5th Avenue");
		
		
		driver.findElement(headerPage.btnHeroes).click();			
		heroesPage.crearHeroe(heroeDto,driver);

		
	}
	
	
}

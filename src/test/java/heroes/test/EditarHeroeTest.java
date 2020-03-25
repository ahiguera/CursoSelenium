package heroes.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import heroes.dto.HeroeDto;
import heroes.pages.DashBoardPage;
import heroes.pages.DetailHeroesPage;
import heroes.pages.GestionarHeroesPage;


public class EditarHeroeTest {
	
	@Test
	public void EditarHeroe() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath +  "/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:4200");
		
		//Crea instancias de los page object model
		DashBoardPage headerPage = new DashBoardPage();
		GestionarHeroesPage heroesPage = new GestionarHeroesPage();
		DetailHeroesPage editHeroePage = new DetailHeroesPage();
		
		driver.findElement(headerPage.btnHeroes).click();
		
		heroesPage.clicOnHeroeEnLista("Magma", driver);
		
		HeroeDto heroeDto = new HeroeDto();
		heroeDto.setNombre("Magma");
		heroeDto.setDireccion("Nueva direccion");
		heroeDto.setTelefono("123456789");
		
		editHeroePage.editarHeroe(heroeDto, driver);
		
		
	}
	
	@Test
	public void EditarBombasto() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath +  "/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:4200");
		
		//Crea instancias de los page object model
		DashBoardPage headerPage = new DashBoardPage();
		GestionarHeroesPage heroesPage = new GestionarHeroesPage();
		DetailHeroesPage editHeroePage = new DetailHeroesPage();
		
		driver.findElement(headerPage.btnHeroes).click();
		
		heroesPage.clicOnHeroeEnLista("Bombasto", driver);
		
		HeroeDto heroeDto = new HeroeDto();
		heroeDto.setNombre("Bombasto");
		heroeDto.setDireccion("Nueva direccion");
		heroeDto.setTelefono("123456789");
		
		editHeroePage.editarHeroe(heroeDto, driver);
		
		
	}
	
	
	@Test
	public void EditarTornado() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath +  "/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:4200");
		
		//Crea instancias de los page object model
		DashBoardPage headerPage = new DashBoardPage();
		GestionarHeroesPage heroesPage = new GestionarHeroesPage();
		DetailHeroesPage editHeroePage = new DetailHeroesPage();
		
		driver.findElement(headerPage.btnHeroes).click();
		
		heroesPage.clicOnHeroeEnLista("Tornado", driver);
		
		HeroeDto heroeDto = new HeroeDto();
		heroeDto.setNombre("Tornado");
		heroeDto.setDireccion("Nueva direccion");
		heroeDto.setTelefono("123456789");
		
		editHeroePage.editarHeroe(heroeDto, driver);
		
	}

}

package toe.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import toe.dto.HeroeDto;
import toe.pages.EditHeroePage;
import toe.pages.HeaderPage;
import toe.pages.HeroesPage;

public class EditarHeroeTest {
	
	@Test
	public void EditarHeroe() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath +  "/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:4200");
		
		//Crea instancias de los page object model
		HeaderPage headerPage = new HeaderPage();
		HeroesPage heroesPage = new HeroesPage();
		EditHeroePage editHeroePage = new EditHeroePage();
		
		driver.findElement(headerPage.btnHeroes).click();
		
		heroesPage.clicOnHeroeEnLista("Magma", driver);
		
		HeroeDto heroeDto = new HeroeDto();
		heroeDto.setNombre("Magma");
		heroeDto.setDireccion("Nueva direccion");
		heroeDto.setTelefono("123456789");
		
		editHeroePage.editarHeroe(heroeDto, driver);
		
		//Verificar que si quedó editado
		
		
		
	}
	
	@Test
	public void EditarBombasto() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath +  "/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:4200");
		
		//Crea instancias de los page object model
		HeaderPage headerPage = new HeaderPage();
		HeroesPage heroesPage = new HeroesPage();
		EditHeroePage editHeroePage = new EditHeroePage();
		
		driver.findElement(headerPage.btnHeroes).click();
		
		heroesPage.clicOnHeroeEnLista("Bombasto", driver);
		
		HeroeDto heroeDto = new HeroeDto();
		heroeDto.setNombre("Bombasto");
		heroeDto.setDireccion("Nueva direccion");
		heroeDto.setTelefono("123456789");
		
		editHeroePage.editarHeroe(heroeDto, driver);
		
		heroesPage.clicOnHeroeEnLista("Bombasto", driver);
		
		String telefonoActualizado = driver.findElement(heroesPage.txtPhone).getAttribute("value");
		Assert.assertEquals(telefonoActualizado, "123456789");
		
		String direccionActualizada = driver.findElement(heroesPage.txtAddress).getAttribute("value");
		Assert.assertEquals(direccionActualizada, "Nueva direccion");

		
	}
	
	
	@Test
	public void EditarTornado() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath +  "/drivers/chrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:4200");
		
		//Crea instancias de los page object model
		HeaderPage headerPage = new HeaderPage();
		HeroesPage heroesPage = new HeroesPage();
		EditHeroePage editHeroePage = new EditHeroePage();
		
		driver.findElement(headerPage.btnHeroes).click();
		
		heroesPage.clicOnHeroeEnLista("Tornado", driver);
		
		HeroeDto heroeDto = new HeroeDto();
		heroeDto.setNombre("Tornado");
		heroeDto.setDireccion("Nueva direccion");
		heroeDto.setTelefono("123456789");
		
		editHeroePage.editarHeroe(heroeDto, driver);
		
	}

}

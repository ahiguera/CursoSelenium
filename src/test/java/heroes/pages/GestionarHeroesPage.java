package heroes.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import heroes.dto.HeroeDto;

public class GestionarHeroesPage {

	public By txtName = By.id("txtName");
	
	public By txtPhone = By.id("txtPhone");
	
	public By txtAddress = By.id("txtAddress");
	
	public By btnAdd = By.id("btnAdd");

	public void crearHeroe(HeroeDto heroeDto,WebDriver driver) {
		
		driver.findElement(txtName).sendKeys(heroeDto.getNombre());
		driver.findElement(txtPhone).sendKeys(heroeDto.getTelefono());
		driver.findElement(txtAddress).sendKeys(heroeDto.getDireccion());
		
		driver.findElement(btnAdd).click();
		
	}
	
		
	public void clicOnHeroeEnLista(String heroeName, WebDriver driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName("li")));
				
		//Buscar en la lista de heroes
		List<WebElement> listaHeroes = driver.findElements(By.tagName("li"));
		
		for (WebElement heroe : listaHeroes) {
			String texto = heroe.getText();
			if (texto.contains(heroeName)) {
				heroe.click();
				break;
			}
		}

	}
	
}

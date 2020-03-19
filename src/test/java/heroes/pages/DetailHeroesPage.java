package toe.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import toe.dto.HeroeDto;

public class EditHeroePage {

	public By txtName = By.id("txtName");
	
	public By txtPhone = By.id("txtPhone");
	
	public By txtAddress = By.id("txtAddress");
	
	public By btnSave = By.id("btnSave");
	
	
	
	public void editarHeroe( HeroeDto heroeDto, WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		// Actualiza el nombre
		wait.until(ExpectedConditions.presenceOfElementLocated(txtName));
		driver.findElement(txtName).clear();
		driver.findElement(txtName).sendKeys(heroeDto.getNombre());
		
		// Actualiza el telefono
		wait.until(ExpectedConditions.presenceOfElementLocated(txtPhone));
		driver.findElement(txtPhone).clear();
		driver.findElement(txtPhone).sendKeys(heroeDto.getTelefono());
		
		//Actualiza la direccion
		wait.until(ExpectedConditions.presenceOfElementLocated(txtAddress));
		driver.findElement(txtAddress).clear();
		driver.findElement(txtAddress).sendKeys(heroeDto.getDireccion());
		
		
		//Hace clic en boton guardar
		wait.until(ExpectedConditions.presenceOfElementLocated(btnSave));
		
		driver.findElement(btnSave).click();
		
	}
	
}

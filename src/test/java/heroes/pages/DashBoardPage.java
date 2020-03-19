package heroes.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage {

	public By btnDashBoard = By.id("btnDashBoard");
	
	public By btnHeroes = By.id("btnHeroes");
	
	public void irAHeroes(WebDriver driver) {
		driver.findElement(btnHeroes).click();
	}
	
}

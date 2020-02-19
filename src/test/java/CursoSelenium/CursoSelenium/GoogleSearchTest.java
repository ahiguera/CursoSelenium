package CursoSelenium.CursoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CursoSelenium.CursoSelenium.page.GoogleSearchPage;

public class GoogleSearchTest {
	

	GoogleSearchPage gsp = new  GoogleSearchPage();

	
	@Test
	public void buscarEltiempo() {
		gsp.buscar("ElTiempo");
	}
	
	
	@Test
	public void buscarMazda() {
		gsp.buscar("Mazda");		
	}
	
	
	@Test
	public void buscarHeinsohn() {
		gsp.buscar("Heinsohn");				
	}
	
}

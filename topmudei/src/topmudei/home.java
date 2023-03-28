package topmudei;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class home {
	private final String url_site = "https://topmudei-frontend-hom.azurewebsites.net";

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void HomeInicio() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		var driver = new ChromeDriver(options);

		Aguarde(500);

		driver.manage().deleteAllCookies();
		driver.get(url_site);
		Aguarde(1000);
		
		driver.findElement(By.xpath("//*[text() = \"Concordar e Fechar\"]")).click();
		 driver.findElement(By.xpath("//*[text() = \"Imóveis\"]")).click();
		
		//driver.findElement(By.linkText("Imoveis")).click();
		Aguarde(1000);
		
		JavascriptExecutor js = driver;
		js.executeScript("window.scrollBy(0,500)");
		Aguarde(1000);
		
		driver.findElement(By.id("TipoImovel_2")).click();
		driver.findElement(By.id("TipoImovel_3")).click();
		Aguarde(1000);
	    Scroll(driver);
       driver.findElement(By.xpath("//*[text() = \"Aplicar Filtros\"]")).click();
	 //  driver.findElement(By.cssSelector("https://topmudei-frontend-hom.azurewebsites.net/imovel/pesquisa")).click();
	}

	void Aguarde(long tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	private void Scroll(ChromeDriver driver) {

		JavascriptExecutor js = driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Aguarde(1500); 

	}	
}

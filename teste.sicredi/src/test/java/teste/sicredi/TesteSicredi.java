package teste.sicredi;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import elementos.elementos;

public class TesteSicredi {
	WebDriver driver;
	elementos el = new elementos();

	@Before
	public void setUp() throws Exception {
		String site = "https://www.grocerycrud.com/v1.x/demo/bootstrap_theme_v4/add";
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testeSicredi() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+0+","+350+")");
	driver.findElement(el.from).click();
	driver.findElement(el.fix).click();
	driver.findElement(el.save).click();
	TimeUnit.SECONDS.sleep(3);
	driver.findElement(el.mensagem).getText();
	System.out.println(el.mensagem);
	
	
		
		
	}

}

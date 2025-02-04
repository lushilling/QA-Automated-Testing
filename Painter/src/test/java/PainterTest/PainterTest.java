package PainterTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PainterTest {

	public static WebDriver driver;
	public static String url = "https://www.youidraw.com/apps/painter/";

	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Downloads\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void paintName() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		WebElement pencil = driver.findElement(By.xpath("//*[@id=\"pencil\"]"));
		pencil.click();
		
		Thread.sleep(500);

		Actions draw = new Actions(driver);
		draw.moveByOffset(600, 200).clickAndHold().moveByOffset(0, 100).moveByOffset(100, 0).release().perform();
	
		draw.moveByOffset(50, -100).clickAndHold().moveByOffset(0, 100).moveByOffset(100, 0).moveByOffset(0,-100).release().perform();
		

		Thread.sleep(2000);
	}

	@AfterClass
	public static void teardown() {
		driver.quit();
	}

	//
	// WebElement findElement =
	// driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
	// findElement.sendKeys("kitten");
	// findElement.sendKeys(Keys.ENTER);
	//
	// WebElement imageElement = driver.findElement(By.linkText("Images"));
	// imageElement.click();
	//
	// driver.findElement(By.partialLinkText("cute")).click();
	//

}

package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objs.Home;
import objs.Registration;
import resources.Constants;

public class RegistrationTest {
	
	private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void testRegBtn() {
		driver.navigate().to(Constants.URL);
		Home.clickRegBtn(driver);
		String curentUrl = driver.getCurrentUrl();
		String expectedUrl = Constants.URLREG;
		Assert.assertEquals(curentUrl, expectedUrl);
	}
	
	@Test
	public void testRegForm() {
		driver.navigate().to(Constants.URLREG);
		Registration.inputUsername(driver, "Sasa");
		Registration.inputPassword(driver, "sifra123");
		Registration.inputConfirmPassword(driver, "sifra123");
		Registration.submit(driver);
		String curentUrl = driver.getCurrentUrl();
		String expectedUrl = "http://demo.guru99.com/test/newtours/register_sucess.php";
		Assert.assertEquals(curentUrl, expectedUrl);
	}
	
	@AfterClass
	public void closeDriver() {
		driver.quit();
	}
	
}

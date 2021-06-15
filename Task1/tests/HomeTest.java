package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import resources.Constants;

@SuppressWarnings("unused")
public class HomeTest {


	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		Constants.driver = new ChromeDriver();
		Constants.driver.manage().window().maximize();
	}
	
	@Test
	public void testSearch() {
		Constants.driver.get(Constants.URL_HOME);
		Constants.driver.findElement(By.xpath(Constants.SEARCH_BUTTON)).click();
		Constants.driver.findElement(By.xpath(Constants.SEARCH_FIELD)).sendKeys("testiranje");
		Constants.driver.findElement(By.xpath(Constants.SEARCH_FIELD)).sendKeys(Keys.RETURN);
		File scrFile = ((TakesScreenshot)Constants.driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("C:\\Users\\sasaa\\Desktop\\IT Bootcamp\\Temp\\test.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(Constants.driver.getCurrentUrl(), Constants.URL_TESTIRANJE);
	}
	
	@Test
	public void testVesti() {
		Constants.driver.get(Constants.URL_HOME);
		Constants.driver.findElement(By.xpath(Constants.HEAD_VESTI)).click();
		Constants.driver.findElement(By.xpath(Constants.VESTI_VESTI)).click();
		Assert.assertEquals(Constants.driver.getCurrentUrl(), Constants.URL_VESTI);
	}
	
	@AfterClass
	public void closeDriver() {
		Constants.driver.quit();
	}
	
}



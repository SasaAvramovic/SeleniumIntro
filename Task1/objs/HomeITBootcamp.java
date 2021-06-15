package objs;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import resources.Constants;

public class HomeITBootcamp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
		Constants.driver = new ChromeDriver();
		Constants.driver.get(Constants.URL_HOME);
		Dimension windowsize = Constants.driver.manage().window().getSize();
		Constants.driver.manage().window().maximize();
		String title = Constants.driver.getTitle();
		System.out.println("Title is: " + title);
		Constants.driver.navigate().to(Constants.URL_VESTI);
		Constants.driver.navigate().back();
		Constants.driver.navigate().forward();
		Constants.driver.navigate().refresh();
		Constants.driver.manage().window().setSize(windowsize);
		Constants.driver.quit();
		
	}

}

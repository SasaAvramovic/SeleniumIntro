package resources;

import org.openqa.selenium.WebDriver;

public class Constants {
	
	public static final String URL_HOME = "https://itbootcamp.rs/";
	public static final String SEARCH_BUTTON = "//*[@id=\"masthead\"]/div[2]/div/div/div[2]/a";
	public static final String SEARCH_FIELD = "//*[@id=\"masthead\"]/div[2]/div/div/form/div/div/input";
	public static final String URL_TESTIRANJE = "https://itbootcamp.rs/?s=testiranje";
	public static final String HEAD_VESTI = "//*[@id=\"menu-item-6408\"]/a";
	public static final String VESTI_VESTI = "//*[@id=\"menu-item-5712\"]/a";
	public static final String URL_VESTI = "https://itbootcamp.rs/vesti-2/";
	public static WebDriver driver;
	
}

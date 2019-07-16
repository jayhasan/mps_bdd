package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
/*
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import Util.TestUtill;





public class BaseTest {
	
	
	public static Properties prop;
	public static WebDriver driver;
	//public static final Logger logger = Logger.getLogger(BaseTest.class.getName());
	
	public BaseTest() {
		
		prop= new Properties();
		
		try {
			FileInputStream fle= new FileInputStream("C:\\Users\\19175\\eclipse-workspace\\com.toyota\\src\\test\\java\\Config\\config.properties"); // Path of the Properties file
			prop.load(fle);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initil() {
		
		String browser = prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","\\D:\\JAVA Releted\\chromedriver_win32\\chromedriver.exe\\");// Path of the driver location (Where your driver located/saved)
			driver = new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.gecko.driver",""); // Path of the driver location (Where your driver located/saved)
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtill.PAGELOADOUTTIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtill.IMPLICITYWAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	@BeforeTest
	public void log() {
		
		String log4jConfPath = System.getProperty("user.dir")+"\\src\\main\\java\\lof4j.properties"; // Loger path(start from /src)
		/*PropertyConfigurator.configure(log4jConfPath);*/
	}
	

}











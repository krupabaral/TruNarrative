package Test.Run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialise {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream file=new FileInputStream("C:\\Krupa\\Tech\\Selenium_Handson\\Projects\\TruNarrative\\src\\main\\java\\Test\\Run\\prop.properties");
		
		prop.load(file);
		String browsername = prop.getProperty("browser");
		
		
		if(browsername.equals("chrome")) {
		//Chrome	
			System.setProperty("webdriver.chrome.driver",prop.getProperty("driver"));
			driver = new ChromeDriver();
		}
		else if (browsername.equals("firefox")) {
		//Firefox
		}
		else if (browsername.equals("IE")) {
		//IE
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;

	}

}
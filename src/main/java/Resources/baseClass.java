package Resources;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {
	public WebDriver driver;
	public WebDriver initializeDriver() throws Exception {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\om\\ScratchProjectDemo\\src\\main\\java\\Resources\\data.properties");
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", prop.getProperty("chromepath"));
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;

	}

}

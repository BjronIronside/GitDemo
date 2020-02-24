package ScratchProject;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.baseClass;
import pageObject.LandlingPage;

public class HomePage extends baseClass {

	@BeforeTest
	public void LaunchBrowser() throws Exception {
		driver = initializeDriver();
		driver.get("http://qaclickacademy.com");
		System.out.println("hello world");
		//driver.quit();
	}

	@Test
	public void HomePageAction() {
		LandlingPage LP = new LandlingPage(driver);
System.out.println("hello world123e2e");
		LP.getLogin().click();
	}
}

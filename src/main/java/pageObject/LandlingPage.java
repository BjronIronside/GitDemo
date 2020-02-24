package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandlingPage {
	public WebDriver driver;

	//By loginIn = By.cssSelector("a[href*='sign in']");

	public LandlingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	 @FindBy(xpath = "//span[text()=\"Login\"]")
	 WebElement loginIn;
	public WebElement getLogin() {
		//return driver.findElement(loginIn);
		return loginIn;
	}

}

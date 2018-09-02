package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	WebDriver driver;
	
	public RediffLoginPage(WebDriver driver) {
		
		
		this.driver=driver;
	
	}
	By username=By.xpath("//input[@name='login']");
	By password=By.xpath("//input[@name='passwd']");
	By goButton=By.xpath("//input[@value='Go']");


	
	public WebElement setUserName() {
		
		return driver.findElement(username);
	}

	public WebElement setPassword() {
		
		return driver.findElement(password);
	}

}

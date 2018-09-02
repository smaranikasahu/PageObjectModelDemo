package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {

	
 WebDriver driver;

public RediffLoginPagePF(WebDriver driver) {
		
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}

	@FindBy(xpath="//input[@name='login']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='passwd']")
	WebElement password;
	
	
	@FindBy(xpath="//input[@value='Go']")
	WebElement goButton;
	
	
	public WebElement setUsername() {
		return username;
	}

	public WebElement setPassword() {
		return password;
	}
	public WebElement clickGo() {
		return goButton;
	}


}

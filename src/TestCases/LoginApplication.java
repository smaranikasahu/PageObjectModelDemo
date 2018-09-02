package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.RediffLoginPage;

public class LoginApplication {
	
	@Test
	
	public void login() {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_Latest\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginPage rg= new RediffLoginPage(driver);
		rg.setUserName().sendKeys("hello");
		rg.setPassword().sendKeys("password");
		
		
		
	}

}

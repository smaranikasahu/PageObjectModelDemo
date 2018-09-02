package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.RediffLoginPagePF;

public class LoginApplicationPage1 {
	
@Test
	
	public void login() {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_Latest\\chromedriver.exe\\");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginPagePF pf= new RediffLoginPagePF(driver);
		pf.setUsername().sendKeys("hello");
		pf.setPassword().sendKeys("hi");
		pf.clickGo().click();
		
}
}

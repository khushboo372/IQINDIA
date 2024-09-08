package testClass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import base.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageClass.LoginPage;

public class LoginTest2 extends BaseClass2 {
	
	public static LoginPage2 lpe;
	
	public LoginTest2() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String pageurl=prop.getProperty("url");
		
		driver.get(pageurl);
	}
		
	
	@Test
	public void loginPageTest() {
		
		String user=prop.getProperty("username");
		String pass=prop.getProperty("password");
		
		lpe.enterUsername(user);		
		lpe.enterPassword(pass);
		lpe.clickLogin();
		
	}

}

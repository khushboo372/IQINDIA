package assignment;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.astroyogi.com/kundli");
		driver.findElement(By.id("Kund_Name")).sendKeys("Manya");
		WebElement we=driver.findElement(By.id("UserGender"));
		
		Select sl=new Select(we);
		sl.selectByVisibleText("Female");
		
		WebElement date=driver.findElement(By.id("Date"));
		Select sl2=new Select(date);
		sl2.selectByVisibleText("5");
		
		
		
	}

}

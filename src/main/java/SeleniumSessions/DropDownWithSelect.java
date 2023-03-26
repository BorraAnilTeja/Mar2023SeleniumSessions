package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithSelect {
	static WebDriver driver;
	public static void main(String[] args) {

		 driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		By country =By.id("Form_getForm_Country");
		ElementUtil ele = new ElementUtil(driver);
	//	ele.doSelectDropDownByIndex(country, 5);
	//	ele.doSelectDropDownByValue(country, "Canada");
//	ele.doSelectDropDownByVisibleText(country, "India");
	ele.doSelectDropDownValue(country, "China");
//		
		
	}

}

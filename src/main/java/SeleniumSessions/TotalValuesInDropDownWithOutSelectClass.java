package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalValuesInDropDownWithOutSelectClass {

	public static void main(String[] args) {

WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		List<WebElement> optionList =driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));
		
		for(WebElement e: optionList) {
			String text =e.getText();
			System.out.println(text);
		}
		
		
	}

}

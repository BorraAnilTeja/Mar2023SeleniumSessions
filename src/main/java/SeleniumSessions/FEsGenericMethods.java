package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FEsGenericMethods {
	static WebDriver driver;
	public static void main(String[] args) {

		 driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/demo/");
		
		By footerLinks = By.xpath("//ul[@class='footer-nav']//a");
		
	List<String>	actEleList = getElementsTextList(footerLinks);
	if(actEleList.contains("Investors")) {System.out.println("PASS");}
	if(actEleList.contains("Customers")) {System.out.println("PASS");}
	if(actEleList.contains("Partners")) {System.out.println("PASS");}
			int totalEleList =totalElementsCount(footerLinks);
			if(totalEleList==19) {
				System.out.println("footer count--PASS");
			}
	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static int  totalElementsCount(By locator) {
		return getElements(locator).size();
	}
	public static List<String> getElementsTextList(By locator) {
		List<WebElement>footerList =getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		
		for(WebElement e :footerList) {
			String text = e.getText();
			eleTextList.add(text);
		}
		return eleTextList;
	}

}

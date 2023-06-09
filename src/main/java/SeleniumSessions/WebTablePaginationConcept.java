package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePaginationConcept {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);
		
		
		while(true) {
			if(driver.findElements(By.xpath("//td[text()='India']")).size()>0) {
				selectMultipleCountry("India");
			
				//pagination logic
				WebElement Next = driver.findElement(By.linkText("Next"));
				
				      if(Next.getAttribute("class").contains("disabled")) {
					     System.out.println("pagination is over...");
					     break;
				}
				Next.click();
				Thread.sleep(1000);
			}
		}
		
//single country
		
//		while(true) {
//			if(driver.findElements(By.xpath("//td[text()='Hong Kong']")).size()>0) {
//				selectCountry("Hong Kong");
//				break;
//			}
//			else {
//				WebElement next = driver.findElement(By.linkText("Next"));
//				
//				if(next.getAttribute("class").contains("disabled")) {
//					System.out.println("pagination is over...ele not found");
//					break;
//				}
//				next.click();
//				Thread.sleep(2000);
//				
//				
//				
//			}
//		}
//		
		
	}
	
	public static void selectCountry(String Country) throws InterruptedException {
		
		driver.findElement(By.xpath("//td[text()='"+Country+"']/preceding-sibling::td/input[@type='checkbox']")).click();
		
	}
	public static void selectMultipleCountry(String Country) {
		List<WebElement> countryList = driver.findElements(By.xpath("//td[text()='"+Country+"']/preceding-sibling::td/input[@type='checkbox']"));
		for(WebElement e: countryList) {
			e.click();
		}
	}
}
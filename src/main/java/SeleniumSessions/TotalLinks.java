package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		//1.total links
		//2.print each link text
		//3.avoid the blank text
		List<WebElement>linksList =driver.findElements(By.tagName("a"));
		
		System.out.println("total links :"+linksList.size());
		
		for(WebElement e:linksList) {
			String text =e.getText();
			if(!(text.length()==0)){
				System.out.println(text);
			}
			
			
		}
		
		
	}

}

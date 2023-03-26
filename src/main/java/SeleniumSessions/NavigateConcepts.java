package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateConcepts {


	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://www.google.com");
		driver.get("https://www.amazon.com");

		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.close();
		
	}

}

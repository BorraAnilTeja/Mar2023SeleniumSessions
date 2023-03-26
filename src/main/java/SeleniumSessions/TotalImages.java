package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
       List<WebElement>imgList =driver.findElements(By.tagName("img"));
		
		System.out.println("total links :"+imgList.size());
		
		//print src, alt, height of each image:
		for(WebElement e:imgList) {
		String srcVal=	e.getAttribute("src");
		String altVal=	e.getAttribute("alt");
		String  heightVal=	e.getAttribute("height");
		
		System.out.println(srcVal + "||"+altVal+"||"+heightVal);

		}
		
	}

}

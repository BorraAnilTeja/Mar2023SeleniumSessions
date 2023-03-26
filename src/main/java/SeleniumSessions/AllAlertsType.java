package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllAlertsType {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
		WebElement alertBtn =driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		WebElement cnfmBtn =driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		WebElement prmptBtn =driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		
		alertBtn.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		
		cnfmBtn.click();
		Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();
		Thread.sleep(2000);

        prmptBtn.click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Hello testing please exit");
		alert3.accept();
		Thread.sleep(2000);

		
		

	}

}

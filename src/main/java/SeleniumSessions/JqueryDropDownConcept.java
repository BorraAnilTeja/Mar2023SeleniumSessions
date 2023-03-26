package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownConcept {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

          driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(2000);
		
      	By choices =By.xpath("//span[@class='comboTreeItemTitle']");
      	selectChoice(choices,"choice 1");
      //	selectChoice(choice,"choice 1","choice 2","choice 3","choice 4");
      //	selectChoice(choices,"all");
    //  	selectChoice(choices,"choice 9");
      	
	}
	public static void selectChoice(By locator,String...choice ) {
		List<WebElement> choiceList = driver.findElements(locator);
		boolean flag = false;
		if(!choice[0].equalsIgnoreCase("all")) {
		for(WebElement e : choiceList) {
			String text = e.getText();
			for(int i=0;i<choice.length;i++) {
				if(text.equals(choice[i])) {
					flag=true;
					e.click();
					break;
				}
				
			}
		}
		}
		else {
			try {
			for(WebElement e:choiceList) {
				flag=true;
				e.click();
			}
			}
			catch(Exception e) {
			}
			
			}
		if(flag==false) {
			System.out.println("choice is not available : "+choice[0]);
		}
		}
	}



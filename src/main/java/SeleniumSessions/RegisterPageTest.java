package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPageTest {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		WebDriver driver =br.launchBrowser("chrome");
		br.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
		System.out.println(br.getPageTitle());
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		
		By firstName =By.id("input-firstname");
		By lastName =By.id("input-lastname");
		By emailId =By.id("input-email");
		By telephone =By.id("input-telephone");
		By password =By.id("input-password");
		By confirm_Password =By.id("input-confirm");
		By newsLetter = By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
		By agree = By.name("agree");
		By continue_btn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		By logOut=By.linkText("Logout");
		
		eleUtil.doSendKeys(firstName, "Aniltttt");
		eleUtil.doSendKeys(lastName, "Teja");
		eleUtil.doSendKeys(emailId, "Aniltt@gmail.com");
		eleUtil.doSendKeys(telephone, "9808900099");
		eleUtil.doSendKeys(password, "Anilttt@123");
		eleUtil.doSendKeys(confirm_Password, "Anilttt@123");
		eleUtil.doClick(newsLetter);
		eleUtil.doClick(agree);
		eleUtil.doClick(continue_btn);
		
		boolean flag = eleUtil.isDisplayed(logOut);	
		
		if(flag==true) {
			System.out.println("account created succesfully");
		}
		else {
			System.out.println("Acoount creation not done ");
		}
		br.quitBrowser();
	}
	

}

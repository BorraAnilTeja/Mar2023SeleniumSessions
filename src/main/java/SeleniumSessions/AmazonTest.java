package SeleniumSessions;

public class AmazonTest {

	public static void main(String[] args) {
		
		String browserName="chrome";
		String url = "https://www.amazon.in/";

		BrowserUtil br = new BrowserUtil();
		br.launchBrowser(browserName);
		br.launchUrl(url);
		String actTitle =br.getPageTitle();
		
		System.out.println(actTitle);
		
		//validation
		
	       if(actTitle.contains("Amazon")) {
	    	   System.out.println("Correct Title");
	       }else {
	    	   System.out.println("Incorrect title");
	       }
	       br.quitBrowser();
		
	}

}

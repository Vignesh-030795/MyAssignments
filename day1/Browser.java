package week2.day1;

public class Browser {
	
	public String launchBrowser() {
	return "Browser launched";
	}
	
	public void loadUrl() {
		System.out.println("Loaded");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
Browser BrowserOptions = new Browser();
System.out.println();
BrowserOptions.launchBrowser();
BrowserOptions.loadUrl();

	}

}

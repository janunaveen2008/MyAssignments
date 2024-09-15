package week1.day3;

public class Browser {
	 public String launchBrowser(String browserName) {
	
     System.out.println("Browser launched successfully");
     return "google";
	}
	public void loadUrl() {
		// TODO Auto-generated method stub
System.out.println("Application url loaded successfully");
	}
		
	 
	public static void main(String[] args) {
		Browser object=new Browser();
		

		object.loadUrl();
		System.out.println(object.launchBrowser("google"));
	}

}

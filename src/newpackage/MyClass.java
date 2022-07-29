package newpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
			
				
				driver.get("http://demo.guru99.com/test/newtours/");
				String actualResult= "Welcome: Mercury Tours";
				String acceptedResult ="";
				
				acceptedResult = driver.getTitle();
				
				
				if (actualResult.contentEquals(acceptedResult)) {
					System.out.println("Title matches");
				}
					else {
						System.out.println("no match");
						
				}	
	}
	
}

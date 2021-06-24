import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid {
	WebDriver d;

	public void access_grid() throws MalformedURLException {
		
		// link provided to execute the test script to execute in node 
		
		String nodeURL = "http://192.168.0.103:4444/wd/hub";
		
		//Provide the Chrome driver location 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samdany\\Desktop\\chromedriver.exe");
		
		// Setting up the chrome option class for setting up the capabalities and connect  -> browser opened in debugger mode 
		ChromeOptions options = new ChromeOptions();
		options.setCapability("platform", "WINDOWS");
		options.setCapability("browser", "chrome");
		options.setExperimentalOption("debuggerAddress", "localhost:9228");
		
	    // Setting up the Remote Web driner 
		
	    d = new RemoteWebDriver(new URL(nodeURL), options);
	    
	    // Locating the webelements in already opened browser
	    
	    d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
	    d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oppo phones");;
	    
	}

	public static void main(String[] args) throws MalformedURLException {
     Grid g = new Grid();
     g.access_grid();
	}

}

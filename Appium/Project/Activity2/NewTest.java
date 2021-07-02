package Activity2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class NewTest {
	  AppiumDriver<MobileElement> driver = null;
		 
	    @BeforeTest
	    public void setup() throws MalformedURLException {
	 
	        // Set the Desired Capabilities
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability("deviceName", "Pixel 4 API 28");
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("appPackage", "com.google.android.keep");
	        caps.setCapability("appActivity", "activities.BrowseActivity");
	        caps.setCapability("noReset", true);
	 
	        // Instantiate Appium Driver
	        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	    }
	 
	    @Test
	    public void testSearchAppium() {
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        System.out.println("Google Keep is open");
	       
	      driver.findElementById("new_note_button").click();
	      driver.findElementById("menu_pin").click();
	     driver.findElementById("editable_title").sendKeys("Check");
	   
	    driver.findElementById("edit_note_text").sendKeys("Successfully need to be finished");
	 
	   driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
	   String t=driver.findElementByXPath("//android.widget.TextView[@text='Check']").getText();
	  // System.out.printf("Text is +" ,t);
	   Assert.assertEquals(t,"Check");
	   
	 
	      
	       
	      
	
	    }
	 
	   

		@AfterTest
	    public void tearDown() {
	        //driver.quit();
	    }
}

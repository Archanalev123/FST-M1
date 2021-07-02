package Activity3;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activityclass {
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
	    System.out.println("task opened");
	     driver.findElementById("menu_pin").click();
	     driver.findElementById("editable_title").sendKeys("IBM Task");
	   
	    driver.findElementById("edit_note_text").sendKeys("Done with Appium");
	 
	   driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]").click();
	   driver.findElementByXPath("//android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[1]").click();
	 
	   driver.findElementById("menu_reminder").click();
	     driver.findElementById("menu_text").click();
	     System.out.println("success");
	  //     driver.findElementById("add_task_done").click();
	   
	   //    driver.findElementById("tasks_fab").click();
	  //     driver.findElementById("add_task_title").sendKeys("Complete the second Activity Google Keep");
	     
	   //    driver.findElementById("add_task_done").click();*/
	      
	       
	      
	
	    }
	 
	   

@AfterTest
	    public void tearDown() {
	        //driver.quit();
	    
  }

}
package AlchemyActivitiesTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity1 {
	  WebDriver driver;
	    
	    @BeforeTest
	    public void beforeMethod() {
	        //Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();
	            
	        //Open the browser
	        driver.get("https://alchemy.hguy.co/lms");
	    }
	    
	    @Test
	    public void testCase1() {
	    	 String title=driver.getTitle();
	    	 Assert.assertEquals(title,"Alchemy LMS – An LMS Application");
	    	  System.out.println("Title is matching");
	    	  
	    }
	  
	 
	    @AfterTest
	    public void afterMethod() {
	        //Close the browser
	        driver.close();
	    }
  }


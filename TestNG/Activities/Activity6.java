package AlchemyActivitiesTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity6 {
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
	    	driver.findElement(By.linkText("My Account")).click();
			String title=driver.getTitle();
			System.out.println("Title of page " + title);
			Assert.assertEquals(title,"My Account � Alchemy LMS");
	    }
	    
	    @Test
	    public void testcase2() {
	    	driver.findElement(By.cssSelector(".ld-login")).click();
	    	
	      
	    	driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");

	    	driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");
	    	
	    	driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
	    	
	    }
	    @Test
	    public void testcase3() {
	    	driver.findElement(By.cssSelector("h1.uagb-ifb-title")).click();
	    	String title=driver.getTitle();
			System.out.println("Title of page " + title);
			Assert.assertEquals(title,"My Account � Alchemy LMS");
	      
	    	
	    }
	    
	    
	 
	    @AfterTest
	    public void afterMethod() {
	        //Close the browser
	        driver.close();
	    }
	 
	}


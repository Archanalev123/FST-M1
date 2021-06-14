package AlchemyActivitiesTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity2 {
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
    	WebElement t=driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']"));
    	t.equals("“Learn from Industry Experts");
    	 System.out.println("Heading is matching");
    	
    	  
    }
  
 
    @AfterTest
    public void afterMethod() {
        //Close the browser
        driver.close();
    }
  }


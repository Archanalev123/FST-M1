package AlchemyActivitiesTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Activity3 {
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
    	WebElement t=driver.findElement(By.xpath("//h3[@class='uagb-ifb-title']"));
		String title=t.getText();
		System.out.println("Title of page"+ title);
    }
  
 
    @AfterTest
    public void afterMethod() {
        //Close the browser
        driver.close();
    }
  }

package AlchemyActivitiesTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity9 {
 
WebDriver driver;
    
    @BeforeTest
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
            
        //Open the browser
        driver.get("https://alchemy.hguy.co/lms");
    }
    
 
    
    @Test
    public void testcase2() throws InterruptedException{
    	driver.findElement(By.linkText("All Courses")).click();
		driver.findElement(By.xpath("/html/body/div/div/div/div/main/article/div/section[2]/div[2]/div/div/div/div[1]/article/a/img")).click();
  
	 driver.findElement(By.xpath("//*[@id=\"ld-expand-83\"]")).click();
		
    
	Thread.sleep(1000);
    	String ch= driver.getTitle();
    			
    	
    	System.out.println(ch);
    }
 
    
    
 
    @AfterTest
    public void afterMethod() {
        //Close the browser
        driver.close();
    }
}

package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver = new FirefoxDriver();
       driver.get("https://www.training-support.net");
       String p=driver.getTitle();
       System.out.println("The title of page" + p);
   
        driver.findElement(By.xpath("//a[@id='about-link']")).click();
       String title =driver.getTitle();
       System.out.println("The title of new page " + title);
        

	}

}
 
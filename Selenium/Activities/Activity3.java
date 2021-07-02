package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver =new FirefoxDriver();
driver.get("https://training-support.net/selenium/simple-form");
String p=driver.getTitle();
System.out.println("The title of page " + p);
 driver.findElement(By.id("firstName")).sendKeys("Archana");
 Thread.sleep(100);
driver.findElement(By.id("lastName")).sendKeys("Mishra");
Thread.sleep(100);
driver.findElement(By.id("email")).sendKeys("arc_55555@gmail.com");
Thread.sleep(100);
driver.findElement(By.id("number")).sendKeys("9620597719");
Thread.sleep(10000);

driver.findElement(By.xpath("//input[@value='submit']")).click();
Thread.sleep(10000);


	}

}

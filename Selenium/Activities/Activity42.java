package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		String title =driver.getTitle();
		System.out.println("The title of page is " + title);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Archana");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Mishra");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("arc@gmail.com");
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("9845673420");
		driver.findElement(By.xpath("//textarea[@rows=2]")).sendKeys("I want to join your network");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	}

}

package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity52 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String title = driver.getTitle();
		System.out.println("The title of page" + title);
		WebElement check = driver.findElement(By.xpath("//label[@class='willDisappear']"));
		
	
		System.out.println("The checkbox selected" + 	check.isSelected());
		
		check.click();
		Thread.sleep(50);
		
	
	
		System.out.println("The checkbox selected after click " + check.isSelected());
	}


}
package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String title = driver.getTitle();
		System.out.println("The title of page" + title);
		WebElement check = driver.findElement(By.xpath("//label[@class='willDisappear']"));
		Boolean check1 = check.isDisplayed();
		System.out.println("The radio input displayed" + check1);	
	
		driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
		
		boolean tr1=driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).isDisplayed();
		
System.out.println("The checkButton displayed" + tr1);
	}

}

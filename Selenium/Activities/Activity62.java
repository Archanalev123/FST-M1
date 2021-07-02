package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.get("https://training-support.net/selenium/ajax");
		
		String str=driver.getTitle();
		
		driver.findElement(By.xpath("//button[@class='ui violet button']")).click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id(""),"HELLO!"));
		WebElement str1=driver.findElement(By.xpath("//button[@class='ui violet button']"));
		System.out.println(str1);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id(""),"HELLO!"));
		
		
		
		

	}

}

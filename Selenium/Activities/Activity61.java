package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.get(" https://training-support.net/selenium/dynamic-controls");
		
		String str=driver.getTitle();
		System.out.println("tile of page" +str);
		WebElement str1 = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		WebElement str2 = driver.findElement(By.xpath("//input[@class='willDisappear']"));
			str1.click();
			
		System.out.println(wait.until(ExpectedConditions.invisibilityOf(str2)));
		
		str1.click();
		
		System.out.println(wait.until(ExpectedConditions.visibilityOf(str2)));
		  str2.click();
		
		

	}

}

package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aactivity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.training-support.net");
				String title = driver.getTitle();
			
			System.out.println("The name of webpage "+title);
			WebElement idloc=driver.findElement(By.id("about-link"));
			System.out.println("The name of webpage "+idloc.getText());
			String c1= idloc.getCssValue("color");
			System.out.println(c1);
			WebElement clsname=driver.findElement(By.className("green"));
			System.out.println("The name of webpage "+clsname.getText());
		
			WebElement lintxt=driver.findElement(By.linkText("About Us"));
			System.out.println("The name of webpage "+lintxt.getText());
			WebElement cssSelec=driver.findElement(By.cssSelector(".green"));
			System.out.println("The name of webpage "+cssSelec.getText());
			
			
				

	}

	
}

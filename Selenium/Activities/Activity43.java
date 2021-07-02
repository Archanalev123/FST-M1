package selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new FirefoxDriver();
driver.get("https://www.training-support.net/selenium/target-practice");
String title = driver.getTitle();
System.out.println("The title of page is " + title);
WebElement thirdheader = driver.findElement(By.xpath("//h3[@id='third-header']"));
String head3 = thirdheader.getText();
System.out.println("The third header of page is " + head3);
WebElement fifthheader = driver.findElement(By.xpath("//h5"));
String head5 = fifthheader.getCssValue("color");
System.out.println("The fifth header of Css value is " + head5);
WebElement vcol = driver.findElement(By.xpath("//button[@class='ui violet button']"));
String vcol1=vcol.getAttribute("class");
System.out.println("The violet colour attribute of class is " + vcol1);
WebElement grey = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div[3]/button[2]"));
String grey1=grey.getText();
System.out.println("The grey colour value of class is " + grey1);


		

	}

}

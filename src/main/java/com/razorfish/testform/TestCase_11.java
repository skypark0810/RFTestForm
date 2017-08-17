package com.razorfish.testform;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

/**
Negative Test - correct first name, wrong last name(with number) and correct phone number.
 *
 */

public class TestCase_11   
{
    public static void main( String[] args )
    {
    	 System.setProperty ("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
    	 WebDriver driver = new ChromeDriver();
    	 driver.manage().window().maximize();
    	 driver.findElement(By.xpath("/html/body/div/form/input[1]")).sendKeys("Leping");
    	 driver.findElement(By.xpath("/html/body/div/form/input[2]")).sendKeys("Guo8");
    	 driver.findElement(By.xpath("/html/body/div/form/input[3]")).sendKeys("647-545 8440");
    	 driver.findElement(By.xpath("/html/body/div/form/button[1]")).click();  
    	 
    	 // verify not being submitted.    	 
    	 String expectedContent = "Test Form";
    	 String actualContent = driver.findElement(By.xpath("/html/body/div/h1")).getText();            	 
    	 Assert.assertEquals(expectedContent,actualContent); 
    	 
    	 driver.close();
    	 
    }
}

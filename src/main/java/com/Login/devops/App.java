package com.Login.devops;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver","/home/edureka/driver/chromedriver");
    	ChromeOptions chromeOptions = new ChromeOptions();
    	WebDriver driver = new ChromeDriver(chromeOptions);
    	System.out.println("SeleniumWebDriver Test");
    	driver.get("http://localhost:3001");
    	   	
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	driver.findElement(By.className("v-button")).click();
    	driver.findElement(By.id("login")).sendKeys("edureka");
    	driver.findElement(By.id("password")).sendKeys("edureka");
       	driver.findElement(By.className("v-button-primary")).click();
    	//Thread.sleep(5000);
       	System.out.println("complted");
    	driver.quit();
    }
}

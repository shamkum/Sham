package com.org.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ReUse {
	public static WebDriver driver;
	public static WebDriver getdriver(String browser){
		if(browser.equals("chrome")){
			System.setProperty("webdiver.chrome.driver", "C:/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
			driver = new FirefoxDriver();
		}else{
			System.out.println("Enter Valid Browser");
		}
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		return driver;
	}
	public static void winhan(int index){
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> l = new ArrayList<String>(windowHandles);
		driver.switchTo().window(l.get(index));
	}
	public static void drpdwn(WebElement element, int index){
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	public static void drpdwn(WebElement element, String visibletext){
		Select s = new Select(element);
		s.selectByVisibleText(visibletext);
	}
	public static void mouseover(WebElement target){
		Actions act = new Actions(driver);
		act.moveToElement(target).build().perform();
	}
	public static void frames(WebElement arg0){
		driver.switchTo().frame(arg0);
	}
	public static void waits(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}

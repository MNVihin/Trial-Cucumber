package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	private static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {
		return tdriver.get();
	}

	public static void launchChromeBrwoser(WebDriver driver) {
		driver=new ChromeDriver();
		
		tdriver.set(driver);
	}
	public static void launchFirefoxBrwoser(WebDriver driver) {
		driver=new FirefoxDriver();
		
		tdriver.set(driver);
	}

	public static void launchEdgeBrwoser(WebDriver driver) {
		driver=new EdgeDriver();
		
		tdriver.set(driver);
	}
	public static void launchSafariBrwoser(WebDriver driver) {
		driver=new SafariDriver();
		
		tdriver.set(driver);
	}
	


	
    //url
	public static void launchUrl(String url) {
		getDriver().get(url);
	}

	// sendKeys
	public static void sendKeys(WebElement ele, String val) {
		ele.sendKeys(val);
	}

	// Click
	public static void click(WebElement ele) {
		ele.click();
	}

}
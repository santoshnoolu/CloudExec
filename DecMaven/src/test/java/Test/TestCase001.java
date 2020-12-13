package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase001 {
public static WebDriver driver;
@BeforeMethod
public void setup()
{
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	}
@Test
public void m1()
{
driver.get("https://www.google.com");	
System.out.println("Navigated to Google.com");
System.out.println(driver.getTitle());
System.out.println(driver.getPageSource());
System.out.println(driver.getCurrentUrl());
}
@Test
public void m2()
{
	driver.get("https://www.amazon.in");
	System.out.println("Navigated to Amazon.in");
	System.out.println(driver.getTitle());
	System.out.println(driver.getPageSource());
	System.out.println(driver.getCurrentUrl());
}
@AfterMethod
public void teardown()
{
	driver.quit();
	}
}

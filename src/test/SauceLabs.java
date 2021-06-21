package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SauceLabs {

	  public static final String URL = "http://127.0.0.1:4723/wd/hub";
	 
	  public static void main(String[] args) throws Exception {
	 
 
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("platform", "Android");
		caps.setCapability("platform", "Android");
		caps.setCapability("platform", "Android");
		caps.setCapability("version", "9.1");
		caps.setCapability("deviceName", "Emulator");
		caps.setCapability("appPackage", "com.Android.SauceLabs.Mobile.Sample.app");
		caps.setCapability(MobileCapabilityType.APP, "D:\\Work\\Selenium\\Appium\\Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
		caps.setCapability("appActivity", ".MainActivity");
		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
		//invoke .exe file
		System.setProperty("webdriverchrome.driver", "Drivers\\Chromedriver.exe");
	 
		//Go to the login screen
		driver.findElement(By.id("Login Screen")).click();
		driver.findElement(By.name("Enter your name")).sendKeys("Mustafa"); 
		driver.findElement(By.className("android.saucelabapp.Button")).click(); 
		driver.findElement(By.className("android.saucelabapp.EditText")).sendKeys("@chjshyy"); 
		
		driver.findElement(By.xpath("//android.saucelab.Button[@index='1']")).click();
		 
		//Get the title and print it
		System.out.println(driver.getTitle());
		
		//Print page source
		System.out.println(driver.getPageSource());
			
		 // Selecting first product
	    driver.findElement(By
	        .xpath("//android.sauceLabs.Products[@text-'SauceLabs']"));
	    String name = driver.findElement(By.className("title")).getText();
	    

	    //Adding selected product to cart
	    driver.findElement(By.xpath("//android.sauceLabs.Cart[@id='Add to Cart']")).click();
	    Thread.sleep(3000);

	    //Checking product is available in cart or not
	    driver.findElement(By.xpath("//android.sauceLabs.Cart[@class='cart-label']")).click();
	    Thread.sleep(5000);
			
		//Close all the browsers
		driver.quit();

	}

}

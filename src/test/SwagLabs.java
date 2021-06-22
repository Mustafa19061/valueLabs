package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwagLabs extends  BaseClass  {

	 @Test
    public void testOne() throws InterruptedException {
 	 
		//Go to the login screen
		driver.findElement(By.id("Login Screen")).click();
		driver.findElement(By.name("Enter your name")).sendKeys("Mustafa"); 
		driver.findElement(By.className("android.saucelabapp.Button")).click(); 
		driver.findElement(By.className("android.saucelabapp.EditText")).sendKeys("@chjshyy"); 
		
		driver.findElement(By.xpath("//android.saucelab.Button[@index='1']")).click();
	     MobileElement productPage = driver.findElement(By.id("prd_page"));

        List<MobileElement> elements = driver.findElements(By.className("android.widget.PageView"));
        List<MobileElement> srpElements = driver.findElements(By.className("android.widget.RelativeLayout"));

        for (int i = 0; i < elements.size(); i++) {
            String str1 = elements.get(i).getText().toString();
            System.out.println(str1.toLowerCase());
            Assert.assertTrue(str1.toLowerCase().contains(patternSearchTxt1));
        }

        srpElements.get(0).click();
		 
		//Get the title and print it
		
	      String actualTitle = driver.getTitle();
              String expectedTitle = "Swag Labs";
              Assert.assertEquals(expectedTitle,actualTitle);

		
		//Print page source
		System.out.println(driver.getPageSource());
	    
    }
	
	 @Test
    public void testTwo() throws InterruptedException {
	
		 // Selecting first product
	    driver.findElement(By
	        .xpath("//android.sauceLabs.Products[@text-'SauceLabs']"));
	    String name = driver.findElement(By.className("title")).getText();
	    MobileElement logoview;

	    //Adding selected product to cart
	    driver.findElement(By.xpath("//android.sauceLabs.Cart[@id='Add to Cart']")).click();
	  

	    //Checking product is available in cart or not
	    driver.findElement(By.xpath("//android.sauceLabs.Cart[@class='cart-label']")).click();
	  
	 Assert.assertTrue(logoview.isEnabled());
       
		
	}

}

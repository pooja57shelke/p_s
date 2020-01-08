package CsCart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google 
{
	
	static WebElement dropMonth;
	static WebElement dropYear;
	WebElement searchbox;
	private static CharSequence captchaVal;
    public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "F:\\\\visionit\\\\chromedriver.exe");
	WebDriver Driver=new ChromeDriver();
	Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Driver.manage().window().maximize();
	Driver.navigate().to("https://www.google.com/");
     WebElement element = Driver.findElement(By.name("q"));
     element.sendKeys("Cheese!");
     element.submit();

     //driver.close();

    //Insert code here to locate and click on Search button
	Driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
	Driver.findElement(By.id("_fZl")).click();
	//use linkText to find the search button
	/*Driver.findElement(By.linkText("Google Search")).click();
	//search by simulating Enter Button click on the search text box, after entering the text to search.
	Driver.findElement(By.id("lst-ib")).sendKeys(Keys.RETURN);
	//search_box = driver.find_element_by_name('q') search_box.send_keys("keyword") search_box.submit()
	*/
}
}

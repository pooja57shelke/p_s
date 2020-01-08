package CsCart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;
@Test
public class Register 
{
	static WebElement dropMonth;
	static WebElement dropYear;
	private static CharSequence captchaVal;
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "F:\\\\visionit\\\\chromedriver.exe");
	WebDriver Driver=new ChromeDriver();
	Driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Driver.manage().window().maximize();
	Driver.navigate().to("http://demo.cs-cart.com/stores/cdd2d6e533ba997a/");
	Reporter.log("URL Opened <br>",true);

	//My Account
	Driver.findElement(By.xpath("//*[@id=\"sw_dropdown_4\"]/a/span")).click();
	//Register
	Driver.findElement(By.xpath("//*[@id=\"account_info_4\"]/div[2]/a[2]")).click();
	

	Driver.findElement(By.xpath("//*[@id=\"elm_6\"]")).sendKeys("Pooja");
	Driver.findElement(By.xpath("//*[@id=\"elm_7\"]")).sendKeys("Shelke");   
	Driver.findElement(By.xpath("//*[@id=\"elm_9\"]")).sendKeys("+917709575592");
	Driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("pooja29shelke@gmail.com");
	Driver.findElement(By.xpath("//*[@id=\"password1\"]")).sendKeys("Pooja@123");
	Driver.findElement(By.xpath("//*[@id=\"password2\"]")).sendKeys("Pooja@123");
	//DOB
	Driver.findElement(By.xpath("//*[@id=\"birthday\"]")).click();
	//month
	dropMonth=Driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	Select months =new Select(dropMonth);
	months.selectByVisibleText("Jan");
	//year
	dropYear=Driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	Select year=new Select(dropYear);
	year.selectByVisibleText("1994");
	//date
	Driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[3]/a")).click();
	//Radiobtn
	Driver.findElement(By.xpath("//*[@id=\"profile_mailing_list_1\"]")).click();
	//robot
	//Driver.findElement(By..click();
	Driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).sendKeys(captchaVal);
	Reporter.log("User Details entered <br>",true);
	Driver.findElement(By.xpath("//button[@type='submit']")).click();
	Reporter.log("Click on Sign In <br>",true);
	
	
	
	
}
}

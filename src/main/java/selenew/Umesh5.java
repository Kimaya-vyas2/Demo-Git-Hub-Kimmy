package selenew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Umesh5 {

static WebDriver driver;
	
	public static WebElement getelement(By username3) {
	return driver.findElement(username3);
		
	}
	
	public static void dosendkeys(By username3, String value) {
	driver.findElement(username3).sendKeys(value);
	}
		
	
	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		
		//Method1
		//Navigate to url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		By username1 = (By.name("username"));
		By password1 = (By.name("password"));	
		
		dosendkeys(username1, "Admin");
		dosendkeys(password1, "admin123");
		
	}}	
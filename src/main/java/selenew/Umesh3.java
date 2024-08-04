package selenew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Umesh3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		
		//Method1
		//Navigate to url
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		By username1 = (By.name("username"));
		By password1 = (By.name("password"));	
		
		WebElement username2 = driver.findElement(username1);
		WebElement	password2 = driver.findElement(password1);
		
		username2.sendKeys("Admin");
		password2.sendKeys("admin123");
	}

}

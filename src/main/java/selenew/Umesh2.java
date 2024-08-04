package selenew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Umesh2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Initialize chrome driver
				WebDriver driver= new ChromeDriver();
				
				//Method1
				//Navigate to url
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				driver.manage().window().maximize();
				
				Thread.sleep(2000);
				
				WebElement username = driver.findElement(By.name("username"));
				
				WebElement password = driver.findElement(By.name("password"));
				username.sendKeys("Admin");
				password.sendKeys("admin123");
				
	}

}

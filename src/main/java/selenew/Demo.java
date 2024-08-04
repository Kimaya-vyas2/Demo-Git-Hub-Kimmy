package selenew;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Launch chrome  browser
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\prach\\Desktop\\DemoTestMavenProject\\Test1\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximise browser
		driver.manage().window().maximize();
		
		//open url
		driver.get("https://the-internet.herokuapp.com/upload");
		
		//find choose file web element
		WebElement button= driver.findElement(By.id("file-upload"));
		
		Actions act = new Actions(driver);
		act.moveToElement(button).click().perform();
		
		try {
			Runtime.getRuntime().exec("C://Users//prach//Desktop//Autoit//FileUpload.exe" + " " + "C:\\Users\\upadh\\OneDrive\\Desktop");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}

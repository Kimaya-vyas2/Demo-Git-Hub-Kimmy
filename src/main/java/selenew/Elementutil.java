	package selenew;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	
	public class Elementutil {
	
	WebDriver driver;
	
	public WebElement getElement(By Lockobj) {     // 1 METHOD
	return driver.findElement(Lockobj); 
		
	}
			
	public void dosendkeys(By Lockobj, String value) {       // 2 METHOD
	getElement(Lockobj).sendKeys(value);
				
	}
	
	public Elementutil(WebDriver driver) {
	this.driver = driver;
	
	
	}
	
	

	
	
	
	}
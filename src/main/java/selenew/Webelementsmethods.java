	package selenew;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Webelementsmethods {
		
	static WebDriver driver;                  // Part of 4 method globally define

	public static void main(String[] args) throws InterruptedException {
		
	//Initialize chrome driver
//	WebDriver driver = new ChromeDriver();
//	
//	// 1 METHOD OF WEB ELEMENT
//	
//	//Navigate to url
//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	
//	driver.manage().window().maximize();
//	
//	Thread.sleep(2000);
//	
//	driver.findElement(By.name("username")).sendKeys("Admin");
//	
//	driver.findElement(By.name("password")).sendKeys("admin123");
//	
//	
	// 2 METHOD OF WEB ELEMENT
	
//	WebDriver driver = new ChromeDriver();
//
//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//
//	driver.manage().window().maximize();
//	
//    Thread.sleep(2000);
//  
//	// 1
//	WebElement user = driver.findElement(By.name("username"));      // Make a webelement and assign it to user object
//
//	WebElement pwd = driver.findElement(By.name("password"));
//	
//	Thread.sleep(2000);
//    
//	// 2
//	user.sendKeys("Admin");           // Call by object user
//	
//	pwd.sendKeys("admin123");
//		
	
	// 3 METHOD OF WEB ELEMENT
		
//	WebDriver driver = new ChromeDriver();
//	
//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
// 
//	driver.manage().window().maximize();
//
//	Thread.sleep(2000);
//
//	// 1
//	By userele = By.name("username");                // Define a By locator for the username input field using its name attribute
//
//	By pwdele = By.name("password"); 
//	
//	// 2
//	WebElement user = driver.findElement(userele);   // Locate the web element for the username and  defined locator 'userele' and assign it to the 'user' variable
//
//	WebElement pwd = driver.findElement(pwdele);
//	
//	// 3
//	user.sendKeys("Admin");             // Call by user object 
//	pwd.sendKeys("admin123");
//	
	// 4 METHOD OF WEB ELEMENT
			
//	 driver = new ChromeDriver();
//	 
//	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	 
//	 driver.manage().window().maximize();
//
//	// 1
//	 By user = By.name("username");
//	 By pwd = By.name("password");	
//		
//	 Thread.sleep(2000);
//
//	 //3
//	getElement(user).sendKeys("Admin");
//	getElement(pwd).sendKeys("admin123");
//
//	}
//	
//	//2
//	public static WebElement getElement(By Lockobj) {
//		
//	return driver.findElement(Lockobj);
	
	
	// 5 METHOD OF WEB ELEMENT
	
//	driver = new ChromeDriver();
//	
//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//
//	driver.manage().window().maximize();
//
//	// 1
//	 By user = By.name("username");
//	 By pwd = By.name("password");	
//	
//	 Thread.sleep(1000);
//
//	 dosendkeys(user,"Admin");
//	 dosendkeys(pwd,"admin123");
//	 
//	}
//	
//	//2
//	
//    // Method to get WebElement by locator
//	
//	public static WebElement getElement(By Lockobj) {     // 1 METHOD
//		
//	return driver.findElement(Lockobj);
//	}
//	
//	// Method to send keys to an element
//	
//	public static void dosendkeys(By Lockobj, String value) {       // 2 METHOD
//	
//	getElement(Lockobj).sendKeys(value);
	

	
	// 6 METHOD OF WEB ELEMENT
	
	driver = new ChromeDriver();

	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	driver.manage().window().maximize();

	// 1
	 By user = By.name("username");
	 By pwd = By.name("password");	
	
	 Thread.sleep(1000);
     
	 // CALL 6 METHOD FROM MAKE NEW CLASS FROM METHOD
	 
	 Elementutil EU = new Elementutil(driver);
	 EU.dosendkeys(user, "Admin");
	 EU.dosendkeys(pwd, "admin123");
	
	
	}
	}
	
	
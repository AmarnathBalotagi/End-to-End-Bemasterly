package Amar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Offering_Acadcy {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		
		String[] names = {"Phy tutor ","Chem tutor","Maths tutor","Bio tutor"};
		int Num = 700;
		
			driver.get("https://megamock3.padhaao.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("megamock3");
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='Institute Setup']")).click();
			// Preprod X-path = //span[normalize-space()='Institute Setup']
			// Prod X-path = //span[normalize-space()='My Institute']
			driver.findElement(By.xpath("//li[@class='nk-menu-item active current-page']//span[@class='nk-menu-text sub-menu'][normalize-space()='Courses']")).click();
			WebElement AddUser = driver.findElement(By.xpath("//a[normalize-space()='Add courses']"));
			AddUser.click();
			
			
			WebElement L1 = driver.findElement(By.xpath("(//span[@role='combobox'])[1]"));
			L1.click();
			
			//System.out.println(name);
			
			
			String Roll = String.valueOf(Num);
			
			WebElement employeeId = driver.findElement(By.id("employeeId"));
			employeeId.sendKeys(Roll);
			Num++;
			
			//Thread.sleep(50000);
			//driver.quit();
			WebElement MobileNo = driver.findElement(By.id("mobileNumber"));
			MobileNo.sendKeys("1234567890");
			WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
			Email.sendKeys("test@gamil.com");
			Select Gender = new Select(driver.findElement(By.id("gender")));
			Gender.selectByValue("Male");
			//js.executeScript("window.scrollBy(0,400)");
			Select Role = new Select(driver.findElement(By.id("role")));
			Role.selectByValue("tutor");
			
			Thread.sleep(2000);
			WebElement Save = driver.findElement(By.xpath("//button[@id='saveForm']"));
			js.executeScript("arguments[0].scrollIntoView(true);", Save);
			
			actions.moveToElement(Save).click().perform();
			
			//driver.findElement(By.id("form_submit")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[normalize-space()='Add User']")).click();
		//	System.out.println( +" Created");
			}
	
}


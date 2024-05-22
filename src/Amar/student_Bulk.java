package Amar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class student_Bulk {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String[] names = {"Test"};
		int Num = 800;
		
			driver.get("https://gigamock1.bemasterly.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("gigamock1");
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='My Institute']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='Students']")).click();
			WebElement AddStudent = driver.findElement(By.xpath("//a[@class='btn btn-primary1 ml-md-2']"));
			AddStudent.click();
			
			for (int i = 0; i < names.length; i++) {
				
			String name=names[i];
			WebElement Student_Name = driver.findElement(By.id("first_name"));
			Student_Name.sendKeys(name);
			System.out.println(name);
			
			
			String Roll = String.valueOf(Num);
			
			WebElement RollNo = driver.findElement(By.id("roll_no"));
			RollNo.sendKeys(Roll);
			Num++;
			
			
			//Thread.sleep(50000);
			//driver.quit();
			WebElement MobileNo = driver.findElement(By.id("mobileid"));
			MobileNo.sendKeys("1234567890");
			WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
			Email.sendKeys("Karan@gamil.com");
			Select Gender = new Select(driver.findElement(By.id("default-06")));
			Gender.selectByValue("Male");
			js.executeScript("window.scrollBy(0,400)");
			WebElement ParentFisrtName = driver.findElement(By.xpath("(//input[@id='lname'])[1]"));
			ParentFisrtName.sendKeys("Mohan");
			WebElement ParentLastName = driver.findElement(By.xpath("(//input[@id='lname'])[2]"));
			ParentLastName.sendKeys("Sharma");
			Select Relation = new Select(driver.findElement(By.name("parent_relationship[]")));
			Relation.selectByValue("Father");
			WebElement ParentEmail = driver.findElement(By.id("parent_email"));
			ParentEmail.sendKeys("Karan@gamil.com");
			WebElement ParentMobileNo = driver.findElement(By.id("parent_mobile"));
			ParentMobileNo.sendKeys("1234567890");
			js.executeScript("window.scrollBy(0,800)");
			
			WebElement Address = driver.findElement(By.name("add1"));
			Address.sendKeys("Lower Parel");
			WebElement Pincode = driver.findElement(By.name("pincode"));
			Pincode.sendKeys("400013");
			Select State = new Select(driver.findElement(By.id("state")));
			State.selectByVisibleText("Maharashtra");
		
			
			driver.findElement(By.id("form_submit")).click();
			
			driver.findElement(By.xpath("//a[@class='btn btn-primary1 ml-md-2']")).click();
			
			}
			
	}
	
	}




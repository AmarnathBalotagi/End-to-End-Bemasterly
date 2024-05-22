package Amar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;

public class New {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://prodtest21.bemasterly.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Prodtest21");
		driver.findElement(By.id("password")).sendKeys("Genext@123");
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='TestPro']")).click();
		driver.findElement(By.xpath("//li[@data-content='Create Exam']//a[@class='nav-link']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//input[@id='examname']")).sendKeys("Imp Exam 1");
		// Find the dropdown element by ID
		//WebElement ExamTypedropdown = driver.findElement(By.id("ExamType"));
		// Create a Select object
		
		Select selectExam = new Select(driver.findElement(By.id("ExamType")));
		selectExam.selectByValue("18397");
		Thread.sleep(2000);
		
		Select selectOfferings = new Select(driver.findElement(By.id("offerings")));
		selectOfferings.selectByValue("3_4");
		Thread.sleep(2000);
		
		WebElement BatchDropdown = driver.findElement(By.xpath("//div[@id='grade_student']//button[@title='None selected']"));
		BatchDropdown.click();
		 WebElement JeeMains = driver.findElement(By.xpath("//input[@value='616']"));
		 JeeMains.click();
		 
		Select selectMode = new Select(driver.findElement(By.id("test_mode")));
		selectMode.selectByVisibleText("Online Assessment");
		
		Thread.sleep(2000);
		WebElement TemplateDropdown = driver.findElement(By.id("template"));
		TemplateDropdown.click();

		WebElement MonthlyPracticeTestMaths = driver.findElement(By.xpath("//option[@value='208']"));
		MonthlyPracticeTestMaths.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='col-md-6 nomal_time anti_print_purpose']//label[@class='pt-3']")).click();
		Thread.sleep(1000);
		WebElement ChapterDropdown = driver.findElement(By.xpath("//button[@title='None selected']"));
				ChapterDropdown.click();
		//Select selectchapter = new Select(ChapterDropdown);
		List<WebElement> Chapter = ChapterDropdown.findElements(By.tagName("li"));
		
		for (WebElement option : Chapter) {
		    String text = option.getText();
		    System.out.println(text);
		}
		
		
		
		
		
		
		
		
		 
	}

}

package Mock_Online;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Create_NeetMock {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions actions = new Actions(driver);
		
		String[] names = {
				"NEET MOCK 1",
				"NEET MOCK 2",
				"NEET MOCK 3",
				"NEET MOCK 4",
				"NEET MOCK 5"
				};
		
			driver.get("https://gigamock1.bemasterly.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("gigamock1");
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='TestPro']")).click();
			driver.findElement(By.xpath("//li[@data-content='Create Exam']//a[@class='nav-link']//*[name()='svg']")).click();
//			JEE= 18397 | Offering = 3_4  | batch = 1063 | TEMPLATEID FULL MOCK= 83
//			NEET = 20967  | Offerings = 5_6 | batch = 4990 | Template id = 263
//			MHCET = 17574 | offering = 35_36 | Batch = 2429 | Template id = 395
//			MHSB 10th = 15584
			int k=0;
			for (int j=1;j<7;j++) {

			
			//String name=names[k];
			driver.findElement(By.xpath("//input[@id='examname']")).sendKeys(names[k]);
			
			Select selectExam = new Select(driver.findElement(By.id("ExamType")));
			selectExam.selectByValue("20967");
			Thread.sleep(2000);
			
			
			Select selectOfferings = new Select(driver.findElement(By.id("offerings")));
			selectOfferings.selectByValue("5_6");
			Thread.sleep(2000);
			
			WebElement BatchDropdown = driver.findElement(By.xpath("//div[@id='grade_student']//button[@title='None selected']"));
			BatchDropdown.click();
			actions.sendKeys(Keys.ARROW_DOWN, Keys.SPACE).perform();
			 
			Select selectMode = new Select(driver.findElement(By.id("test_mode")));
			selectMode.selectByVisibleText("Online Assessment");
			Thread.sleep(3000);
			
//			WebElement Manualgenerated = driver.findElement(By.xpath("(//div[@class='custom-control custom-radio d-flex align-items-center ml-3'])[1]"));
//			Manualgenerated.click();
//			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			
			WebElement subjects = driver.findElement(By.xpath("(//button[@title='None selected'])[1]"));
			subjects.click();
			Thread.sleep(2000);
			
			actions.sendKeys(Keys.ARROW_DOWN, Keys.SPACE).perform();
			
			
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);  
			
		        //String TemplateName = selectTemplate.toString();
		        //System.out.println("Selected option: " + TemplateName);
		  
			js.executeScript("window.scrollBy(0,500)"); Thread.sleep(2000);
			Thread.sleep(2000);
			WebElement TemplateDropdown = driver.findElement(By.id("template"));
			TemplateDropdown.click();
			
			Select selectTemplate = new Select(TemplateDropdown);
			selectTemplate.selectByValue("264");
			Thread.sleep(3000);
			
			
			//System.out.println();
			
			Thread.sleep(9000);
		  
		    js.executeScript("window.scrollBy(0,500)");
			WebElement ContinueBtn = driver.findElement(By.xpath("(//button[normalize-space()='Continue'])[1]"));
			
			
			ContinueBtn.click();
			
			Thread.sleep(70000);
		//	js.executeScript("window.scrollBy(0,6000)");
			
			WebElement AssignQP = driver.findElement(By.xpath("//button[@id='assign_qp_auto_generate_online']"));
			//js.executeScript("window.scrollBy(300,600)");
			js.executeScript("arguments[0].scrollIntoView(true);", AssignQP);
			// Wait for the element to be clickable
			
			actions.moveToElement(AssignQP).click().perform();
			
			
			Thread.sleep(2000);
		
			/*
			 * WebElement AssignQP =
			 * driver.findElement(By.id("assign_qp_auto_generate_online"));
			 * //js.executeScript("window.scrollBy(300,600)");
			 * js.executeScript("arguments[0].scrollIntoView(true);", AssignQP);
			 * //js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			 * 
			 * //actions.click(AssignQP).perform();
			 * 
			 * Thread.sleep(3000); js.executeScript("arguments[0].click();", AssignQP);
			 * //actions..click(AssignQP).perform();
			 */			
				
			driver.navigate().back();
			driver.findElement(By.xpath("//li[@data-content='Create Exam']//a[@class='nav-link']//*[name()='svg']")).click();
			
		System.out.println(names[k]+" Created Sucessfully");
		k++;
		}}



}

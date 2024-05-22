package Amar;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mhsb10th_Online {
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String[] names = {
				"T001", "T002", "T003", "T004", "T005", 
				"T006", "T007", "T008", "T009", "T010", 
				"T011", "T012", "T013", "T014", "T015", 
				"T016", "T017", "T018", "T019", "T020", 
				"T021", "T022", "T023", "T024", "T025", 
				"T026", "T027", "T028", "T029", "T030"
				};
		
			driver.get("https://prodtest21.bemasterly.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("Prodtest21");
			driver.findElement(By.id("password")).sendKeys("Genext@123");
			driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='TestPro']")).click();
			driver.findElement(By.xpath("//li[@data-content='Create Exam']//a[@class='nav-link']//*[name()='svg']")).click();
			Actions actions = new Actions(driver);
			int k=8;
			for (int j=7;j<29;j++){

//				JEE= 18397 | Offering = 3_4  | batch = 1063 | TEMPLATEID FULL MOCK= 83
//				NEET = 20967  | Offerings = 5_6 | batch = 1064 | Template id = 263
//				MHCET = 17574 | offering = 35_36 | Batch = 2429 | Template id = 395
//				MHSB 10th = 15584  offering = 8_10  | Batch = 1065,
			//	MHSB 9th == offering = 8_9  | Batch = 1066, 
			//String name=names[k];
			driver.findElement(By.xpath("//input[@id='examname']")).sendKeys(names[k]);
			
			Select selectExam = new Select(driver.findElement(By.id("ExamType")));
			selectExam.selectByValue("15584");
			Thread.sleep(2000);
			//k++;
			
			Select selectOfferings = new Select(driver.findElement(By.id("offerings")));
			selectOfferings.selectByValue("8_9");
			Thread.sleep(2000);
			
			WebElement BatchDropdown = driver.findElement(By.xpath("//div[@id='grade_student']//button[@title='None selected']"));
			BatchDropdown.click();
			 WebElement mshb9th = driver.findElement(By.xpath("//input[@value='1066']"));
			 mshb9th.click();
			 
			Select selectMode = new Select(driver.findElement(By.id("test_mode")));
			selectMode.selectByVisibleText("Offline Assessment");
			
			
			Thread.sleep(2000);
			WebElement TemplateDropdown = driver.findElement(By.id("template"));
			TemplateDropdown.click();
			
			Select selectTemplate = new Select(TemplateDropdown);
			//selectTemplate.selectByValue("174");
			List<WebElement> Templates = selectTemplate.getOptions();

			
			try {
				selectTemplate.selectByIndex(j);
		      } catch (StaleElementReferenceException e) {
		    	  selectTemplate.selectByIndex(j); 
		      }
			
			//actions.sendKeys(Keys.ENTER).perform();

		        //String TemplateName = selectTemplate.toString();
		        //System.out.println("Selected option: " + TemplateName);
		    
			

			/*WebElement MonthlyPracticeTestMaths = driver.findElement(By.xpath("//option[@value='174']']"));
			MonthlyPracticeTestMaths.click();*/
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,600)");
			
			//driver.findElement(By.xpath("//div[@class='col-md-6 nomal_time anti_print_purpose']//label[@class='pt-3']")).click();
			Thread.sleep(4000);
			
			
			
			WebElement Chapter = driver.findElement(By.xpath("//button[@title='None selected']"));
			try {
				 Chapter.click(); 
		      } catch (StaleElementReferenceException e) {
		    	  Chapter.click(); 
		      }
			
			
			
			actions.sendKeys(Keys.ARROW_DOWN).perform();
			
		    Select selectChapter = new Select(driver.findElement(By.id("chapter")));
			
			List<WebElement> elementCount = selectChapter.getOptions();
			
			System.out.println("Number of items: " + elementCount.size());
			
			
			
			//System.out.println();
			
		    for(int i=0;i<elementCount.size();i++) 
		    	{
		    	actions.sendKeys(Keys.ARROW_DOWN, Keys.SPACE).perform();
				}
		    
			WebElement ContinueBtn = driver.findElement(By.xpath("//button[@id='button_page_1']"));
			Thread.sleep(3000);
			
			ContinueBtn.click();
			Thread.sleep(3000);
			WebElement AssignQP = driver.findElement(By.id("assign_qp_auto_generate"));
			//js.executeScript("window.scrollBy(300,600)");
			js.executeScript("arguments[0].scrollIntoView(true);", AssignQP);
			//js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			
			//actions.click(AssignQP).perform();
			
			
			js.executeScript("arguments[0].click();", AssignQP);
			//actions..click(AssignQP).perform();
			
			System.out.println(names[k]);
			k++;
			driver.navigate().back();
			driver.findElement(By.xpath("//li[@data-content='Create Exam']//a[@class='nav-link']//*[name()='svg']")).click();
			
		
			}
		}
}



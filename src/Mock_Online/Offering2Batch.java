package Mock_Online;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Offering2Batch {
public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions actions = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
			driver.get("https://gigamock3.bemasterly.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("gigamock3");
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
			//Prod
			//driver.findElement(By.xpath("//span[normalize-space()='My Institute']")).click();
			//Preprod
			//driver.findElement(By.xpath("//span[normalize-space()='Institute Setup']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='My Institute']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='Offerings']")).click();
			
			String[] off1 = {"Neet","mh-cet"};
			for (int i=0;i < off1.length;i++) {
			WebElement addOffering = driver.findElement(By.xpath("//a[normalize-space()='Add offerings']"));
			addOffering.click();
			Thread.sleep(2000);
			
			WebElement selectExam = driver.findElement(By.xpath("(//span[@role='combobox'])[1]"));
			selectExam.click();
			
			WebElement Exam_input = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
			Exam_input.sendKeys(off1[i]);
			actions.sendKeys( Keys.ENTER).perform();
			Thread.sleep(1000);
			
			
			WebElement Medium = driver.findElement(By.xpath("(//span[@role='combobox'])[2]"));
			Medium.click();
			actions.sendKeys( Keys.ENTER).perform();
			Thread.sleep(1000);
			WebElement Standard = driver.findElement(By.xpath("(//span[@role='combobox'])[3]"));
			Standard.click();
			actions.sendKeys( Keys.ENTER).perform();
			
			WebElement Subject = driver.findElement(By.xpath("//div[@class='multiselect-dropdown']"));
			Subject.click();
			Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@placeholder='Search']")).click();
		     actions.sendKeys(Keys.TAB, Keys.SPACE,Keys.ENTER).perform();
		     Thread.sleep(2000);
			}
			
			  WebElement Acadcycle = driver.findElement(By.xpath("//span[normalize-space()='Academic Cycle']"));
			  Acadcycle.click();
			  Thread.sleep(2000);
			  WebElement AddAcadcycle = driver.findElement(By.xpath("//a[normalize-space()='Add Academic Cycle']"));
			  AddAcadcycle.click();
			  Thread.sleep(2000);
			  WebElement NAme_Acadcycle = driver.findElement(By.xpath("//input[@id='academicName']"));
			  NAme_Acadcycle.sendKeys("New Acad");
			  
			  WebElement offerselect = driver.findElement(By.xpath("//input[@placeholder='Select Multiple options']"));
			  offerselect.click();
			  actions.sendKeys( Keys.ENTER).perform();
			  actions.sendKeys( Keys.SPACE,Keys.ARROW_DOWN,Keys.ENTER).perform();
			  
			  
			  WebElement Saveacad = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
			  Saveacad.click();
			  
			  WebElement batch = driver.findElement(By.xpath("//span[normalize-space()='Batches']"));
			  batch.click();
			  
			  WebElement Add_Batch = driver.findElement(By.xpath("//a[normalize-space()='Add Batch']"));
			  Add_Batch.click();
			  
			/*for (int i=0;i < off1.length;i++) {
			WebElement addOffering =driver.findElement(By.xpath("//a[normalize-space()='Add offerings']"));
			addOffering.click();
				
			Select selectExam = new Select(driver.findElement(By.id("examName")));
			selectExam.selectByVisibleText(off1[i]);
			Select selectMedium = new Select(driver.findElement(By.id("medium")));
			selectMedium.selectByIndex(1);
			Select selectStd = new Select(driver.findElement(By.id("standard")));
			selectStd.selectByIndex(1);
			WebElement selectSubject = driver.findElement(By.xpath("//div[@class='multiselect-dropdown']"));

	        selectSubject.click();
	        driver.findElement(By.xpath("//input[@placeholder='Search']")).click();
	        actions.sendKeys(Keys.TAB, Keys.SPACE).perform();;
	        
	    	driver.findElement(By.cssSelector("label[for='subject']")).click();
	       */
	      WebElement save = driver.findElement(By.id("saveBtn"));
	      save.click();
	     // System.out.println(off1[i]+" Created sucessfully ");
	     
			}
			
			//MHSB
		/*	int k=0;
			String[] off2 = {"MHSB","MHSB (Trial)"};
			String[] std = {"X","IX"};
			for (int j=0;j < off2.length;j++) {*/
				
				/*
				 * WebElement addOff9ering
				 * =driver.findElement(By.xpath("//a[normalize-space()='Add offerings']"));
				 * addOffering.click();
				 * 
				 * Select selectExam1= new Select(driver.findElement(By.id("examName")));
				 * selectExam.selectByVisibleText(off2[j]); Select selectMedium1 = new
				 * Select(driver.findElement(By.id("medium"))); selectMedium1.selectByIndex(1);
				 * Select selectStd1 = new Select(driver.findElement(By.id("standard")));
				 * selectStd1.selectByVisibleText(std[k]); WebElement selectSubject1 =
				 * driver.findElement(By.xpath("//div[@class='multiselect-dropdown']"));
				 * 
				 * selectSubject1.click();
				 * driver.findElement(By.xpath("//input[@placeholder='Search']")).click();
				 * actions.sendKeys(Keys.TAB, Keys.SPACE).perform();;
				 * 
				 * driver.findElement(By.cssSelector("label[for='subject']")).click();
				 */
		       
				/*
				 * WebElement save = driver.findElement(By.id("saveBtn")); save.click(); k++;
				 */
		     
				
	       
    }




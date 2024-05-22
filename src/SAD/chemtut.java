package SAD;

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

public class chemtut {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions actions = new Actions(driver);
		String[] names = {
				"The Tutor 99 Chem 1",
				"The Tutor s99e Chem 2",
				"The Tutor 9 Chem 3"
				};
		
			driver.get("https://access1.padhaao.com/login");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("chemtutor");
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='TestPro']")).click();
			driver.findElement(By.xpath("//li[@data-content='Create Exam']//a[@class='nav-link']//*[name()='svg']")).click();
			
			int k=0;
			for (int j=1;j<9;j++) {

				
				
			
			
			//String name=names[k];
			driver.findElement(By.xpath("//input[@id='examname']")).sendKeys(names[k]);
			
			Select selectExam = new Select(driver.findElement(By.id("ExamType")));
			selectExam.selectByValue("18397");
			Thread.sleep(2000);
			
			
			Select selectOfferings = new Select(driver.findElement(By.id("offerings")));
			selectOfferings.selectByValue("3_4");
			Thread.sleep(2000);
			
			WebElement BatchDropdown = driver.findElement(By.xpath("//div[@id='grade_student']//button[@title='None selected']"));
			BatchDropdown.click();
			 WebElement mshb10th = driver.findElement(By.xpath("//input[@value='870']"));
			 mshb10th.click();
			 
			Select selectMode = new Select(driver.findElement(By.id("test_mode")));
			selectMode.selectByVisibleText("Offline Assessment");
			Thread.sleep(3000);
			
			WebElement Manualgenerated = driver.findElement(By.xpath("(//div[@class='custom-control custom-radio d-flex align-items-center ml-3'])[1]"));
			Manualgenerated.click();
			
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			
			 
			
			 Select subjects = new Select (driver.findElement(By.xpath("//select[@id='subjects']")));
			
			Thread.sleep(2000);
			subjects.selectByValue("1");
			
			
		        //String TemplateName = selectTemplate.toString();
		        //System.out.println("Selected option: " + TemplateName);
		    
			

			/*WebElement MonthlyPracticeTestMaths = driver.findElement(By.xpath("//option[@value='174']']"));
			MonthlyPracticeTestMaths.click();*/
			Thread.sleep(1000);
			
			//js.executeScript("window.scrollBy(0,500)");
			
			//driver.findElement(By.xpath("//div[@class='col-md-6 nomal_time anti_print_purpose']//label[@class='pt-3']")).click();
			Thread.sleep(1000);
			
			
			js.executeScript("window.scrollBy(0,500)"); Thread.sleep(2000);
			WebElement Chapter = driver.findElement(By.xpath("//button[@title='None selected']"));
			Chapter.click();
			
			actions.sendKeys(Keys.ARROW_DOWN).perform();
			
		    Select selectChapter = new Select(driver.findElement(By.id("chapter")));
			
			List<WebElement> elementCount = selectChapter.getOptions();
			
			System.out.println("Number of items: " + elementCount.size());
			
			
			
			//System.out.println();
			
		    for(int i=0;i<elementCount.size();i++) 
		    	{
		    	actions.sendKeys(Keys.ARROW_DOWN, Keys.SPACE).perform();
				}
		     WebElement marks = driver.findElement(By.id("marks"));
		     marks.sendKeys("40");
		     
		     WebElement time = driver.findElement(By.id("time"));
		     time.sendKeys("90");
		     
		    js.executeScript("window.scrollBy(0,500)");
			WebElement ContinueBtn = driver.findElement(By.xpath("(//button[normalize-space()='Continue'])[1]"));
			
			
			ContinueBtn.click();
			
			Thread.sleep(2000);
			
			
			WebElement addNew = driver.findElement(By.xpath("//button[normalize-space()='Add New']"));
		
			addNew.click();
			Thread.sleep(3000);
			List<WebElement> queCheck = driver.findElements(By.xpath("//label[contains(@for,'customCheck')]"));
			WebElement addClose = driver.findElement(By.xpath("//button[@id='qlSubmit']"));
			
			
			
			for(int t=0;t<10;t++)
			{
				queCheck.get(t).click();
			
			}
			addClose.click();
			
			// js.executeScript("window.scrollBy(0,1500)");
			 Thread.sleep(2000);
			
			WebElement Conti2 = driver.findElement(By.xpath("//button[@id='manual_offline_qp_generate_btn']"));
			js.executeScript("arguments[0].scrollIntoView(true);", Conti2);
			actions.moveToElement(Conti2).click().perform();
			
			
			Thread.sleep(2000);
			WebElement SaveAsDraft = driver.findElement(By.xpath("//button[@id='save_draft']"));
			js.executeScript("arguments[0].scrollIntoView(true);", SaveAsDraft);
			Thread.sleep(2000);
			actions.moveToElement(SaveAsDraft).click().perform();
		
			
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
			}
		}




}

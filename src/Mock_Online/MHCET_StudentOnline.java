package Mock_Online;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MHCET_StudentOnline {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new  EdgeDriver();
		Actions actions = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

			driver.get("https://access1.bemasterly.com/login");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("phyone");
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='TestPro']")).click();
			driver .findElement(By.xpath("(//small[@class='d-block text-muted'][normalize-space()='Online Assessment'])[1]")).click();
		 WebElement JoinExam = driver.findElement(By.xpath("//button[@class='btn btn-success-dark py-2 btn-block mt-5 button_outline nonpopup']"));
                    JoinExam.click();
                     
		 WebElement TermsCheckBox = driver.findElement(By.xpath("//input[@id='proceed']"));
		 TermsCheckBox.click();
         WebElement StartExam = driver.findElement(By.xpath("//button[normalize-space()='Start Exam']"));
         js.executeScript("arguments[0].scrollIntoView(true);", StartExam);
         js.executeScript("arguments[0].click();", StartExam);
         Thread.sleep(3000);
         
        
             for (int answeredQuestions = 0; answeredQuestions < 100; answeredQuestions++) {
                 
                 WebElement selectOption = driver.findElement(By.xpath("//div[4]//span[1]//label[1]"));
                 selectOption.click();

                
                 WebElement next = driver.findElement(By.xpath("//button[@id='next']"));
                 next.click();
                 Thread.sleep(2000);
             }
	           
             
       
         
			
			  WebElement Finish =
			  driver.findElement(By.xpath("//button[normalize-space()='Finish']"));
			  Finish.click(); WebElement FinishNow =
			  driver.findElement(By.xpath("//button[normalize-space()='Finish Now']"));
			  FinishNow.click();
			 
         
         
	}

}

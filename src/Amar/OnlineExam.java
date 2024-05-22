package Amar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OnlineExam {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new  FirefoxDriver();
		Actions actions = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

			driver.get("https://prodtest21.bemasterly.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("Lucy7567");
			driver.findElement(By.id("password")).sendKeys("!LV43gmt");
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
         
         for(int i=0;i<25; i++){
        	 WebElement SelectOption = driver.findElement(By.xpath("//div[4]//span[1]//label[1]"));
             SelectOption.click();
            
             WebElement Next = driver.findElement(By.xpath("//button[@id='next']"));
             Next.click();
         }
               WebElement Finish = driver.findElement(By.xpath("//button[normalize-space()='Finish']"));
               Finish.click();
               WebElement FinishNow = driver.findElement(By.xpath("//button[normalize-space()='Finish Now']"));
               FinishNow.click();
         
         
	}
}

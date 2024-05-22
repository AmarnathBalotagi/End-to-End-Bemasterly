package Mock_Online;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Batch {
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
			
			  
			  WebElement batch = driver.findElement(By.xpath("//span[normalize-space()='Batches']"));
			  batch.click();
			  
			  WebElement Add_Batch = driver.findElement(By.xpath("//a[normalize-space()='Add Batch']"));
			  Add_Batch.click();
			  
			  WebElement Name_Batch = driver.findElement(By.xpath("//input[@id='batch_name']"));
			  Name_Batch.sendKeys("batch12 ");
			  WebElement offering = driver.findElement(By.id("offering_name"));
			  offering.click();
			  actions.sendKeys(Keys.ARROW_DOWN,Keys.SPACE).perform();
			  Thread.sleep(1000);
			  WebElement Subjects = driver.findElement(By.xpath("//div[@class='css-1hwfws3']"));
			  Subjects.click();
			  
			  actions.sendKeys( Keys.ARROW_DOWN,Keys.SPACE).perform();
			  Thread.sleep(1000);
			  WebElement Acad = driver.findElement(By.id("academic_name"));
			  Acad.click();
			  actions.sendKeys(Keys.ARROW_DOWN,Keys.SPACE).perform();
			  
			  WebElement StartD = driver.findElement(By.xpath("//body/div[@class='nk-app-root']/div[@id='read_scrp_default']/div[@class='nk-main']/div[@class='nk-wrap ']/div[@id='nk-content-genext']/div[@class='container-xl wide-lg']/div[@class='nk-content-body']/div[@id='content-wrapper']/div[@class='row']/div[@id='batch-root']/div/div[@class='multistep-layout']/div[@class='tab-body']/form[@id='step1']/div[@class='row mt-3']/div[1]/div[1]/input[1]"));
			  StartD.sendKeys("08-05-2024");
			  
			  
			  WebElement EndD = driver.findElement(By.xpath("//body/div[@class='nk-app-root']/div[@id='read_scrp_default']/div[@class='nk-main']/div[contains(@class,'nk-wrap')]/div[@id='nk-content-genext']/div[@class='container-xl wide-lg']/div[@class='nk-content-body']/div[@id='content-wrapper']/div[@class='row']/div[@id='batch-root']/div/div[@class='multistep-layout']/div[@class='tab-body']/form[@id='step1']/div[@class='row mt-3']/div[2]/div[1]/input[1]"));
			  EndD.sendKeys("28-05-2024");
			  WebElement SAve_Next = driver.findElement(By.xpath("//button[normalize-space()='Save & Next']"));
			  //js.executeScript("window.scrollBy(0,500)");
			  js.executeScript("arguments[0].scrollIntoView(true);", SAve_Next);
			  Thread.sleep(2000);
			  
			  SAve_Next.click();
			  
			  
			  WebElement Add_Tut = driver.findElement(By.xpath("//tbody/tr[1]/td[4]/p[1]"));
			  Add_Tut.click();
			  
			  
			  WebElement All_tut = driver.findElement(By.xpath("//input[@class='ms-2 me-1']"));
			  All_tut.click();
			  
			  
			  WebElement Save_tut = driver.findElement(By.xpath("(//button[contains(@type,'button')][normalize-space()='Save'])[1]"));
			  Save_tut.click();
			  
			  
			  
				/*
				 * Add_Batch.click(); WebElement Add_Batch = driver.findElement(By.xpath(""));
				 * Add_Batch.click(); WebElement Add_Batch = driver.findElement(By.xpath(""));
				 * Add_Batch.click(); WebElement Add_Batch = driver.findElement(By.xpath(""));
				 * Add_Batch.click(); WebElement Add_Batch = driver.findElement(By.xpath(""));
				 * Add_Batch.click();
				 */
			  
		
}

}

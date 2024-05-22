package preProd;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CmsID {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();

		String[] cmsid = {
		    "35304", "35305", "35309", "35314", "35864", "36392", "36393", "36394", "36395", "36396",
		    "36403", "36754", "36755", "38798", "39168", "39169", "40231", "40564", "41138", "41822",
		    "41823", "46183", "51210", "51211", "51215", "51220", "51769", "52296", "52297", "52298",
		    "52299", "52300", "52307", "52657", "52658", "52785", "52786", "54076", "56619", "56987",
		    "56988", "21030", "21811", "22252", "23880", "24611"
		};

		int k = 0;
		for (int i = 0; i < 50; i++) {
		    driver.get("https://cms.bemasterly.com/CMS-preview/question.php/?post_type=question&author=18&p=" + cmsid[k]);
		    try {
		        WebElement Syllabus = driver.findElement(By.xpath("(//div[@class='lotus'])[18]"));
		        js.executeScript("arguments[0].scrollIntoView(true);", Syllabus);
		        String syllabusText = Syllabus.getText();
		        System.out.println(syllabusText);
		    } catch (NoSuchElementException e) {
		        // Handle the NoSuchElementException (e.g., print a message or take another action)
		        System.out.println("cms Id not found " + cmsid[k]);
		    }
		    k++;
		}
	}
}

		// Close the WebDriver when you're done with it
		


package preProd;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PreLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://prodtest4.bemasterly.com/");
		 Set<Cookie> Cookies = driver.manage().getCookies();
		 Cookies.size();
		 for (Cookie cookie: Cookies)
		 {
			 
		 }
		 
		 

	}
	void happy()
	{
		System.out.println("Very Happy");
	}
	
	

}

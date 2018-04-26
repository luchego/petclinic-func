package example;		

import java.io.File;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;	
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("http://localhost:8085/petclinic/");  
			String title = driver.getTitle();			
			System.out.println(">>>>>>"+title);
			Assert.assertTrue(title.contains("a Spring Framework")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
			//File file = new File("C:\\Users\\Mitesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
			//System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mitesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
			//driver = new ChromeDriver();  
			File file = new File("D:\\Desarrollo de Software\\DevOps\\Repositorios\\geckodriver-v0.13.0-win64\\geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());			
			
			
			driver = new FirefoxDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	
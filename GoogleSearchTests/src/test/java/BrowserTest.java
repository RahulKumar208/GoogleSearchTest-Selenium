import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserTest {
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		//String projectPath = System.getProperty("user.dir");
		//System.out.println(projectPath);
		
		//System.setProperty("webdriver.chrome.driver", projectPath+"Drivers/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement m = driver.findElement(By.xpath("//*[text()='Alle ablehnen']"));
		m.click();
		
		
		// Type the search phrase (configurable in test properties) and submit
		String searchPhrase = "Your configurable search phrase";
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchPhrase);
        searchBox.submit();
         
        // Check if search results appeared on the page
        WebElement resultStats = driver.findElement(By.xpath("//*[contains(text(),'Configurable Search')]"));
        assert(resultStats.isDisplayed());
        
        // Click the first real (non-Ad) result
        WebElement firstResult = driver.findElement(By.xpath("(//a[contains(@href,'https') and child::*[contains(text(),'Configurable Search')]])[1]"));
        firstResult.click();

        // Make sure that the page was opened
        assert(driver.getCurrentUrl() != null);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement resultStats1 = driver.findElement(By.xpath("//h1[descendant::*[contains(text(),'Configurable Search')]]"));
        assert(resultStats1.isDisplayed());
        
        driver.close();
		driver.quit();
		
	}
    
}
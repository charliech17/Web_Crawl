package webCrawl;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class web_Crawl_Second {
	
	public static void main(String arg[]) {
		
		WebDriver driver = new ChromeDriver();   
	    driver.get("http://charliech17.pixnet.net/blog");
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    Actions action = new Actions(driver);
	    action.sendKeys(Keys.ESCAPE).build().perform();
	    WebDriverWait wait = new WebDriverWait (driver, 30);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"blog-main\"]/div[2]/header/div/section/div/div[1]/ul/li[3]/span"))).click();
		
		
	}
}

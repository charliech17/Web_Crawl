package webCrawl;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.JavascriptExecutor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class web_Crawl_First {
	 
    private static WebDriver driver = null;
 
    public static void main(String[] args) {
 
       long start = System.currentTimeMillis();
       
       ChromeOptions options = new ChromeOptions();
       options.setHeadless(true);
       
       driver = new ChromeDriver(options);   
       driver.get("http://charliech17.pixnet.net/blog");
       JavascriptExecutor js = (JavascriptExecutor)driver;

      // ���lHTML   //String sText =  js.executeScript("return document.documentElement.innerText;").toString();
       String html =  js.executeScript("return document.body.innerHTML;").toString();

       Document doc=Jsoup.parse(html);
      
       Elements ids = doc.select("span[id^=blog_hit_]");
       
       int count=0;
       for(Element id: ids) {
    	   if(count==0) {System.out.println("����H��: "+id.text()); count++;}
    	   else{System.out.println("�ֿn�H��: "+id.text());}
    	   
       }
     
       
       
      
 
         long finish = System.currentTimeMillis();
         System.out.println("�g�L�ɶ�"+((finish-start)/1000));
         driver.quit();
          
    }
 
    }

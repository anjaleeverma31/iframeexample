package iframe;

import org.junit.Assert;
//import org.apache.http.util.Asserts;
//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Desktop\\selenium anjalee\\geckodriver.exe");
		WebDriver iframe = new FirefoxDriver();
		iframe.get("http://toolsqa.com/iframe-practice-page/");
		WebElement iframe1 = iframe.findElement(By.cssSelector("#IF2"));
		iframe.switchTo().frame(iframe1);
		 String text = iframe.findElement(By.cssSelector("div.col-md-4:nth-child(1) > h5:nth-child(1)")).getText();
		  System.out.println(text);
		  Assert.assertEquals("Unique & Clean", text);
		  System.out.println("result passed");
		  iframe.switchTo().defaultContent();
		  String text1 = iframe.findElement(By.cssSelector(".h1-size")).getText();
		  
		System.out.println(text1);
		  
		  
		  
		  
		  
		
		
		
		
	}

}

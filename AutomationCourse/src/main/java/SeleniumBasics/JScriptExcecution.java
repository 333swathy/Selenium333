package SeleniumBasics;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JScriptExcecution extends Base 
{
	
	 public void javascripSample() {
		  
		  JavascriptExecutor jsexecutor=  (JavascriptExecutor)driver;
		  jsexecutor.executeScript("window.scrollBy(0,350)", ""); //x=0,y=350 up
		  jsexecutor.executeScript("window.scrollBy(0,-350)", "");//down
		  WebElement showmsgbutton= driver.findElement(By.xpath("//button[text()='Show Message']")); //click
		  jsexecutor.executeScript("arguments[0].click;",showmsgbutton);
		  
		  WebElement gettotalbutton =driver.findElement(By.xpath("//button[@id= 'button-two']"));
		  jsexecutor.executeScript("arguments[0].scrollIntoView()",gettotalbutton);
		  jsexecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");//down
			
		  driver.navigate().to("https://www.javatpoint.com/");
		  jsexecutor.executeScript("window.scrollBy(500,0)", ""); //right
		  jsexecutor.executeScript("window.scrollBy(-500,0)", "");//left
		    }
		
		public static void main(String[] args) 
	{
		JScriptExcecution jscript=new JScriptExcecution();
				jscript.initialiseBrowser();
				jscript.javascripSample();
		

	}
}

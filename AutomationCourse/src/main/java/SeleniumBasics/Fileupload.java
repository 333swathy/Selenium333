package SeleniumBasics;

import java.awt.AWTException;
import java.awt.KeyEventDispatcher;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;

public class Fileupload 
{
	public void fileuploadusingsendkeys()
	{
		WebDriver driver=new ChromeDriver();
	 driver.get("https://demo.guru99.com/selenium/upload/");
		//driver.navigate().to("https://demo.guru99.com/selenium/upload/");
		WebElement choosefile=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		choosefile.sendKeys("C:\\Users\\GOKUL\\eclipse-workspace\\AutomationCourse\\src\\main\\resources\\New Microsoft Excel Worksheet.xlsx");
	}
	public void filemethodusingrobotkey() throws AWTException
	{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/selenium/upload/");
		WebElement choosefile=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		Actions action=new Actions(driver);
		action.moveToElement(choosefile).click().perform();
		StringSelection ss=new StringSelection("C:\\Users\\GOKUL\\eclipse-workspace\\AutomationCourse\\src\\main\\resources\\New Microsoft Excel Worksheet.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		Robot robot=new Robot();
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(500);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

	public static void main(String[] args) throws AWTException 
	{
		Fileupload fileupload=new Fileupload();
		//fileupload.fileuploadusingsendkeys();
		fileupload.filemethodusingrobotkey();
		

	}

}

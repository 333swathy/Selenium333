package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alerts extends Base{
	public void alerthandling()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickmebutton=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickmebutton.click();//NORMAL ALERT
		driver.switchTo().alert().accept();
		
		
		WebElement clickme2button=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickme2button.click();//CONFIRMATION ALERT
		driver.switchTo().alert().dismiss();
		
		
		WebElement clickme3button=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickme3button.click();//PROMPTING ALERT
		driver.switchTo().alert().sendKeys("hello");
		String alertext=driver.switchTo().alert().getText();
		System.out.println(alertext);
		driver.switchTo().alert().accept();
		WebElement message=driver.findElement(By.xpath("//p[@id='prompt-demo']"));
		System.out.println(message.getText());
		
	}

	public static void main(String[] args) 
	{
		Alerts alert=new Alerts();
		alert.initialiseBrowser();
		alert.alerthandling();
		//alert.driverQuit();
	}

}

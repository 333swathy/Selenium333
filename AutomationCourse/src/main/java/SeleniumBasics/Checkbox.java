package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Checkbox extends Base{
	public void checkboxtest()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement singlechechbox1=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		if(!singlechechbox1.isSelected())
		{
			singlechechbox1.click();
		}
		if(singlechechbox1.isSelected())
		{
			singlechechbox1.click();
		}
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for(WebElement checkbox:checkboxes) {
			if(!checkbox.isSelected())
			{
				checkbox.click();
			}
		}
		WebElement unselect2=driver.findElement(By.xpath("//input[@value='Unselect All']"));
		//unselect2.click();
		List<WebElement> checkboxes2=driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for(WebElement checkbox2:checkboxes2) {
			if(checkbox2.isSelected())
			{
				checkbox2.click();
			}
		}
		
	}

	public static void main(String[] args) 
	{
		Checkbox checkbox=new Checkbox();
		checkbox.initialiseBrowser();
		checkbox.checkboxtest();
	
	}

}

package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButton extends Base {
	public void radiobuttonactions() 
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement genderbutton=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		if(!genderbutton.isSelected())
		{
			genderbutton.click();
		}
		WebElement showbutton1=driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		showbutton1.click();
		
		WebElement patientsgentetbutton=driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		if(!patientsgentetbutton.isSelected())
		{
			patientsgentetbutton.click();
		}
		WebElement patientsagegroup=driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		{
			patientsagegroup.click();
		}
		 WebElement showbutton2=driver.findElement(By.xpath("//button[text()='Get Results']"));
		 showbutton2.click();
	}

	public static void main(String[] args) {
		RadioButton radiobutton=new RadioButton();
		radiobutton.initialiseBrowser();
		radiobutton.radiobuttonactions();
		
		

	}

}

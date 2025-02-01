package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base {
	public void handlingdropdown()
	{
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement singledropdown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select=new Select(singledropdown);//select is an inbuild class for selection
		select.selectByIndex(2);
		WebElement element=select.getFirstSelectedOption();
		System.out.println(element.getText());
		
		select.selectByValue("Red");
		WebElement element1=select.getFirstSelectedOption();
		System.out.println(element1.getText());
		
		select.selectByVisibleText("Green");
		WebElement element2=select.getFirstSelectedOption();
		System.out.println(element2.getText());
		
		WebElement multidropdown=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select select1=new Select(multidropdown);
		boolean ismultiselected=select1.isMultiple();
		System.out.println(ismultiselected);
		select1.selectByIndex(0);//can use instead of for loop
		select1.selectByIndex(2);
		/*for(int i=0;i<2;i++)
		{
			select1.selectByIndex(i);
		}*/
		List<WebElement> selectedelementlist=select1.getAllSelectedOptions();
		for(int i=0;i<selectedelementlist.size();i++)
		{
			System.out.println(selectedelementlist.get(i).getText());
		}
		//select1.deselectAll();
		
	}

	public static void main(String[] args) 
	{
		DropDown dropdown=new DropDown();
		dropdown.initialiseBrowser();
		dropdown.handlingdropdown();
		//dropdown.driverQuit();
	}

}

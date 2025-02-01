package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowhandling extends Base {
	public void multiplewindow()
	{

		driver.navigate().to("https://selenium.qabible.in/window-popup.php");
		WebElement likeusbutton=driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		likeusbutton.click();
		String mainwindow=driver.getWindowHandle();
		System.out.println(mainwindow);
		Set<String> sets=driver.getWindowHandles();
		Iterator<String> iterator1=sets.iterator();
		while(iterator1.hasNext())
		{
			String childwindow=iterator1.next();
			if(!mainwindow.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
				WebElement emailaddressfield=driver.findElement(By.xpath("(//input[@ name='email'])[2]"));
				emailaddressfield.sendKeys("abvg@gmail.com");
				//driver.close();
			}
		}
		driver.switchTo().window(mainwindow);
		
	}

	public static void main(String[] args) {
		MultipleWindowhandling multiple=new MultipleWindowhandling();
		multiple.initialiseBrowser();
		multiple.multiplewindow();
				
	}

}

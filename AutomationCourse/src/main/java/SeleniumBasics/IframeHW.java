package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IframeHW extends Base
{
	public void iframeactions()
	{
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		//WebElement iframeelement=driver.findElement(By.xpath("id=\"a077aa5e\""));
		//driver.switchTo().frame(iframeelement);
		driver.switchTo().frame("a077aa5e");
		WebElement tryitfreeclick=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		tryitfreeclick.click();
		driver.switchTo().parentFrame();
	}

	public static void main(String[] args) {
		
		IframeHW iframehw=new IframeHW();
		iframehw.initialiseBrowser();
		iframehw.iframeactions();
				
			}

}

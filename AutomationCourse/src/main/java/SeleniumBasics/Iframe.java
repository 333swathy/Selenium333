package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//iframe or inframe is an inline frame that allow as to embedd in another html tag/frame
//can switch to frame by index,by name/id and by web element
//interacting with elements inside the frame
//the switching back to the main document/frame
public class Iframe extends Base {
	public void iframeactions()
	{
		driver.navigate().to("https://demoqa.com/frames");
		//STEP 1-switch to frame
		//driver.switchTo().frame("frame1");
		WebElement iframeelement=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(iframeelement);
		//step 2-perform action in inside frame
		WebElement thisisasample=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(thisisasample.getText());
		//step3-back to main frame
		driver.switchTo().parentFrame(); //or defaultcontent
		//driver.switchTo().defaultContent();
	}

	public static void main(String[] args) {
		Iframe iframe=new Iframe();
		iframe.initialiseBrowser();
		iframe.iframeactions();

	}

}

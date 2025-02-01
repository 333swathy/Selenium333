package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBase {
	public WebDriver driver;
	public void initialiseBrowse()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_g50zekzm1_e&adgrpid=155259812313&hvpone=&hvptwo=&hvadid=713930224926&hvpos=&hvnetw=g&hvrand=10911101899756029513&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9148697&hvtargid=kwd-29089120&hydadcr=5496_2441751&gad_source=1");
	
			driver.manage().window().maximize();
			driver.manage().window().minimize();
	}
	public void diverQuit()
	{
		driver.quit();
	}

	public static void main(String[] args) {
		FirefoxBase firefoxbase=new FirefoxBase();
		firefoxbase.initialiseBrowse();
		firefoxbase.diverQuit();
		
		

	}

}

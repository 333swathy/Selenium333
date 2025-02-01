package SeleniumBasics;

public class BrowserCommands extends Base
{
	public void browserCommands()
	{
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		String src=driver.getPageSource();
		System.out.println(src);
		
	}
	public void navigationCommands()
	{
		driver.navigate().to("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_g50zekzm1_e&adgrpid=155259812313&hvpone=&hvptwo=&hvadid=713930224926&hvpos=&hvnetw=g&hvrand=10911101899756029513&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9148697&hvtargid=kwd-29089120&hydadcr=5496_2441751&gad_source=1\");\r\n");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	

	public static void main(String[] args)
{
		BrowserCommands command=new BrowserCommands();
		command.initialiseBrowser();
		command.browserCommands();
		command.navigationCommands();
		//command.driverQuit();
	}

}

package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	public void locators()
	{
		WebElement showmessagebutton=driver.findElement(By.id("button-one"));
		WebElement alertmodelclick=driver.findElement(By.id("alert-modal"));
		WebElement classsample=driver.findElement(By.className("my-2"));
		WebElement classsample2=driver.findElement(By.className("form-control"));
		WebElement tagsample=driver.findElement(By.tagName("button"));
		WebElement tagsample2=driver.findElement(By.tagName("input"));
		WebElement namesample=driver.findElement(By.name("viewport"));
		WebElement linktext=driver.findElement(By.linkText("Simple Form Demo"));
		WebElement partiallinktext=driver.findElement(By.partialLinkText("Simple Form"));
		WebElement xpath=driver.findElement(By.xpath("//button[@id='button-one']"));
		driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		driver.findElement(By.xpath("//button[contains(@class,'btn btn')]"));
		driver.findElement(By.xpath("//button[text()='Show Message']"));
		driver.findElement(By.xpath("//button[starts-with(text(),'Show ')]"));
		driver.findElement(By.xpath("//button[@id='button-one' and @class='btn btn-primary']"));
		driver.findElement(By.xpath("//button[@id='button-one' or @class='btn btn-primary']"));
		driver.findElement(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[ @class='card']"));
		driver.findElement(By.xpath("//div[@class='card-body']//child::button[@class='btn btn-primary']"));
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));
		driver.findElement(By.cssSelector("input#single-input-field"));//css=tag#id
		driver.findElement(By.cssSelector("input.form-control"));//css=tag.class
		driver.findElement(By.cssSelector("input[id='value-a']"));//css=tag[attribute=value]
		driver.findElement(By.cssSelector("input.form-control[id='single-input-field']"));//css=tag.classname[attribute=value]
	}
	/*Boolean alertmodelclick1=driver.findElement(By.id("alert-modal")).isDisplayed();
	System.out.println(alertmodelclick1);
	driver.findElement(By.className("form-control")).sendKeys("Welcome Swathy D Anand");;
	driver.findElement(By.id("value-a")).sendKeys("19");
	driver.findElement(By.id("value-b")).sendKeys("10");
	driver.findElement(By.id("button-two")).click();*/
	public void elementcommands() {
		WebElement singleinputfield=driver.findElement(By.xpath("//input[@class='form-control']"));
		singleinputfield.sendKeys("hello swathy");
		singleinputfield.clear();
		singleinputfield.sendKeys("hey swathy");
		WebElement showmessagebutton=driver.findElement(By.xpath("//button[text()='Show Message']"));
		showmessagebutton.click();
		WebElement yourmessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String message=yourmessage.getText();
		System.out.println(message);
		boolean isshowmessagrbuttondisplayed=showmessagebutton.isDisplayed();
		System.out.println(isshowmessagrbuttondisplayed);
		boolean isshowmessagebuttonenabled=showmessagebutton.isEnabled();
		System.out.println(isshowmessagebuttonenabled);
		String fontsizeofshowmessagebutton=showmessagebutton.getCssValue("font-size");
		System.out.println(fontsizeofshowmessagebutton);
		int xaxis=showmessagebutton.getLocation().getX();
		System.out.println(xaxis);
		int yaxis=showmessagebutton.getLocation().getY();
		System.out.println(yaxis);
		WebElement entervaluea=driver.findElement(By.xpath("//input[@id='value-a']"));
		entervaluea.sendKeys("5");
		WebElement entervalueb=driver.findElement(By.xpath("//input[@id='value-b']"));
		entervalueb.sendKeys("10");
		WebElement gettotalbutton=driver.findElement(By.xpath("//button[@id='button-two']"));
		gettotalbutton.click();
		WebElement totaldisplay=driver.findElement(By.xpath("//div[@id='message-two']"));
		String display=totaldisplay.getText();
		System.out.println(display);
		
		//driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		//WebElement checkbox=driver.findElement(By.xpath("//label[@class='form-check-label']"));
		//boolean ischeckboxselected=checkbox.isSelected();
		//System.out.println(ischeckboxselected);
	}
	public void test()
	{
		WebElement showmessagebutton=driver.findElement(By.id("button-one"));
		String actualbackgroundcolor=showmessagebutton.getCssValue("background-color");
		System.out.println(actualbackgroundcolor);
		String expectedresult="rgba(0, 116, 240, 1)";
		if(actualbackgroundcolor.equalsIgnoreCase(expectedresult))
		{
			System.out.println("Test Passed....");
		}
		else
		{
			System.out.println("Test Failed...");
		}
	}
	
	public static void main(String[] args) {
		WebElementCommands webelement=new WebElementCommands();
		webelement.initialiseBrowser();
		//webelement.locators();//locators-used to identify and interact with webelement
		//webelement.driverQuit();
		webelement.elementcommands();
		webelement.test();
		
	}

}

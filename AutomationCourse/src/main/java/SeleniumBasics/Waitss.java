package SeleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitss
{
	public WebDriver driver;
	public void waitsample()
	{
		driver=new FirefoxDriver();
		driver.navigate().to("https://www.qabible.in/payrollapp/site/login");
		//1: Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//2: Explicit Wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement loginbutton=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		wait.until(ExpectedConditions.visibilityOf(loginbutton));
		//eg
		wait.until(ExpectedConditions.elementToBeClickable(loginbutton));
		wait.until(ExpectedConditions.attributeToBe(loginbutton,"name","login-button"));
		wait.until(ExpectedConditions.alertIsPresent());
		//3: Fluent wait
		FluentWait<WebDriver> fluent=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
						.pollingEvery(Duration.ofSeconds(3))
						.ignoring(NoSuchElementException.class);
				fluent.until(ExpectedConditions.elementToBeClickable(loginbutton));
	}

	public static void main(String[] args) 
	{
		Waitss waits=new Waitss();
		
		waits.waitsample();
				
		

	}

}

package SeleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginHw
{
	WebDriver webdriver;
	
	public void initialise1()
	{
		webdriver=new ChromeDriver();
		webdriver.get("https://www.qabible.in/payrollapp/site/login");
		webdriver.manage().window().maximize();
		
	}
	public void driverquit()
	{
		//webdriver.quit();
	}
	public void loginactions()
	{
		WebElement usernamebutton=webdriver.findElement(By.xpath("//input[@id='loginform-username']"));
		usernamebutton.sendKeys("RUKKU");
		WebElement passwordbutton=webdriver.findElement(By.xpath("//input[@id='loginform-password']"));
		passwordbutton.sendKeys("12345");
		/*WebElement remembermecheckbox=webdriver.findElement(By.xpath("////input[@id='loginform-rememberme']"));
		if(!remembermecheckbox.isSelected())
		{
		remembermecheckbox.click();
		}*/
		WebElement loginbutton=webdriver.findElement(By.xpath("//button[@name='login-button']"));
		loginbutton.click();
		WebElement errormsg=webdriver.findElement(By.xpath("//p[text()='Incorrect username or password.']"));
		WebDriverWait wait=new WebDriverWait(webdriver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(errormsg));
		System.out.println(errormsg.getText());
		
	}
	public void neww()
	{
		WebElement username=webdriver.findElement(By.xpath("//input[@id='loginform-username']"));
		username.sendKeys("admin");
		WebElement password=webdriver.findElement(By.xpath("//input[@id='loginform-password']"));
		password.sendKeys("123");
		WebElement rememberme=webdriver.findElement(By.xpath("//input[@id='loginform-rememberme']"));
		rememberme.click();
		WebElement loginbutton=webdriver.findElement(By.xpath("//button[@class='btn btn-default']"));
		loginbutton.click();
		
		
		
WebElement errormessage=webdriver.findElement(By.xpath("//p[text()='Incorrect username or password.']"));
		WebDriverWait wait = new WebDriverWait(webdriver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(errormessage));
		
		System.out.println(errormessage.getText());
	}
	public void loginbutton()//using implicit wait
	{
		webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement loginbutton=webdriver.findElement(By.xpath("//button[@name='login-button']"));
		loginbutton.click();
		
		WebElement usernameerror=webdriver.findElement(By.xpath("//p[text()='Username cannot be blank.']"));
		System.out.println(usernameerror.getText());
		WebElement passworderror=webdriver.findElement(By.xpath("//p[text()='Password cannot be blank.']"));
		System.out.println(passworderror.getText());

	}
	public void loginbuttonEx()
	{
		WebElement loginbutton=webdriver.findElement(By.xpath("//button[@name='login-button']"));
		loginbutton.click();
		WebDriverWait wait=new WebDriverWait(webdriver,Duration.ofSeconds(1000));
		WebElement usernameerror=webdriver.findElement(By.xpath("//p[text()='Username cannot be blank.']"));
		wait.until(ExpectedConditions.visibilityOf(usernameerror));
		System.out.println(usernameerror.getText());
		WebElement passworderror=webdriver.findElement(By.xpath("//p[text()='Password cannot be blank.']"));
		wait.until(ExpectedConditions.visibilityOf(passworderror));
		System.out.println(passworderror.getText());

	}
	public void loginfluent()
	{
		WebElement loginbutton=webdriver.findElement(By.xpath("//button[@name='login-button']"));
		loginbutton.click();
		
		
		WebElement usernameerror=webdriver.findElement(By.xpath("//p[text()='Username cannot be blank.']"));
		FluentWait<WebDriver> fluent=new FluentWait<WebDriver>(webdriver)
				.withTimeout(Duration.ofSeconds(10))
						.pollingEvery(Duration.ofSeconds(5))
						.ignoring(NoSuchElementException.class);
				fluent.until(ExpectedConditions.elementToBeClickable(usernameerror));
		System.out.println(usernameerror.getText());
		WebElement passworderror=webdriver.findElement(By.xpath("//p[text()='Password cannot be blank.']"));
		System.out.println(passworderror.getText());
	}

	public static void main(String[] args)
	{
		LoginHw login=new LoginHw();
		login.initialise1();
		//login.loginactions();
		//login.loginbutton();
		//login.loginbuttonEx();
		//login.loginfluent();
		login.neww();
	
		
		login.driverquit();

	}

}



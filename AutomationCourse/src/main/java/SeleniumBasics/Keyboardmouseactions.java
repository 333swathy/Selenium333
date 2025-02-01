package SeleniumBasics;

import java.util.concurrent.CompletableFuture.AsynchronousCompletionTask;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Keyboardmouseactions extends Base {
	public void keyboardmouse()
	{
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		Actions actions=new Actions(driver);
		WebElement clickmebutton=driver.findElement(By.xpath("//button[text()='Click Me']"));
		clickmebutton.click();
		//for rightclick use action class
		WebElement rightclickbutton=driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		actions.contextClick(rightclickbutton).perform();
		//for double clicking use action class
		WebElement doubleclickbutton=driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		actions.doubleClick(doubleclickbutton).perform();
		//to do mouse over
		actions.moveToElement(clickmebutton).perform();
		//to move down
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		//mouse over and press down button in keyboard
		WebElement textboxbutton=driver.findElement(By.xpath("//a[@href='text-box.php']"));
		actions.moveToElement(textboxbutton).perform();
		actions.sendKeys(Keys.ARROW_DOWN).perform();
	}

	public static void main(String[] args)
	{
		Keyboardmouseactions actions=new Keyboardmouseactions();
		actions.initialiseBrowser();
		actions.keyboardmouse();
				

	}

}

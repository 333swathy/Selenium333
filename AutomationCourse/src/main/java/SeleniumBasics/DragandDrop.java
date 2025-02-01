package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop extends Base
{
	public void dragdrophandling()
	{
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement sourcedraggableelement1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement targetelement=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		Actions action=new Actions(driver);
		action.dragAndDrop(sourcedraggableelement1, targetelement).perform();
		WebElement sourcedraggable2=driver.findElement(By.xpath("//span[text()='Draggable n°2']"));
		action.dragAndDrop(sourcedraggable2, targetelement).perform();
		WebElement sourcedraggable3=driver.findElement(By.xpath("//span[text()='Draggable n°3']"));
		action.dragAndDrop(sourcedraggable3, targetelement).perform();
		WebElement sourceelement4=driver.findElement(By.xpath("//span[text()='Draggable n°4']"));
		action.dragAndDrop(sourceelement4, targetelement).perform();
			
	}

	public static void main(String[] args) {
		DragandDrop draganddrop=new DragandDrop();
		draganddrop.initialiseBrowser();
		draganddrop.dragdrophandling();
		

	}

}

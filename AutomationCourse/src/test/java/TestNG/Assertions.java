package TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions extends TestNGbase {
	@Test
	public void elementcommands() {
		String input = "Hello";
		WebElement singleinputfield = driver.findElement(By.xpath("//input[@class='form-control']"));
		singleinputfield.sendKeys(input);

		WebElement showmessagebutton = driver.findElement(By.xpath("//button[text()='Show Message']"));
		showmessagebutton.click();
		WebElement yourmessage = driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualresult = yourmessage.getText();
		System.out.println(actualresult);
		String expectedresult = "Your Message : " + input;
		Assert.assertEquals(expectedresult, actualresult,
				"Expected result is : " + expectedresult + "but it is : " + actualresult);// 3rd parameter is negative
																							// message (incase of
																							// failure)
		boolean isshowmessagebuttondisplayed = showmessagebutton.isSelected();
		Assert.assertTrue(isshowmessagebuttondisplayed, "showmessagebutton is not displayed");
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement genderbutton = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean isradiobuttonbeforeclickselected = genderbutton.isSelected();
		Assert.assertFalse(isradiobuttonbeforeclickselected, "radiobutton is selected before click");

		genderbutton.click();
		boolean isradiobuttonselectedafterclick = genderbutton.isSelected();
		Assert.assertTrue(isradiobuttonselectedafterclick, "radio button is not selected");
		int a = 10, b = 20;
		Assert.assertNotEquals(a, b, "a and b are equal");
		String s = null;
		Assert.assertNull(s, "String s contains a value");
		String name = "swathy";
		Assert.assertNotNull(name, "String name is null");
}
	@Test

	public void verifysoftalert() {//softassertion continues execution after failure case otherthan hardassertion
		WebElement showmessagebutton = driver.findElement(By.xpath("//button[text()='Show Message']"));
		boolean isshowmessagebuttondisplayed = showmessagebutton.isSelected();
		SoftAssert softassert=new SoftAssert();
		softassert.assertTrue(isshowmessagebuttondisplayed,"show message is not displayed");
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement genderbutton = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean isradiobuttonbeforeclickselected = genderbutton.isSelected();
		softassert.assertFalse(isradiobuttonbeforeclickselected,"radio button is not selected");
		softassert.assertAll();
		
		

	}
}

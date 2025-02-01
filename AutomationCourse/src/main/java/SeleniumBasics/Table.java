package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Table extends Base {
	
	public void tableactions()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table1=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println("Fulltable .."+table1.getText());
		
		
	}
	public void headings()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tablehead=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead"));
		System.out.println("table with heading "+tablehead.getText());
	}
	public void selectrow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement selectrow=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody/tr[1]"));
		System.out.println("first row "+selectrow.getText());
	}
	public void selectelement()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement selectelement=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td[2]"));
		System.out.println("select a element "+selectelement.getText());
	} 
	public void list()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> list1=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[2]"));
		for(WebElement lists:list1)
		{
			System.out.println(lists.getText());
		}
	}
	public void elementsearch()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String input="Garrett Winters";
		List<WebElement> list2=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		int flag=0;
		for(WebElement lists:list2)
		{
			if(lists.getText().equalsIgnoreCase(input))
			{
				System.out.println(lists.getText());
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not found");
		}
			
	}
	public void employeesalery()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> list1=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[6]"));
		System.out.println("Employee salery is...");
		for(WebElement lists:list1)
		{
			
			System.out.println(lists.getText());
		}
		
		
	}
	public void jobsearch()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String input="Javascript Developer";
		List<WebElement> list=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[2]"));
		int flag=0;
		for(WebElement lists:list)
		{
			if(lists.getText().equalsIgnoreCase(input))
			{
				System.out.println(lists.getText());
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not found");
		}
	}

	public static void main(String[] args) {
		Table table=new Table();
		table.initialiseBrowser();
		table.tableactions();
		table.headings();
		table.selectrow();
		table.selectelement();
		table.list();
		table.elementsearch();
		table.employeesalery();
		table.jobsearch();

	}

}

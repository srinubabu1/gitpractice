package qafoxselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basiccommandsinselenium 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//it will be open the new chrome browser lunch
		WebDriver driver = new ChromeDriver();
		
		//driver is refrence variable,.get() is a used to open the specified url brpwser
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		//get is normal method of webdriver
		
		//it open the browser maximize the window
		driver.manage().window().maximize();
		
		//finding the ui element
		//findelement is return type of webelemnt
		//By is a class 
		//id is a attribute or static
		//but2 is a attribute value
		//WebElement element =driver.findElement(By.name(""));
		//element.click();//click the confirm button//getconfirmation box 
		//click is a predefine method of WebElement
		
//		WebElement element1 =driver.findElement(By.name("q"));
//		element1.sendKeys("srinu");
		//sendKeys is send to the data to store the element1
		
        Thread.sleep(5000);
        //it wait for 5seconds and after clear the data
       //hold the program in exceution time
		
		//WebElement element1 =driver.findElement(By.id("textbox1"));
		//element1.clear();
		//clear means to clear the data from any data of boxs,
		
		//WebElement element1 =driver.findElement(By.className("classone"));
		//element1.sendKeys("srinu");
     //class name is a pass the data in the text box//locating using class
        
       // WebElement element1 =driver.findElement(By.linkText("compendiumdev"));
		//element1.click();
        //linktest means it will open the link.
		
		//WebElement element1 =driver.findElement(By.linkText("compendiumdev"));
		//element1.click();
        //linktest means it will write full link .only write for compendi.it will take the link
		
		//WebElement element1 =driver.findElement(By.partialLinkText("compendiumdev"));
		//element1.click();
        //partiallinktext means it will write full link compendium
		
		//WebElement element1 =driver.findElement(By.);
		//element1.click();
	}

}

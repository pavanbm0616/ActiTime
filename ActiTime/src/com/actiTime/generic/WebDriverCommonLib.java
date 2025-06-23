package com.actiTime.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverCommonLib
{
public void waitForPageLoad(WebDriver driver)
	{
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
public void selectOptions(WebElement element, int i)
	{
Select s=new Select(element);
s.selectByIndex(i);
	}
public void selectOptions(WebElement element,String text)
	{
Select s=new Select(element);
s.selectByVisibleText(text);
	}
public void rightClick(WebDriver driver,WebElement element)
	{

Actions a=new Actions(driver);
a.contextClick(element).perform();
	}

	public void mouseMover( WebDriver driver,WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	public void useDoubleclick(WebDriver driver, WebElement element){

	Actions a = new Actions(driver);
	a.doubleClick(element).perform();
	}
	public void rightClick(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.contextClick().perform();
	}
	public void demodrangAndDrop(WebDriver driver,WebElement src,WebElement des )
	{
	Actions a = new Actions(driver);
	a.dragAndDrop(src,des).perform();
	}
	}



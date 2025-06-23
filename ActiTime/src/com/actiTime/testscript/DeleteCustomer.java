package com.actiTime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actiTime.generic.BaseClass;
import com.actiTime.generic.FileLib;
import com.actiTime.pom.HomePage;
import com.actiTime.pom.TaskListPage;
@Listeners(com.actiTime.generic.ListenerImplementation.class)
public class DeleteCustomer extends BaseClass
{
@Test(groups= {"smokeTest","regressionTest"})
public void testDeleteCustomer() throws EncryptedDocumentException, IOException, InterruptedException
{
	Reporter.log("Delete Customer",true);
	FileLib f=new FileLib();
	String customerName=f.getExcelData("CreateCustomer",1,3);

	HomePage h=new HomePage(driver);
	h.setTasksTab();
	TaskListPage t=new TaskListPage(driver);

	try {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(t.geteditCustomer()));
	    editButton.click();
	} catch (Exception e) {
	    WebElement element = t.geteditCustomer();
	    ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
	}

	t.getActionBtn().click();
	t.getDeleteCustomer().click();

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement deleteButton = wait.until(ExpectedConditions.elementToBeClickable(t.getParmentDelete()));
	    deleteButton.click();

	WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait1.until(ExpectedConditions.textToBePresentInElement(t.getParmentDelete(),customerName));
	String deleteCustomer=t.getParmentDelete().getText();
	Assert.assertEquals(deleteCustomer,customerName);

}
}

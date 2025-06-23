package com.actiTime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
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
public class CustomerModule extends BaseClass
{
@Test(groups={"smokeTest","regressionTest"})
public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException
{
	Reporter.log("Create Customer",true);
	FileLib f=new FileLib();
	String customerName=f.getExcelData("CreateCustomer",1,3);
	String customerDescription=f.getExcelData("CreateCustomer",1,4);
	HomePage h=new HomePage(driver);
	h.setTasksTab();
	TaskListPage t=new TaskListPage(driver);

	t.getAddNewBtn().click();
	t.getNewCustomerOption().click();
	t.getEntercustomerName().sendKeys(customerName);
	t.getCustomerDescriptionbtx().sendKeys(customerDescription);
	t.getSelectCustomerDD().click();
	t.getOurcompanyOption().click();
	t.getCreateCustomerBtn().click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.textToBePresentInElement(t.getActualcustomerCreated(),customerName));
	String actualCustomer=t.getActualcustomerCreated().getText();
	Assert.assertEquals(actualCustomer,customerName);
}
}

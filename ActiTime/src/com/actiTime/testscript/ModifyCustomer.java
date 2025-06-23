package com.actiTime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actiTime.generic.BaseClass;
import com.actiTime.pom.TaskListPage;

@Listeners(com.actiTime.generic.ListenerImplementation.class)
public class ModifyCustomer extends BaseClass
{
	@Test(groups= {"smokeTest","regressionTest"})
	public void testModifyCustomer() throws EncryptedDocumentException, InterruptedException, IOException
	{
	CustomerModule cm=new CustomerModule();
	cm.testCreateCustomer();
	TaskListPage t=new TaskListPage(driver);
	t.getModifyCustomer().sendKeys("ICICI");
}
}
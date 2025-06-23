package com.actiTime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
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
@Test
public class ProjectModule extends BaseClass
{
	public void testCreateProject() throws EncryptedDocumentException, IOException
	{
Reporter.log("Create Project",true);
FileLib f=new FileLib();
String projectName=f.getExcelData("CreateProject",1 , 3);
String projectDescription=f.getExcelData("CreateProject", 1, 4);
HomePage h=new HomePage(driver);
h.setTasksTab();
TaskListPage t=new TaskListPage(driver);
t.getAddNewBtn().click();
t.getNewProject().click();
t.getActionProjectBtn().sendKeys(projectName);
t.getSelectCustomerDDProjoct().click();
t.getSelectOurCompanyProject().click();
t.getAddProjectDescription().sendKeys(projectDescription);
t.getCreateProject().click();
t.getEditProjectBtn().click();
t.getActionProjectBtn().click();
t.getDeleteProject().click();

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement deleteButton = wait.until(ExpectedConditions.elementToBeClickable(t.getParaDeleteProject()));
deleteButton.click();

WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
wait1.until(ExpectedConditions.textToBePresentInElement(t.getParmentDelete(),projectName));
String deleteProject=t.getParmentDelete().getText();
Assert.assertEquals(deleteProject,projectName);

}
}


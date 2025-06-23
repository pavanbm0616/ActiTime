package com.actiTime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage
{
@FindBy(xpath="//div[text()='Add New']")
private WebElement addNewBtn;

@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement newCustomerOption;

@FindBy(id="customerLightBox_nameField")
private WebElement entercustomerName;

@FindBy(id="customerLightBox_descriptionField")
private WebElement customerDescriptionbtx;

@FindBy(xpath="//button[contains(text(),'-- Select an active ')]")
private WebElement selectCustomerDD;

@FindBy(xpath="(//a[normalize-space()='Our Company'])[1]")
private WebElement ourcompanyOption;

@FindBy(xpath="//span[text()='Create Customer']")
private WebElement createCustomerBtn;

@FindBy(xpath="//div[@class='navigationLinks']/../div[@class='title ellipsis']")
private WebElement actualCustemerCreated;



@FindBy(xpath="//div[text()='HDFC_001 ']/../div[@class='editButton available']")
private WebElement editCustomer;

@FindBy(xpath="//div[@id='taskListBlock']/div[@class='edit_customer_sliding_panel sliding_panel']/div[@class='headerBlock']/div[@class='actions']")
private WebElement actionBtn;

@FindBy(xpath="(//div[@style='display: inline-block;']/div)[last()]")
private WebElement deleteCustomer;

@FindBy(xpath="//span[@id='customerPanel_deleteConfirm_submitTitle']")
private WebElement parmentDelete;

public WebElement getNewProject() {
	return newProject;
}

public void setNewProject(WebElement newProject) {
	this.newProject = newProject;
}

public WebElement getProjectName() {
	return projectName;
}

public void setProjectName(WebElement projectName) {
	this.projectName = projectName;
}

public WebElement getSelectCustomerDDProjoct() {
	return selectCustomerDDProjoct;
}

public void setSelectCustomerDDProjoct(WebElement selectCustomerDDProjoct) {
	this.selectCustomerDDProjoct = selectCustomerDDProjoct;
}

public WebElement getSelectOurCompanyProject() {
	return selectOurCompanyProject;
}

public void setSelectOurCompanyProject(WebElement selectOurCompanyProject) {
	this.selectOurCompanyProject = selectOurCompanyProject;
}

public WebElement getAddProjectDescription() {
	return addProjectDescription;
}

public void setAddProjectDescription(WebElement addProjectDescription) {
	this.addProjectDescription = addProjectDescription;
}

public WebElement getCreateProject() {
	return createProject;
}

public void setCreateProject(WebElement createProject) {
	this.createProject = createProject;
}

public WebElement getEditProjectBtn() {
	return editProjectBtn;
}

public void setEditProjectBtn(WebElement editProjectBtn) {
	this.editProjectBtn = editProjectBtn;
}

public WebElement getActionProjectBtn() {
	return actionProjectBtn;
}

public void setActionProjectBtn(WebElement actionProjectBtn) {
	this.actionProjectBtn = actionProjectBtn;
}

public WebElement getDeleteProject() {
	return deleteProject;
}

public void setDeleteProject(WebElement deleteProject) {
	this.deleteProject = deleteProject;
}

public WebElement getParaDeleteProject() {
	return paraDeleteProject;
}

public void setParaDeleteProject(WebElement paraDeleteProject) {
	this.paraDeleteProject = paraDeleteProject;
}
@FindBy(xpath="//div[@class='edit_customer_sliding_panel sliding_panel']//input[@type='text']")
private WebElement modifyCustomer;

@FindBy(xpath="//div[contains(text(),'+ New Project')]")
private WebElement newProject;

@FindBy(xpath="//input[@class='projectNameField inputFieldWithPlaceholder']")
private WebElement projectName;

@FindBy(xpath="(//td[@class='x-btn-center'])[1]")
private WebElement selectCustomerDDProjoct;

@FindBy(xpath="//a[text()='Our Company']")
private WebElement selectOurCompanyProject;

@FindBy(xpath="//textarea[@id='projectPopup_projectDescriptionField']")
private WebElement addProjectDescription;

@FindBy(xpath="//span[text()='Create Project']")
private WebElement createProject;

@FindBy(xpath="(//div[@class='editButton available'])[last()-4]")
private WebElement editProjectBtn;

@FindBy(xpath="//div[@class='actionButtonWrapper pressed']")
private WebElement actionProjectBtn;

@FindBy(xpath="(//div[text()='Delete']| //div[@style='display: inline-block;'])[last()]")
private WebElement deleteProject;

@FindBy(xpath="//span[@id='projectPanel_deleteConfirm_submitTitle']")
private WebElement paraDeleteProject;

public WebElement geteditCustomer() {
	return editCustomer;
}

public WebElement getModifyCustomer() {
	return modifyCustomer;
}

public void setModifyCustomer(WebElement modifyCustomer) {
	this.modifyCustomer = modifyCustomer;
}

public void seteditCustomer(WebElement editCustomer) {
	this.editCustomer = editCustomer;
}

public WebElement getActionBtn() {
	return actionBtn;
}

public void setActionBtn(WebElement actionBtn) {
	this.actionBtn = actionBtn;
}

public WebElement getDeleteCustomer() {
	return deleteCustomer;
}

public void setDeleteCustomer(WebElement deleteCustomer) {
	this.deleteCustomer = deleteCustomer;
}



public WebElement getAddNewBtn() {
	return addNewBtn;
}

public WebElement getNewCustomerOption() {
	return newCustomerOption;
}

public WebElement getEntercustomerName() {
	return entercustomerName;
}

public WebElement getCustomerDescriptionbtx() {
	return customerDescriptionbtx;
}

public WebElement getParmentDelete() {
	return parmentDelete;
}

public void setParmentDelete(WebElement parmentDelete) {
	this.parmentDelete = parmentDelete;
}

public WebElement getSelectCustomerDD() {
	return selectCustomerDD;
}

public WebElement getOurcompanyOption() {
	return ourcompanyOption;
}

public WebElement getCreateCustomerBtn() {
	return createCustomerBtn;
}

public WebElement getActualcustomerCreated() {

	return actualCustemerCreated;
}
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
}

}

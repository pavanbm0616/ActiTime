package com.actiTime.generic;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.actiTime.pom.HomePage;
import com.actiTime.pom.LoginPage;

public class BaseClass
{
public  WebDriver driver;
@Parameters("browser")
@BeforeTest(groups= {"smokeTest","regressionTest"})
public void openBrowser(String browser)
{
	if(browser.equals("chrome"))
	{
		driver=new ChromeDriver();
	}else if(browser.equals("edge"))
	{
		driver=new EdgeDriver();
	}
	else {
		driver=new FirefoxDriver();
	}
	Reporter.log("OpenBroswer",true);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//driver.get("http://localhost/login.do");
}
@AfterTest(groups={"smokeTest","regressionTest"})
public void closeBrowser() {
Reporter.log("CloseBrowser",true);
driver.quit();
}
@BeforeMethod(groups= {"smokeTest","regressionTest"})
public void login() throws IOException
{
	Reporter.log("login",true);
	FileLib f=new FileLib();
	String url = f.getPropertyData("url");
	String un=   f.getPropertyData("username");
	String pw=   f.getPropertyData("password");
	driver.get(url);
	LoginPage l=new LoginPage(driver);
	l.setLogin(un,pw);
}
@AfterMethod(groups={"smokeTest","regressionTest"})
public void logout()
{
	Reporter.log("logout",true);
	HomePage h=new HomePage(driver);
	h.setLogOut();
}
}

package com.hrms.lib;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import com.hrms.utility.Log;

public class General extends Global {
	public void OpenBrowserApplication() 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Rashmi\\chromedriver_win32 (1)\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.navigate().to(url);
			driver.manage().window().maximize();
			Reporter.log("Browser Opened");
			Log.info("Browser Opened");
		}
	public void LoginApplication() 
		{
			driver.findElement(By.name(txt_Loginname)).sendKeys(username);
			driver.findElement(By.name(txt_password)).sendKeys(password);
			driver.findElement(By.name(btn_login)).click();
			Log.info("Applicaton Opened");
		}
	public void LogoutApplication() 
		{
			driver.findElement(By.linkText(link_logout)).click();
			driver.close();
			Reporter.log("Application Closed");
			Log.info("Applicaton Closed");
		}
	public void AddEmployee() throws Exception
	{
		//driver.findElement(By.linkText(link_PIM)).click();
		WebElement ele=driver.findElement(By.linkText(link_PIM));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.linkText(link_addemp)).click();
		driver.switchTo().frame("rightMenu");
		Thread.sleep(2000);
		System.out.println("Clicked on sub menu");
		driver.findElement(By.name(txt_Lastname)).sendKeys(lastname);
		Thread.sleep(2000);
		driver.findElement(By.name(txt_Firstname)).sendKeys(firstname);
		Thread.sleep(2000);
		driver.findElement(By.className(btn_save)).click();
		Thread.sleep(2000);
		System.out.println("new Employee added");
		Log.info("new Employee added");
		driver.switchTo().defaultContent();
	}
	public void AddNewCompanyLocation() throws Exception
		{
		WebElement admin =  driver.findElement(By.linkText(link_admin));
		Actions action = new Actions(driver);
		action.moveToElement(admin).perform();
		Thread.sleep(3000);
		WebElement Company =  driver.findElement(By.linkText(companyl));
		action.moveToElement(Company).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText(link_locations)).click();
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath(btnxp_add)).click();
		Thread.sleep(3000);
		driver.findElement(By.name(txtc_name)).sendKeys(name);
		Select sel = new Select(driver.findElement(By.id(selectid_country)));
		sel.selectByVisibleText("India");
		Thread.sleep(3000);
		driver.findElement(By.id(stateid)).sendKeys(State);
		Thread.sleep(3000);
		driver.findElement(By.id(cityc)).sendKeys(city);
		Thread.sleep(3000);
		driver.findElement(By.name(Addressn)).sendKeys(Address);
		Thread.sleep(3000);
		driver.findElement(By.name(zipcoden)).sendKeys(zipcode);
		Thread.sleep(3000);
		driver.findElement(By.name(phonen)).sendKeys(phone);
		Thread.sleep(3000);
		driver.findElement(By.name(faxn)).sendKeys(fax);
		Thread.sleep(3000);
		driver.findElement(By.className(btnsave_c)).click();
		driver.switchTo().defaultContent();
		Log.info("Added new company location");
		
			}
	public void searchNewAddedComLtn() throws Exception
	{
		WebElement admin =  driver.findElement(By.linkText(link_admin));
		Actions action = new Actions(driver);
		action.moveToElement(admin).perform();
		Thread.sleep(3000);
		WebElement Company =  driver.findElement(By.linkText(companyl));
		action.moveToElement(Company).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText(link_locations)).click();
		driver.switchTo().frame("rightMenu");
		Select sel = new Select(driver.findElement(By.id(dropdownbox)));
		Thread.sleep(2000);
		sel.selectByVisibleText("ID");
		Thread.sleep(2000);
		driver.findElement(By.xpath(search_txt)).sendKeys(searchbyid);
		Thread.sleep(2000);
		driver.findElement(By.xpath(searchbutton)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(checkbox)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(delete_btn)).click();
		driver.switchTo().defaultContent();
		Log.info("Searched new added company location");
	}
	public void DeleteCompanyLtn() throws Exception
	{
		WebElement admin =  driver.findElement(By.linkText(link_admin));
		Actions action = new Actions(driver);
		action.moveToElement(admin).perform();
		Thread.sleep(3000);
		WebElement Company =  driver.findElement(By.linkText(companyl));
		action.moveToElement(Company).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText(link_locations)).click();
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath(checkbox)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(delete_btn)).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.switchTo().defaultContent();
		
		
	}
	public void AddCompanyPropertyAndDelete() throws Exception
	{
		
		WebElement admin = driver.findElement(By.linkText("Admin"));
		Actions action = new Actions(driver);
		action.moveToElement(admin).perform();
		WebElement  companyinfo = driver.findElement(By.linkText("Company Info"));
		action.moveToElement(companyinfo).perform();
		driver.findElement(By.linkText("Company Property")).click();
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/input[1]")).click();
		driver.findElement(By.id("txtPropertyName")).sendKeys("Mouse");
		driver.findElement(By.id("saveBtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='chkPropId[]']")).click();
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.switchTo().defaultContent();
		
	}
}

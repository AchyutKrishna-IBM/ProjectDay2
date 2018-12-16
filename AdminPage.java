package com.ibm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AdminPage{
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath="//*[@id='side-menu']/li[2]/a")
	WebElement catalogEle;
	@FindBy(xpath="//*[@id='side-menu']/li[2]/ul/li[4]/a")
	WebElement productsEle;
	@FindBy(xpath="//input[@type='search']")
	WebElement searchEle;
	@FindBy(xpath="//*[@id='dataTableExample2']/tbody/tr[1]/td[9]/div/button")
	WebElement productActionEle;
	@FindBy(xpath="//*[@id='dataTableExample2']/tbody/tr[1]/td[9]/div/ul/li[2]/a")
	WebElement deleEle;
	@FindBy(xpath="//div[@class='sa-confirm-button-container']/button")
	WebElement confDelEle;
	@FindBy(xpath="//*[@id='dataTableExample2']/tbody/tr[1]/td[3]/img")
	WebElement imageDeleEle;
	
	
	public AdminPage(WebDriver driver,WebDriverWait wait)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		this.wait=wait;
	}
	public void clickOnCatalog()
	{
		catalogEle.click();
	}
	public void clickOnProducts()
	{
		productsEle.click();
	}
	public void searchElementToBeDeleted(String searchedEle)
	{
		searchEle.sendKeys(searchedEle);
	}
	public void clickOnProductActionEle()
	{
		productActionEle.click();
	}
	public void selectDeleteEle()
	{
		deleEle.click();
	}
	public void clickOnconfDelEle()
	{
		confDelEle.click();
	}
	public void imageDeletionConf()
	{
		Assert.assertFalse(imageDeleEle.isDisplayed());
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

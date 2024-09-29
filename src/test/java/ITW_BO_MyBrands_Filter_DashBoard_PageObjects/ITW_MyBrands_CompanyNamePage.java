package ITW_BO_MyBrands_Filter_DashBoard_PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ITW_PageObjects.ITW_Base;

public class ITW_MyBrands_CompanyNamePage extends ITW_Base {

	public ITW_MyBrands_CompanyNamePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[text()='Company Name']")
	WebElement CompanyNameOpt;
	
	@FindBy(xpath="/html/body/div[8]/div[3]/div/div[2]/div[3]/div/img")
	WebElement CompanyNameOptArr;
	
	@FindBy(xpath="//span[text()='All']")
	WebElement MultipleCompanyNames;
	
	@FindBy(xpath="//span[@class='text-white text-[14px]']")
	WebElement CompanyNames;
	
	@FindBy(xpath="//input[@id='default-search']")
	WebElement CompanySearchbar;
	
	@FindBy(xpath=" //div[@class='flex flex-1 items-center']//*[name()='svg']")
	WebElement CompanyNavigatebackArr;
	
	@FindBy(xpath="//button[text()='Done']")
	WebElement btnDone;
	
	@FindBy(xpath="//button[text()='CLEAR']")
	WebElement btnClear;
	
	@FindBy(xpath="//button[text()='APPLY FILTERS']")
	WebElement btnApplyFiltersBtn;

	@FindBy(xpath="//button[text()='CLEAR ALL']")
	WebElement btnClearAllBtn;
	
	
	public void clickonCompanyNameOpt() {
		
		try {
			Thread.sleep(2000);
			CompanyNameOpt.click();
		}catch(Exception e) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", CompanyNameOpt);
		}
	}
	
	public void fetchCompanyNames() {
		
		List<WebElement>CompanyNames=driver.findElements(By.xpath("//span[@class='text-white text-[14px]']"));
		int size=CompanyNames.size();
		for(int i=0;i<=size-1;i++) {
			String CompValues=CompanyNames.get(i).getText();
			
			if(CompValues.equals("Acer")) {
				
				CompanyNames.get(i).click();
			}
			
		}
	}
	
	public void CompSearchBarFun() {
		
		CompanySearchbar.sendKeys("Acer");
	}
	
	public void CompNavigateBackArr() {
		try {
		CompanyNavigatebackArr.click();
		}catch(Exception e) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", CompanyNavigatebackArr);
		}
	}
	
	public void clickCompDonebtn() {
		
		btnDone.click();
	}
	
	public void clickCompClearbtn() {
		
		btnClear.click();
	}
	
	public void clickClearBtn() {
		
		btnClearAllBtn.click();
	}
	
	public void clickApplyFiltersBtn() {
		
		btnApplyFiltersBtn.click();
	}
	
	public void clickMultipleCompanyNames() {
		
		MultipleCompanyNames.click();
	}
	
	public void InvalidCompanySearch() {
		
		CompanySearchbar.sendKeys("Lenovo");
	}

}

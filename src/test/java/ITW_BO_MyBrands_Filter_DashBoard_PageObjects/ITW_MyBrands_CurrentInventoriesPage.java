package ITW_BO_MyBrands_Filter_DashBoard_PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ITW_PageObjects.ITW_Base;

public class ITW_MyBrands_CurrentInventoriesPage extends ITW_Base {

	public ITW_MyBrands_CurrentInventoriesPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[text()='Current Inventories']")
	WebElement CurrentInventoriesopt;
	
	@FindBy(xpath="//span[@class='text-white text-[14px]']")
	WebElement AllCInventories;
	
	@FindBy(xpath="//span[normalize-space()='All']")
	WebElement AllInventoriesopt;
	
	@FindBy(xpath=" //div[@class='flex flex-1 items-center']//*[name()='svg']")
	WebElement CINavigateBackArr;
	

	@FindBy(xpath="//button[normalize-space()='DONE']")
	WebElement btnDone;
	
	@FindBy(xpath="//button[normalize-space()='CLEAR']")
	WebElement btnClear;
	
	@FindBy(xpath="//button[normalize-space()='APPLY FILTERS']")
	WebElement btnApplyFiltersBtn;

	@FindBy(xpath="//button[normalize-space()='CLEAR ALL']")
	WebElement btnClearAllBtn;
	
	
	
	public void clickCInventoriesOpt() {
		try {
		CurrentInventoriesopt.click();
		}catch(Exception e) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", CurrentInventoriesopt);
		}
	}
	
	public void FetchCInvetories() {
		
		List<WebElement>AllCI=driver.findElements(By.xpath("//span[@class='text-white text-[14px]']"));
		int size=AllCI.size();
		
		for(int i=0;i<=size-1;i++) {
			
			String CIValues=AllCI.get(i).getText();
			
			if(CIValues.equals("1-5 Inventories")) {
				
				AllCI.get(i).click();
			}
		}
	}
	
	public void SelectMultipleInvetories() {
		AllInventoriesopt.click();
	}
	
	public void clickCINavigatebackarr() {
		
		CINavigateBackArr.click();
	}
	
	public void clickDoneBtn() {
		try {
		btnDone.click();
		}catch(Exception e) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", btnDone);
		}
	}
	
	public void clickClearBtn() {
		
		btnClear.click();
	}
	
	public void ClickApplyFiltersBtn() {
		
		btnApplyFiltersBtn.click();
	}
	
	public void ClickClearAllBtn() {
		
	}

}

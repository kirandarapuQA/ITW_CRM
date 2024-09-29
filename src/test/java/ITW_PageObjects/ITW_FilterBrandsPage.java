package ITW_PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ITW_FilterBrandsPage extends ITW_Base{

	public Actions ac;
	public Alert a;
	
	public ITW_FilterBrandsPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath="//span[text()='Regions & Cities']")
	WebElement Regions_Cities;
	
	@FindBy(xpath="//span[text()='Industries / Categories']")
	WebElement Industries;
	
	@FindBy(xpath="//span[text()='Company Name']")
	WebElement CompanyName;
	
	@FindBy(xpath="/html/body/div[8]/div[3]/div/div[2]/div[3]/div/img")
	WebElement CompanyNameoptArr;
	
	@FindBy(xpath="//span[text()='Co-Brand Owners']")
	WebElement CoBrandOwners;
	
	@FindBy(xpath="//span[text()='Current Inventories']")
	WebElement CInventories;
	
	@FindBy(xpath="//span[text()='With POC']")
	WebElement BPC_WPOC;
	
	@FindBy(xpath="//span[text()='Without POC']")
	WebElement BPC_WOPOC;
	
	@FindBy(xpath="//span[text()='Yes']")
	WebElement PCD_yes;
	
	@FindBy(xpath="//span[text()='No']")
	WebElement PCD_No;
	
	@FindBy(xpath="//input[@id=':r3d:']")
	WebElement AR_Min;
	
	@FindBy(xpath="//input[@id=':r3e:']")
	WebElement AR_Max;
	
	@FindBy(xpath="//span[text()='Only Me']")
	WebElement BOT_onlyMe;
	
	@FindBy(xpath="//span[text()='Multiple']")
	WebElement BOT_Multiple;
	
	@FindBy(xpath="//button[text()='APPLY FILTERS']")
	WebElement btn_ApplyFilters;
	
	@FindBy(xpath="//button[text()='CLEAR ALL']")
	WebElement btn_ClearAll;
	
	@FindBy(xpath="/html/body/div[8]/div[3]/div/div[1]/button")
	WebElement MuilBtn;
	
	@FindBy(xpath="//button[text()='DISCARD']")
	WebElement btndiscard;
	
	@FindBy(xpath="//button[normalize-space()='CANCEL']")
	WebElement btnCancel;
	
	public void clickRegionsandCitiesOpt() {
		
		Regions_Cities.click();	
	}
	
	public void clickIndustriesOrCategoriesOpt() {
		
		Industries.click();
	}
	
	public void clickCompanyNameOpt() {
		
		try {
			CompanyNameoptArr.click();
		}catch(Exception e) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();",CompanyNameoptArr);
		}
	}
	
	public void clickCoBrandOwnersOpt(){
		
		CoBrandOwners.click();
	}
	
	public void clickCInventoriesOpt() {
		
		CInventories.click();
	}
	
	public void clickBPCWithPoc() {
		
		BPC_WPOC.click();
	}
	
	public void clickBPCWithOutPOC() {
		
		BPC_WOPOC.click();
	}
	
	public void clickPCD_Yes() {
		
		PCD_yes.click();
	}
	
	public void clickPCD_NO() {
		
		PCD_No.click();
	}
	
	
	
	public void EnterMinAR() {
		
		AR_Min.sendKeys("0");
	}
	
	public void EnterMaxAR() throws InterruptedException {
		
		AR_Max.clear();
		Thread.sleep(2000);
		AR_Max.sendKeys("0");
	}
	
	public void MinSliderFun() {
		ac=new Actions(driver);
		ac.dragAndDropBy(AR_Min, 50, 0).perform();
		
	}
	
	public void MaxSliderFun() {
		ac.dragAndDropBy(AR_Max, -50, 0).perform();
	}
	
	public void SelectBOT_OnlyMe() {
		
		BOT_onlyMe.click();
	}
	
	public void SelectBOT_Multiple() {
		
		BOT_Multiple.click();
	}
	
	public void clickApplyFiltersbtn() {
		
		btn_ApplyFilters.click();
	}
	
	public void clickClearAllbtn() {
		
		btn_ClearAll.click();
	}
	
	public void clickMuilBtn() {
		
		MuilBtn.click();	
	}
	
	public void WarnigModelFun_Discard() {
		
		a=driver.switchTo().alert();
		a.accept();
	}
	
	public void WarnigModelFun_Cancel() {
		a.dismiss();
	}
	
	public void clickDiscardBtn() {
		
		btndiscard.click();
	}
	
	public void clickCancelBtn() {
		
		btnCancel.click();
	}

}

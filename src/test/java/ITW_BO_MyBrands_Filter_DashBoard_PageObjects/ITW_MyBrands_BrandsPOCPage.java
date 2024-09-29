package ITW_BO_MyBrands_Filter_DashBoard_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ITW_PageObjects.ITW_Base;

public class ITW_MyBrands_BrandsPOCPage extends ITW_Base {

	public ITW_MyBrands_BrandsPOCPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[text()='With POC']")
	WebElement OptWPOC;
	
	@FindBy(xpath="//span[text()='Without POC']")
	WebElement OptWOPOC;
	
	@FindBy(xpath="//button[text()='APPLY FILTERS']")
	WebElement btnApplyFilters;
	
	@FindBy(xpath="//button[text()='CLEAR ALL']")
	WebElement btnClearAll;
	
	
	public void clickBrands_POC_WithPOC() {
		OptWPOC.click();
	}
	
	public void clickBrands_POC_WithoiutPOC() {
		OptWOPOC.click();
	}
	
	public void clickApplyFiltersbtn() {
		btnApplyFilters.click();
	}
    public void clickClearAllbtn() {
    	btnClearAll.click();
    }
}

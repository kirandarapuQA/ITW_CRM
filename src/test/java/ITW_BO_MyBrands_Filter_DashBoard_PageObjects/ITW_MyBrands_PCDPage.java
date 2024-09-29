package ITW_BO_MyBrands_Filter_DashBoard_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ITW_PageObjects.ITW_Base;

public class ITW_MyBrands_PCDPage extends ITW_Base {

	public ITW_MyBrands_PCDPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//span[text()='Yes']")
	WebElement PCD_Yes_opt;
	
	@FindBy(xpath="//span[text()='No']")
	WebElement PCD_No_opt;
	
	@FindBy(xpath="(//span[text()='All'])[2]")
	WebElement PCD_All_opt;
	
	@FindBy(xpath=" //button[normalize-space()='APPLY FILTERS']")
	WebElement btnApplyFiltersBtn;
	
	public void click_PCD_Yes_opt() {
		
		PCD_Yes_opt.click();
	}
	
	public void click_PCD_No_opt() {
		
		PCD_No_opt.click();
	}
	
	public void click_PCD_All_opt() {
		
		PCD_All_opt.click();
	}
	
	public void clickApplyFiltersBtn() {
		
		btnApplyFiltersBtn.click();
	}

}

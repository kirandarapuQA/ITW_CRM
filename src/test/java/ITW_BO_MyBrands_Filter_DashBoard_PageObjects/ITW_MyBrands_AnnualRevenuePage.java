package ITW_BO_MyBrands_Filter_DashBoard_PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import ITW_PageObjects.ITW_Base;

public class ITW_MyBrands_AnnualRevenuePage extends ITW_Base {

	public Actions ac;
	public ITW_MyBrands_AnnualRevenuePage(WebDriver driver) {
		super(driver);	
	}
	
	@FindBy(xpath="//input[@id=':r3d:']")
	WebElement AR_Min;
	
	@FindBy(xpath="//input[@id=':r3e:']")
	WebElement AR_Max;
	
	@FindBy(xpath="/html/body/div[8]/div[3]/div/div[2]/div[8]/div[2]/div/span/span[3]")
	WebElement Min_Slider;
	
	@FindBy(xpath="/html/body/div[8]/div[3]/div/div[2]/div[8]/div[2]/div/span/span[4]")
	WebElement Max_Slider;
	
	@FindBy(xpath="//button[text()='APPLY FILTERS']")
	WebElement btn_ApplyFilters;
	
	
	public void EnterMaxValue() throws InterruptedException {
		
		//AR_Max.clear();
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].setAttribute('value','0')", AR_Max);
		
		AR_Max.sendKeys("0");
	}
	
	public void ScrollingActivity() {
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	public void clickApplyFiltersBtn() {
		
		btn_ApplyFilters.click();
	}
	
	public void MinSliderbarAct() {
		
		 ac=new Actions(driver);
		ac.dragAndDropBy(Min_Slider, 50, 0).perform();
	}
	
	public void MaxSliderbarAct() {
		
		ac.dragAndDropBy(Max_Slider, -50, 0).perform();
		
	}

}

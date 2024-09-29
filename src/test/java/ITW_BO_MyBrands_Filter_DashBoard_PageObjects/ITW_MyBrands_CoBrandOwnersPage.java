package ITW_BO_MyBrands_Filter_DashBoard_PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ITW_PageObjects.ITW_Base;

public class ITW_MyBrands_CoBrandOwnersPage extends ITW_Base {

	public ITW_MyBrands_CoBrandOwnersPage(WebDriver driver) {
		super(driver);	
	}
	
	@FindBy(xpath="//span[text()='Co-Brand Owners']")
	WebElement CoBrandOwnersOpt;
	
	@FindBy(xpath="//div[@class='text-white text-sm font-medium']")
	WebElement CoBrandOwners;
	
	@FindBy(xpath="//span[text()='All']")
	WebElement Mul_Co_BO;
	
	@FindBy(xpath="//input[@id='default-search']")
	WebElement CoBrandOwnersSearch;
	
	@FindBy(xpath="//div[@class='flex flex-1 items-center']//*[name()='svg']")
	WebElement Co_BO_Navigate_Back;
	
	@FindBy(xpath="//button[text()='Done']")
	WebElement btnDone;
	
	@FindBy(xpath="//button[text()='CLEAR']")
	WebElement btnClear;
	
	@FindBy(xpath="//button[text()='APPLY FILTERS']")
	WebElement btnApplyFiltersBtn;

	@FindBy(xpath="//button[text()='CLEAR ALL']")
	WebElement btnClearAllBtn;
	
	
	public void clickCoBrandOwnersOpt() {
		try {
		CoBrandOwnersOpt.click();
		}catch(Exception e) {
			
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", CoBrandOwnersOpt);
		}
		
	}
	
	public void FetchCoBrandOwners() {
		
	List<WebElement>CoBrandOwners=driver.findElements(By.xpath("//div[@class='text-white text-sm font-medium']"));
	int size=CoBrandOwners.size();
	
	for(int i=0;i<=size-1;i++) {
		
		String CoBrandValues=CoBrandOwners.get(i).getText();
		
		if(CoBrandValues.equals("Mugesh LX")) {
			
			CoBrandOwners.get(i).click();
		}
	}
	}
	
	public void CoSearchFun() throws AWTException {
		CoBrandOwnersSearch.sendKeys("Arun Kumar");
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_SPACE);
	}
	
	public void coNavigateBackArr() {
		try {
			Co_BO_Navigate_Back.click();
		}catch(Exception e) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", Co_BO_Navigate_Back);
		}
	}
	
	public void clickDoneBtn() {
		
		btnDone.click();
	}
	
	public void clickClearBtn() {
		
		btnClear.click();
	}
	
	public void clickApplyFiltersBtn() {
		
		btnApplyFiltersBtn.click();
	}
	
	public void clickClearAllBtn() {
		
		btnClearAllBtn.click();
	}
	
	public void SelectMultiple_CO_BO() {
		
		Mul_Co_BO.click();
	}
	
	public void Invalid_CO_BO_Search() {
		
		CoBrandOwnersSearch.sendKeys("Arvin");
	}
	

}

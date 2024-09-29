package ITW_BO_MyBrands_Filter_DashBoard_PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ITW_PageObjects.ITW_Base;
import jdk.internal.org.jline.utils.Log;


public class ITW_MyBrands_IndustriesandCategoriesPage extends ITW_Base {

	public ITW_MyBrands_IndustriesandCategoriesPage(WebDriver driver) {
		super(driver);	
	}

	@FindBy(xpath="//span[text()='Industries / Categories']")
	WebElement IndorCatOpt;

	@FindBy(xpath="/html/body/div[8]/div[3]/div/div[2]/div[2]/div/img")
	WebElement IndorCatOptArr;

	@FindBy(xpath="//span[@class='text-white text-[14px]']")
	WebElement Industries;

	@FindBy(xpath="//span[text()='All']")
	WebElement MultipleIndOpt;

	@FindBy(id="default-search")
	WebElement Industries_SearchBar;

	@FindBy(xpath="//div[@class='flex flex-1 items-center']//*[name()='svg']")
	WebElement Ind_NavigateBackArr;

	@FindBy(xpath="//button[text()='Done']")
	WebElement btnDone;

	@FindBy(xpath="//button[text()='CLEAR']")
	WebElement btnClear;

	@FindBy(xpath="//button[text()='APPLY FILTERS']")
	WebElement btnApplyFiltersBtn;

	@FindBy(xpath="//button[text()='CLEAR ALL']")
	WebElement btnClearAllBtn;

	//Click Industries/Categories Opt
	public void clickIndustriesorCategoriesOpt() throws InterruptedException {


		try {

			IndorCatOptArr.click();
		}catch(Exception e) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", IndorCatOptArr);
		}

	}

	public void SelectMulOpt() {

		MultipleIndOpt.click();
	}

	public void ClickIndorCatArrow() {

		IndorCatOptArr.click();
	}


	//Fetch all the Industries from the Industries/Categories Opt
	public void getIndustries() {

		List<WebElement>Industries=driver.findElements(By.xpath("//span[@class='text-white text-[14px]']"));
		int size=Industries.size();

		for(int i=0;i<=size-1;i++) {

			String IndValues=Industries.get(i).getText();

			if(IndValues.equals("E-commerce Platforms")) {
				Industries.get(i).click();
				break;

			}

		}

	}

	//Industries Search Functionality
	public void IndSearchFun() throws InterruptedException, AWTException {

		Industries_SearchBar.sendKeys("Automotive");
		Thread.sleep(2000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_SPACE);

	}
	
	
	public void InavlidSearchQuery() throws InterruptedException {
		
		Industries_SearchBar.sendKeys("Automotive-5W");
		Thread.sleep(2000);	
	}

	//Navigate Back Arrow functionality
	public void Click_Ind_NavigateBackArr() {
        
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(Ind_NavigateBackArr));
        Ind_NavigateBackArr.click();
        
	}

	public void clickDonebtn() {

		btnDone.click();
	}

	public void clickClearbtn() {

		btnClear.click();
	}

	public void ClickApplyFiltersBtn() {

		btnApplyFiltersBtn.click();
	}

	public void ClickClearAllBtn() throws InterruptedException {

		btnClearAllBtn.click();
		Thread.sleep(3000);
			
	}


}

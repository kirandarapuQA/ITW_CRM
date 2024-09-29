package ITW_BO_MyBrands_FilterFunctionality_Testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import ITW_BO_MyBrands_Filter_DashBoard_PageObjects.ITW_MyBrands_CompanyNamePage;
import ITW_PageObjects.ITW_BO_MyBrandsPage;
import ITW_PageObjects.ITW_LoginPage;


public class TC_019_CompanyNames_SearchFun extends ITW_BaseClass{
	
	@Test(priority=15)
	public void CmapnyNamesSearchFun() throws InterruptedException, AWTException {
		
		ITW_LoginPage lp=new ITW_LoginPage(driver);
		 
		 lp.clickLoginbtn();
		 Thread.sleep(2000);
		 lp.LoginActions();
		 
		 ITW_BO_MyBrandsPage MBP=new ITW_BO_MyBrandsPage(driver);
		 MBP.clickBrandsMenu();
		 Thread.sleep(2000);
		 MBP.clickFilterIcon();
		 Thread.sleep(1000);
		 
		
		 ITW_MyBrands_CompanyNamePage cnp=new ITW_MyBrands_CompanyNamePage(driver);
		 cnp.clickonCompanyNameOpt();
		 Thread.sleep(1000);
		 cnp.CompSearchBarFun();
		 
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_TAB);
		 r.keyRelease(KeyEvent.VK_TAB);
		 
		 r.keyPress(KeyEvent.VK_SPACE);
		 r.keyRelease(KeyEvent.VK_SPACE);
		 
		 cnp.clickCompDonebtn();
		 cnp.clickApplyFiltersBtn();
		 
		 log.info("TC_019_CompanyName_Search Functionality Test Executed");
		 
	}

}

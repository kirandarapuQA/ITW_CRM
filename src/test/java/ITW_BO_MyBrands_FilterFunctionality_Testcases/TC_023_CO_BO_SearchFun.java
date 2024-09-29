package ITW_BO_MyBrands_FilterFunctionality_Testcases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import ITW_BO_MyBrands_Filter_DashBoard_PageObjects.ITW_MyBrands_CoBrandOwnersPage;
import ITW_PageObjects.ITW_BO_MyBrandsPage;
import ITW_PageObjects.ITW_LoginPage;

public class TC_023_CO_BO_SearchFun extends ITW_BaseClass{
	
	@Test(priority=18)
	public void Co_BO_Search() throws InterruptedException, AWTException {
		
		ITW_LoginPage lp=new ITW_LoginPage(driver);
		 
		 lp.clickLoginbtn();
		 Thread.sleep(2000);
		 lp.LoginActions();
		 
		 ITW_BO_MyBrandsPage MBP=new ITW_BO_MyBrandsPage(driver);
		 MBP.clickBrandsMenu();
		 Thread.sleep(2000);
		 MBP.clickFilterIcon();
		 Thread.sleep(1000);
		 ITW_MyBrands_CoBrandOwnersPage cbp=new ITW_MyBrands_CoBrandOwnersPage(driver);
		 cbp.clickCoBrandOwnersOpt();
		 Thread.sleep(2000);
		 cbp.CoSearchFun();
		 cbp.clickDoneBtn();
		 cbp.clickApplyFiltersBtn();
		 
		 log.info("**** TC_023_CO_BO_Search Functionality Testcase Executed ****");
		 
		 
	}

}

package ITW_BO_MyBrands_FilterFunctionality_Testcases;

import org.testng.annotations.Test;

import ITW_BO_MyBrands_Filter_DashBoard_PageObjects.ITW_MyBrands_CompanyNamePage;
import ITW_PageObjects.ITW_BO_MyBrandsPage;
import ITW_PageObjects.ITW_LoginPage;

public class TC_018_MultipleCompanyNames extends ITW_BaseClass {

	@Test(priority=14)
	public void MiltipleCompanyNamesTest() throws InterruptedException {
		
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
		 cnp.clickMultipleCompanyNames();
		 Thread.sleep(1000);
		 cnp.clickCompDonebtn();
		 Thread.sleep(1000);
		 cnp.clickApplyFiltersBtn();
		 
		 log.info("**** TC_018_MultipleCompanyNames Testcase Executed ****");
		 
		
	}
}

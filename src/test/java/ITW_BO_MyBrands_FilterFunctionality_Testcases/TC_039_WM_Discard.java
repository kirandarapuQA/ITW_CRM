package ITW_BO_MyBrands_FilterFunctionality_Testcases;

import org.testng.annotations.Test;

import ITW_BO_MyBrands_Filter_DashBoard_PageObjects.ITW_MyBrands_CompanyNamePage;
import ITW_PageObjects.ITW_BO_MyBrandsPage;
import ITW_PageObjects.ITW_FilterBrandsPage;
import ITW_PageObjects.ITW_LoginPage;

public class TC_039_WM_Discard extends ITW_BaseClass {

	@Test(priority=29)
	public void WM_DiscardFunTest() throws InterruptedException {
		
		ITW_LoginPage lp=new ITW_LoginPage(driver);
		 
		 lp.clickLoginbtn();
		 Thread.sleep(2000);
		 lp.LoginActions();
		 
		 ITW_BO_MyBrandsPage MBP=new ITW_BO_MyBrandsPage(driver);
		 MBP.clickBrandsMenu();
		 Thread.sleep(2000);
		 MBP.clickFilterIcon();
		 Thread.sleep(2000);
		 
		 ITW_MyBrands_CompanyNamePage cnp=new ITW_MyBrands_CompanyNamePage(driver);
		 cnp.clickonCompanyNameOpt();
		 Thread.sleep(2000);
		 cnp.fetchCompanyNames();
		 Thread.sleep(2000);
		 cnp.clickCompDonebtn();
		
		ITW_FilterBrandsPage FBP=new ITW_FilterBrandsPage(driver);
		Thread.sleep(2000);
		FBP.clickMuilBtn();
		Thread.sleep(2000);
		FBP.clickDiscardBtn();
		
		log.info("**** TC_039_WM_Disacrd Testcase executed successfully ****");
		
	}
}

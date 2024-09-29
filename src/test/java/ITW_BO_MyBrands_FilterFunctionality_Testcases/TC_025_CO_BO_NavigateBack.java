package ITW_BO_MyBrands_FilterFunctionality_Testcases;

import org.testng.annotations.Test;

import ITW_BO_MyBrands_Filter_DashBoard_PageObjects.ITW_MyBrands_CoBrandOwnersPage;
import ITW_PageObjects.ITW_BO_MyBrandsPage;
import ITW_PageObjects.ITW_LoginPage;

public class TC_025_CO_BO_NavigateBack extends ITW_BaseClass {
    
	@Test(priority=19)
	public void CO_BO_Navigate_Back_Test() throws InterruptedException {
		
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
		 cbp.FetchCoBrandOwners();
		 Thread.sleep(2000);
		 cbp.coNavigateBackArr();
		 Thread.sleep(1000);
		 
		 log.info("**** TC_025_CO_BO_Navigate Back Testcase executed ****");
		 
	}
}

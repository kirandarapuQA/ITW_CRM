package ITW_BO_MyBrands_FilterFunctionality_Testcases;

import org.testng.annotations.Test;

import ITW_BO_MyBrands_Filter_DashBoard_PageObjects.ITW_MyBrands_CurrentInventoriesPage;
import ITW_PageObjects.ITW_BO_MyBrandsPage;
import ITW_PageObjects.ITW_LoginPage;

public class TC_027_CI_MultipleInventories extends ITW_BaseClass {

	@Test(priority=21)
	public void SelectMultipleInventoriesTest() throws InterruptedException {
		
		ITW_LoginPage lp=new ITW_LoginPage(driver);

		lp.clickLoginbtn();
		Thread.sleep(2000);
		lp.LoginActions();

		ITW_BO_MyBrandsPage MBP=new ITW_BO_MyBrandsPage(driver);
		MBP.clickBrandsMenu();
		Thread.sleep(2000);
		MBP.clickFilterIcon();
		Thread.sleep(1000);
		ITW_MyBrands_CurrentInventoriesPage cip=new ITW_MyBrands_CurrentInventoriesPage(driver);
		cip.clickCInventoriesOpt();
		Thread.sleep(1000);
		
		cip.SelectMultipleInvetories();
		Thread.sleep(1000);
		cip.clickDoneBtn();
		Thread.sleep(1000);
		cip.ClickApplyFiltersBtn();
		
		log.info("**** TC_027_Multiple Inventories Testcase Executed ****");
	}
}

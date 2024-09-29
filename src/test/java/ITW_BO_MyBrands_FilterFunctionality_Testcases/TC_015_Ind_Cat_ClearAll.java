package ITW_BO_MyBrands_FilterFunctionality_Testcases;

import org.testng.annotations.Test;

import ITW_BO_MyBrands_Filter_DashBoard_PageObjects.ITW_MyBrands_IndustriesandCategoriesPage;
import ITW_PageObjects.ITW_BO_MyBrandsPage;
import ITW_PageObjects.ITW_LoginPage;

public class TC_015_Ind_Cat_ClearAll extends ITW_BaseClass{
	
	@Test(priority=11)
	public void ResetTest() throws InterruptedException {
		
		ITW_LoginPage lp=new ITW_LoginPage(driver);

		lp.clickLoginbtn();
		Thread.sleep(2000);
		lp.LoginActions();

		ITW_BO_MyBrandsPage MBP=new ITW_BO_MyBrandsPage(driver);
		MBP.clickBrandsMenu();
		Thread.sleep(2000);
		MBP.clickFilterIcon();
		Thread.sleep(1000);

		ITW_MyBrands_IndustriesandCategoriesPage ICP=new ITW_MyBrands_IndustriesandCategoriesPage(driver);

		Thread.sleep(3000);
		ICP.clickIndustriesorCategoriesOpt();
		Thread.sleep(2000);
		ICP.SelectMulOpt();
		Thread.sleep(1000);
		ICP.clickDonebtn();
		Thread.sleep(2000);
		ICP.ClickClearAllBtn();
		
		log.info("****TC_015_Ind/Cat ClearAll btn Fun. Testcase Execution is Completed ****");
		
		
	}

}

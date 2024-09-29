package ITW_BO_MyBrands_FilterFunctionality_Testcases;

import org.testng.annotations.Test;

import ITW_BO_MyBrands_Filter_DashBoard_PageObjects.ITW_MyBrands_PCDPage;
import ITW_PageObjects.ITW_BO_MyBrandsPage;
import ITW_PageObjects.ITW_LoginPage;

public class TC_033_PCD_NO extends ITW_BaseClass{

	@Test(priority=26)
	public void PCD_NoOpt_Test() throws InterruptedException {
		
		ITW_LoginPage lp=new ITW_LoginPage(driver);

		lp.clickLoginbtn();
		Thread.sleep(2000);
		lp.LoginActions();

		ITW_BO_MyBrandsPage MBP=new ITW_BO_MyBrandsPage(driver);
		MBP.clickBrandsMenu();
		Thread.sleep(2000);
		MBP.clickFilterIcon();
		Thread.sleep(1000);
		
		ITW_MyBrands_PCDPage pcdp=new ITW_MyBrands_PCDPage(driver);
		
		pcdp.click_PCD_No_opt();
		Thread.sleep(1000);
		pcdp.clickApplyFiltersBtn();
		
		log.info("**** TC_032_PCD_NO_ Testcase Executed successfully ****");
	}
}

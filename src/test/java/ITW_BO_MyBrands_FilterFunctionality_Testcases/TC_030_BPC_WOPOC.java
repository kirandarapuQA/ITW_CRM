package ITW_BO_MyBrands_FilterFunctionality_Testcases;

import org.testng.annotations.Test;

import ITW_BO_MyBrands_Filter_DashBoard_PageObjects.ITW_MyBrands_BrandsPOCPage;
import ITW_PageObjects.ITW_BO_MyBrandsPage;
import ITW_PageObjects.ITW_LoginPage;

public class TC_030_BPC_WOPOC extends ITW_BaseClass{

	@Test(priority=24)
	public void BPC_WOPOC_Test() throws InterruptedException {
		
		ITW_LoginPage lp=new ITW_LoginPage(driver);

		lp.clickLoginbtn();
		Thread.sleep(2000);
		lp.LoginActions();

		ITW_BO_MyBrandsPage MBP=new ITW_BO_MyBrandsPage(driver);
		MBP.clickBrandsMenu();
		Thread.sleep(2000);
		MBP.clickFilterIcon();
		Thread.sleep(1000);
		
		ITW_MyBrands_BrandsPOCPage bpp=new ITW_MyBrands_BrandsPOCPage(driver);
		bpp.clickBrands_POC_WithoiutPOC();
		Thread.sleep(1000);
		bpp.clickApplyFiltersbtn();
		
		log.info("**** TC_030_BPC_WOPOC_Testcase Executed ****");
	}
}

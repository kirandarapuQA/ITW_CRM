package ITW_BO_MyBrands_FilterFunctionality_Testcases;

import org.testng.annotations.Test;

import ITW_BO_MyBrands_Filter_DashBoard_PageObjects.ITW_MyBrands_BrandsPOCPage;
import ITW_PageObjects.ITW_BO_MyBrandsPage;
import ITW_PageObjects.ITW_LoginPage;

public class TC_029_BPC_WPOC extends ITW_BaseClass{

	@Test(priority=23)
	public void BPC_WithPOC_Test() throws InterruptedException {
		
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
		
		bpp.clickBrands_POC_WithPOC();
		Thread.sleep(1000);
		bpp.clickApplyFiltersbtn();
		
		log.info("**** TC_029_BPC_WPOC_ Testcase executed ****");
		
	}
}

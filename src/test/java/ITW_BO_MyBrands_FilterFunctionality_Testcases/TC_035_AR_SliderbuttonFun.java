package ITW_BO_MyBrands_FilterFunctionality_Testcases;

import org.testng.annotations.Test;

import ITW_BO_MyBrands_Filter_DashBoard_PageObjects.ITW_MyBrands_AnnualRevenuePage;
import ITW_PageObjects.ITW_BO_MyBrandsPage;
import ITW_PageObjects.ITW_LoginPage;


public class TC_035_AR_SliderbuttonFun extends ITW_BaseClass{

	@Test(priority=28)
	public void AR_SliderFun_Test() throws InterruptedException {
		
		ITW_LoginPage lp=new ITW_LoginPage(driver);

		lp.clickLoginbtn();
		Thread.sleep(2000);
		lp.LoginActions();

		ITW_BO_MyBrandsPage MBP=new ITW_BO_MyBrandsPage(driver);
		MBP.clickBrandsMenu();
		Thread.sleep(2000);
		MBP.clickFilterIcon();
		Thread.sleep(1000);
		
		ITW_MyBrands_AnnualRevenuePage ARP=new ITW_MyBrands_AnnualRevenuePage(driver);
		ARP.MinSliderbarAct();
		Thread.sleep(1000);
		ARP.MaxSliderbarAct();
		
		log.info("**** TC_035_AR_SliderbarAct_Testcase  Executed Successfully ****");
	}
}

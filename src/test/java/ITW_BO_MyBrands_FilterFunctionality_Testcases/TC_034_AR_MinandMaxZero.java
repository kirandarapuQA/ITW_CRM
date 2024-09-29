package ITW_BO_MyBrands_FilterFunctionality_Testcases;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

import ITW_BO_MyBrands_Filter_DashBoard_PageObjects.ITW_MyBrands_AnnualRevenuePage;
import ITW_PageObjects.ITW_BO_MyBrandsPage;

import ITW_PageObjects.ITW_LoginPage;

public class TC_034_AR_MinandMaxZero extends ITW_BaseClass{
	
	@Test(priority=27)
	public void AR_Min_Max_Zero_Test() throws InterruptedException {
		
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
		
		ARP.ScrollingActivity();
		ARP.EnterMaxValue();
		ARP.clickApplyFiltersBtn();
		
		driver.findElement(By.xpath("//button[normalize-space()='Faasos']")).click();
		
		String Exp_AR="0";
		
		String Act_AR=driver.findElement(By.xpath("//span[contains(text(),'₹ 11,950 Cr')]")).getText();
		
		if(Act_AR.equals(Exp_AR)) {
			
			log.info("AR_MIN & MAX IS ZERO _Testcase is passed....");
		}
	
		log.info("**** TC_034_AR_Min & Max is zero Testcase executed Successfully ****");
		
	}

}

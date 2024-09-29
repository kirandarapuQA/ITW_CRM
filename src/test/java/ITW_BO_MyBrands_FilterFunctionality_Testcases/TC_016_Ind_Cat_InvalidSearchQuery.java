package ITW_BO_MyBrands_FilterFunctionality_Testcases;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ITW_BO_MyBrands_Filter_DashBoard_PageObjects.ITW_MyBrands_IndustriesandCategoriesPage;
import ITW_PageObjects.ITW_BO_MyBrandsPage;
import ITW_PageObjects.ITW_LoginPage;



public class TC_016_Ind_Cat_InvalidSearchQuery extends ITW_BaseClass{

	@Test(priority=12)
	public void InvalidSearchTest() throws InterruptedException, AWTException {

		ITW_LoginPage lp=new ITW_LoginPage(driver);

		lp.clickLoginbtn();
		log.info("ITW btn Clicking activity is completed");
		Thread.sleep(2000);
		lp.LoginActions();
		log.info("Login Activity is completed");

		ITW_BO_MyBrandsPage MBP=new ITW_BO_MyBrandsPage(driver);
		MBP.clickBrandsMenu();
		log.info("Brands opt clicking activity is completed");
		Thread.sleep(2000);
		MBP.clickFilterIcon();
		log.info("Filter Icon clicking activity is completed");
		Thread.sleep(1000);

		ITW_MyBrands_IndustriesandCategoriesPage ICP=new ITW_MyBrands_IndustriesandCategoriesPage(driver);

		Thread.sleep(3000);
		ICP.clickIndustriesorCategoriesOpt();
		log.info("Industries/Categories Opt.clicking activity is completed...");
		Thread.sleep(2000);
		ICP.InavlidSearchQuery();

		if(driver.findElement(By.xpath("//h1[text()='No Results Found']")).isEnabled()) {

			log.info("Ind/Cat_Search Functionality working as per requirement..");
		}
		log.info("TC_016_Invalid Search Query Test Executed.....");

	}
}

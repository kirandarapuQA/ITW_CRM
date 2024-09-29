package ITW_BO_MyBrands_FilterFunctionality_Testcases;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import ITW_BO_MyBrands_Filter_DashBoard_PageObjects.ITW_MyBrands_CoBrandOwnersPage;
import ITW_BO_MyBrands_Filter_DashBoard_PageObjects.ITW_MyBrands_CompanyNamePage;
import ITW_BO_MyBrands_Filter_DashBoard_PageObjects.ITW_MyBrands_IndustriesandCategoriesPage;
import ITW_BO_MyBrands_Filter_DashBoard_PageObjects.ITW_MyBrands_RegionsAndCities;
import ITW_PageObjects.ITW_BO_MyBrandsPage;
import ITW_PageObjects.ITW_FilterBrandsPage;
import ITW_PageObjects.ITW_LoginPage;

public class TC_041_InavalidorEmptySearchFunctionality extends ITW_BaseClass{

	@Test(priority=31)
	public void SearchFunctionalityTest() throws InterruptedException, AWTException {
		
		ITW_LoginPage lp=new ITW_LoginPage(driver);
		 
		 lp.clickLoginbtn();
		 Thread.sleep(2000);
		 lp.LoginActions();
		 ITW_BO_MyBrandsPage MBP=new ITW_BO_MyBrandsPage(driver);
		 MBP.clickBrandsMenu();
		 Thread.sleep(2000);
		 MBP.clickFilterIcon();
		 Thread.sleep(1000);
		 ITW_FilterBrandsPage FBP=new ITW_FilterBrandsPage(driver);
		 FBP.clickRegionsandCitiesOpt();
		 Thread.sleep(2000);
		 ITW_MyBrands_RegionsAndCities Reg_Cities=new ITW_MyBrands_RegionsAndCities(driver);
		 Reg_Cities.ClickSouthernAsiaReg_Arrow();
		 Thread.sleep(2000);
		 
		 Reg_Cities.InvalidSearchFunctionality();
		 Thread.sleep(4000);
		 if(driver.findElement(By.xpath("//h1[text()='No Results Found']")).isEnabled()) {
			 log.info("Reg_Cities_Search Functionality working as per req.");
		 }
		 
		 
		 
		 Reg_Cities.ClickNavigateBack();
		 Thread.sleep(2000);
		 Reg_Cities.ClickNavigateBack();
		 Thread.sleep(2000);
		 ITW_MyBrands_CompanyNamePage CNP=new ITW_MyBrands_CompanyNamePage(driver);
		
		 CNP.clickonCompanyNameOpt();
		 Thread.sleep(2000);
		 CNP.InvalidCompanySearch();
		 Thread.sleep(2000);
		 if(driver.findElement(By.xpath("//h1[text()='No Results Found']")).isEnabled()) {
			 log.info("CompanyNames_Search Functionality working as per req.");
		 }
		 
		 CNP.CompNavigateBackArr();
		 Thread.sleep(4000);
		 ITW_MyBrands_CoBrandOwnersPage CBOP=new ITW_MyBrands_CoBrandOwnersPage(driver);
		 
		 CBOP.clickCoBrandOwnersOpt();
		 Thread.sleep(2000);
		 CBOP.Invalid_CO_BO_Search();
		 Thread.sleep(2000);
		 
		 if(driver.findElement(By.xpath("//h1[text()='No Results Found']")).isEnabled()) {
			 log.info("Co_BO_Search Functionality working as per req.");
		 }
		 CBOP.coNavigateBackArr();
		 
		 
			
		 
	}
}

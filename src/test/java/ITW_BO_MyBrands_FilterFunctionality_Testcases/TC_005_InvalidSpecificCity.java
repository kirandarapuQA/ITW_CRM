package ITW_BO_MyBrands_FilterFunctionality_Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import ITW_BO_MyBrands_Filter_DashBoard_PageObjects.ITW_MyBrands_RegionsAndCities;
import ITW_PageObjects.ITW_BO_MyBrandsPage;
import ITW_PageObjects.ITW_FilterBrandsPage;
import ITW_PageObjects.ITW_LoginPage;

public class TC_005_InvalidSpecificCity extends ITW_BaseClass {
	
	@Test(priority=3)
	public void InvalidSpecificCityTest() throws InterruptedException {
		
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
		 Reg_Cities.ClickSouthernEuropeReg_Arrow();
		 Thread.sleep(2000);
		 Reg_Cities.SelectSpecificCity();
		 Thread.sleep(1000);
		 Reg_Cities.ClickDoneBtn();
		 Thread.sleep(1000);
		 Reg_Cities.ClickDoneBtn();
		 Thread.sleep(1000);
		 Reg_Cities.ClickApplyFiltersBtn();
		 Thread.sleep(3000);
		 
		 WebElement Result=driver.findElement(By.xpath("//h1[text()='No Brands Found']"));
		 
		 if(Result.isDisplayed()) {
			 
			 log.info("Invalid Specific City testcase is passed");
		 }else
		 {
			 log.info("Invalid Specific City testcase is failed"); 
		 }
		 
		 log.info("****TC_005_Invalid Specific City Testcase Execution is Completed ****");
		 
		 
		
	}

}

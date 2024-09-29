package ITW_BO_MyBrands_FilterFunctionality_Testcases;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import ITW_BO_MyBrands_Filter_DashBoard_PageObjects.ITW_MyBrands_RegionsAndCities;
import ITW_PageObjects.ITW_BO_MyBrandsPage;
import ITW_PageObjects.ITW_FilterBrandsPage;
import ITW_PageObjects.ITW_LoginPage;

public class TC_008_Reg_Cities_Search extends ITW_BaseClass {

	@Test(priority=6)
	public void SearchTest() throws InterruptedException, AWTException {
		
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
		 
		 Reg_Cities.SearchFunctionality();
		 
		 List<WebElement>all=driver.findElements(By.xpath("//span[@class='text-white text-[14px]']"));
		 
		 int size=all.size();
		 if(size==1) {
			 System.out.println("Testcase is Passed....");
		 }else {
			 Assert.assertTrue(false);
			 log.info("testcase is failed...");
		 }
//		 Reg_Cities.ClickDoneBtn();
//		 Reg_Cities.ClickDoneBtn();
//		 Thread.sleep(2000);
//		 Reg_Cities.ClickApplyFiltersBtn();
		 
		 log.info("****TC_008_Reg._Cities Search Fun. Testcase Execution is Completed ****");
		
	}
}

package ITW_BO_MyBrands_FilterFunctionality_Testcases;


import org.testng.annotations.Test;

import ITW_PageObjects.ITW_LoginPage;

public class TC_001_LoginTest extends ITW_BaseClass {

	public ITW_LoginPage lp;

	@Test
	public void LoginTest() throws InterruptedException {

		lp=new ITW_LoginPage(driver);
		lp.clickLoginbtn();
		Thread.sleep(5000);
		
		
		
		lp.LoginActions();


	}

}

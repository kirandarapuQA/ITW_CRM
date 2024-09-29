package ITW_BO_MyBrands_Filter_DashBoard_PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ITW_PageObjects.ITW_Base;


public class ITW_MyBrands_RegionsAndCities extends ITW_Base{

	
	public ITW_MyBrands_RegionsAndCities(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath="//span[text()='Regions & Cities']")
	WebElement RegionsandCitiesOpt;

	//OTHER REGIONS OPTION
	@FindBy(xpath="//span[text()='Other Regions']")
	WebElement cbox_otherregions;
	//All regions
	@FindBy(xpath="//span[@class=' text-white text-[14px]']")
	List<WebElement> regions_Options;
	//All arrows
	@FindBy(xpath="//img[@class='mr-3  ']")
	List<WebElement> regions_arrow;
	//All cities for Southern Asia region
	@FindBy(xpath="//span[@class='text-white text-[14px]']")
	WebElement SouthernAsia_Cities;
	
	@FindBy(xpath="//*[@id=\"scrollableDiv\"]/div[2]/div[2]/div[5]/div[2]/img")
	WebElement SouthernAsia_Arrow;
	
	@FindBy(xpath="//span[text()='Southern Europe']")
	WebElement SouthernEuropeReg_Opt;
	
	@FindBy(xpath="//*[@id=\"scrollableDiv\"]/div[2]/div[2]/div[6]/div[2]/img")
	WebElement SouthernEuropeReg_Arr;
	
	@FindBy(xpath="//span[text()='Albenga']")
	WebElement CityAlbengaOpt;
	
	@FindBy(xpath="//div[@class='flex flex-1 items-center']//*[name()='svg']")
	WebElement navigatebackarrow;
	
	@FindBy(xpath="//button[text()='DONE']")
	WebElement btnDone;
	
	@FindBy(xpath="//button[text()='CLEAR']")
	WebElement btnClear;
	
	@FindBy(xpath="//button[text()='APPLY FILTERS']")
	WebElement btnApplyFiltersBtn;
	
	@FindBy(xpath="//button[text()='CLEAR ALL']")
	WebElement btnClearAllBtn;
	
	@FindBy(xpath="//span[@class='text-white text-[14px]']")
	WebElement SA_SearchCity;
	
	////span[@class='text-white text-[14px]']
	
	@FindBy(xpath="//input[@id='default-search']")
	WebElement Reg_SearchBar;

    //Click on the Regions and Cities Option
	public void SelectRegionsandCitiesOpt() {

		RegionsandCitiesOpt.click();
	}

	//Click on the Other Regions Option
	public void clickOtherRegionsOption() {

		cbox_otherregions.click();
	}

	//Get All the Options from the Regions and Cities options
	public void getMultipleRegions() {


		List<WebElement>Regions=driver.findElements(By.xpath("//span[@class=' text-white text-[14px]']"));
		int size=Regions.size();
		for(int i=0;i<=size-1;i++) {

			String RValues=Regions.get(i).getText();
			if(RValues.equals("Other Regions11")) {
				Regions.get(i).click();
			}
			/*else if(RValues.equals("Eastern Asia")) {
				Regions.get(i).click();
			}
			else if(RValues.equals("Northern Africa")) {
				Regions.get(i).click();
			}
			else if(RValues.equals("Northern America")) {
				Regions.get(i).click();
			}
			else if(RValues.equals("Northern Europe")) {
				Regions.get(i).click();
			}
			else if(RValues.equals("Southern Asia")) {
				Regions.get(i).click();
			}*/
			else if(RValues.equals("Southern Asia")) {
				Regions.get(i).click();
			}
			/*else if(RValues.equals("Southern Europe")) {
				Regions.get(i).click();
			}
			else if(RValues.equals("Western Asia")) {
				Regions.get(i).click();
			}
			else if(RValues.equals("Western Europe")) {
				Regions.get(i).click();
			}*/
		}
	}

	//Get all the Cities from the Southern Asia Cities
	public void getSouthernAsiaCities() {

       List<WebElement>CityValues=driver.findElements(By.xpath("//span[@class='text-white text-[14px]']"));
	   int size=CityValues.size();
	   
	   for(int i=0;i<=size-1;i++) {
	   String CValues=CityValues.get(i).getText();
	   
	   if(CValues.equals("Mumbai")) {
		   
		   CityValues.get(i).click();
	   }
	}



	}
	
	public void clickSouthernEuropeopt() {
		
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", SouthernEuropeReg_Opt);
		
	}
	
	public void ClickSouthernAsiaReg() {
		SouthernAsia_Arrow.click();
	}
	
	public void ClickSouthernEuropeReg_Arrow() {
		
		SouthernEuropeReg_Arr.click();
	}
	
	public void ClickSouthernAsiaReg_Arrow() {
		
		SouthernAsia_Arrow.click();
	}
	
	public void SelectSpecificCity() {
		
		CityAlbengaOpt.click();
	}
	
	public void ClickDoneBtn() {
		
		btnDone.click();
	}
	
	public void ClickClearBtn() {
		
		btnClear.click();
	}
	
	
	public void ClickNavigateBack() {
		
		try {
			navigatebackarrow.click();
		}catch(Exception e) {
			
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", navigatebackarrow);
		}
		
	}
	
	public void ClickApplyFiltersBtn() {
		
		btnApplyFiltersBtn.click();
	}
	
	public void ClickClearAllBtn() {
		
		btnClearAllBtn.click();
	}
	
	public void SelectOtherRegionsOpt() {
		
		cbox_otherregions.click();
	}
	
	public void SearchFunctionality() throws AWTException, InterruptedException {
		
		Reg_SearchBar.sendKeys("Delhi");		
	   
	}
	
	public void InvalidSearchFunctionality() {
		
		Reg_SearchBar.sendKeys("London");
		
	}


}

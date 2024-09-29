package ITW_PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ITW_BO_MyBrandsPage extends ITW_Base {

	public ITW_BO_MyBrandsPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//button[@id='side__nav__Brands']")
	WebElement BrandsMenu;
	
	@FindBy(xpath="//span[text()='Brands']")
	WebElement BrandOpt;
	
	@FindBy(xpath="//button[@aria-label='Filter Brands']")
	WebElement FilterIcon;
	
	public void clickBrandsMenu() {
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", BrandsMenu);
				
	}
	
	public void clickFilterIcon() {
		
		FilterIcon.click();
	}
	
	public void ClickOnTheBrandOpt() throws InterruptedException {
		
		Actions ac=new Actions(driver);
		
		ac.moveToElement(BrandsMenu).perform();
		Thread.sleep(1000);
		BrandOpt.click();
	}

}

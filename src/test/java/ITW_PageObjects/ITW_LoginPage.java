package ITW_PageObjects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ITW_LoginPage extends ITW_Base {

	public ITW_LoginPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath="//span[text()=' ENTER ITW UNIVERSE']")
	WebElement btn_ITW;

	@FindBy(id="identifierId")
	WebElement txtEmail;

	@FindBy(xpath="//span[text()='Next']")
	WebElement btnNext;

	@FindBy(xpath="//input[@name='Passwd']")
	WebElement txtPassword;

	@FindBy(xpath="(//div[@class='VfPpkd-RLmnJb'])[2]")
	WebElement btnContinue;



	public void clickLoginbtn() throws InterruptedException {
		Thread.sleep(3000);
		btn_ITW.click();
		


	}

	public void LoginActions() throws InterruptedException {

		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		txtEmail.sendKeys("kiran@thealteroffice.com");
		Thread.sleep(2000);
		btnNext.click();
		Thread.sleep(2000);
		txtPassword.sendKeys("Amma@2747");
		Thread.sleep(2000);
		btnNext.click();
		Thread.sleep(2000);
		Thread.sleep(3000);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", btnContinue);
		//btnContinue.click();
		Thread.sleep(2000);
		driver.switchTo().window(parentid);
		
		
	}




}

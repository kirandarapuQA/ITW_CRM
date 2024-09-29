package ITW_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ITW_Base {
	
	public static WebDriver driver;
	public ITW_Base(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}

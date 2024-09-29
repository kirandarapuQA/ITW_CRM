package ITW_BO_MyBrands_FilterFunctionality_Testcases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class ITW_BaseClass {
	
	public static WebDriver driver;
	public static Logger log;
	
	@BeforeClass
	@Parameters({"browser","URL"})
	public void openApplication(String br,String url) {
		
		log=Logger.getLogger(this.getClass());
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(br.equals("edge")) {
			driver=new EdgeDriver();
		}
		else if(br.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	/*@AfterClass
	public void closeApp() {
		driver.close();
	}*/
	
	public String captureScreen(String tname) {
		String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		String destination="./Screenshots/"+tname+"_"+timestamp+".png";
		try {
			FileUtils.copyFile(source, new File(destination));
		}catch(Exception e) {
			e.getMessage();
		}
		return destination;
	}
	

}

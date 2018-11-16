package Assessment_Testing;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.markuputils.ExtentColor;
//import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extendreport{
WebDriver driver;
public static ExtentReports extent;
public static ExtentTest logger;	
@BeforeSuite(alwaysRun = true)
public void setUp()
{
    extent = new ExtentReports(System.getProperty("user.dir") +"/test-output/STMExtentReport.html",true);
    extent
	 .addSystemInfo("Host Name", "SoftwareTesting")
	                .addSystemInfo("Environment", "Automation Testing")
	                .addSystemInfo("User Name", "Suresh Tester");
	             extent.loadConfig(new File(System.getProperty("user.dir")+"\\src\\testng.xml"));
}
@AfterSuite
public void tearDown(){
    extent.flush();
    extent.close();
   } 

public static String getScreenhot(WebDriver driver, String screenshotName) throws Exception {
	 String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	 TakesScreenshot ts = (TakesScreenshot) driver;
	 File source = ts.getScreenshotAs(OutputType.FILE);
	                //after execution, you could see a folder "FailedTestsScreenshots" under src folder
	 String destination = System.getProperty("user.dir") + "/screenshot/"+screenshotName+dateName+".png";
	 File finalDestination = new File(destination);
	 FileUtils.copyFile(source, finalDestination);
	 return destination;
	 }
}
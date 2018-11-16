package Assessment_Testing;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.ITestResult;
import java.lang.Thread;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class Singleuser_Exam extends extendreport {
private WebDriver driver;;
String[] username = {"HC271493"};
String password="123456";
//public String Invigilator="CAfN6dKm";
@BeforeClass
public void init()
{
	System.setProperty("webdriver.gecko.driver", "D:\\suresh QA\\automationwork\\geckodriver\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
	//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		//driver.get("https://assess.hiremee.co.in/");
		//driver.get("http://52.76.103.21:8091/");
		//driver.get("http://dev1assess.hiremee.co.in/");
	
}
	@Test(priority=1)
	public void login()throws Exception
	{		logger = extent.startTest("pass Test");
			Assert.assertTrue(true);
			driver.get("http://172.18.1.2:8095");
			driver.findElement(By.id("txtUserName")).sendKeys(username);
			driver.findElement(By.id("passwordfield")).sendKeys(password);
			driver.findElement(By.id("btnLogin")).click();
			//insrtuction
			driver.findElement(By.id("chkAcknowledgement")).click();
			driver.findElement(By.id("btnProceed")).click();
			 logger.log(LogStatus.PASS, "Test Case login Passed");
	}
	@Test(priority=2)
	public void verbal_exam() throws Exception
	
	{
		
		//verbal
		logger = extent.startTest("pass Test");
		Assert.assertTrue(true);
		   driver.findElement(By.xpath("//h3[@id='ui-id-1']/span")).click();
		   driver.findElement(By.id("btnStartExam")).click();
		   Thread.sleep(1000);
		   for(int i=1;i<=10;i++)
		   	{
			   WebElement ele =  driver.findElement(By.id("trrdoMCA"));
			   WebElement ele1 =  driver.findElement(By.id("trrdoMCB"));
			   WebElement ele2=  driver.findElement(By.id("trrdoMCC"));
			   if (ele.isDisplayed())
			   {
				   ele.click();  
				   driver.findElement(By.id("lnkNext")).click();
			   
			   }
			   else if (ele1.isDisplayed()) {
				   ele1.click();
				   driver.findElement(By.id("lnkNext")).click();
	      
			   }
			   else if (ele2.isDisplayed()) {
				   ele2.click();
				   driver.findElement(By.id("lnkNext")).click();
	     
			   }
			   else
			   {
				   driver.findElement(By.id("adoD")).click();
				   driver.findElement(By.id("lnkNext")).click();
	  	  
			   }
		   	}	
	  
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		   logger.log(LogStatus.PASS, "Test Case verbal Passed");
			}
	  

  
	@Test(priority=3)
	public void quantitative_exam() throws InterruptedException
	
	{
  
  //quantitative
		logger = extent.startTest("pass Test");
		Assert.assertTrue(true);
	driver.findElement(By.xpath("//h3[@id='ui-id-3']/span")).click();
	driver.findElement(By.xpath("(//input[@id='btnStartExam'])[2]")).click();
	Thread.sleep(1000);
  for(int i=1;i<=10;i++)
  	
  { 
	  Thread.sleep(5000);
  	driver.findElement(By.id("trrdoMCC"));
      driver.findElement(By.id("lnkNext")).click();
  }
      driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
      logger.log(LogStatus.PASS, "Test Case quantitative Passed");
   
	}
	
	@Test(priority=4)
	public void logical_exam() throws InterruptedException
	
	{
		//logical
		logger = extent.startTest("pass Test");
		Assert.assertTrue(true);
		driver.findElement(By.xpath("//h3[@id='ui-id-5']/div/table/tbody/tr/td[2]")).click();
		driver.findElement(By.xpath("(//input[@id='btnStartExam'])[3]")).click();
		Thread.sleep(1000);
		for(int i=1;i<=10;i++)
		{
			driver.findElement(By.id("trrdoMCA")).click();
			driver.findElement(By.id("lnkNext")).click();
 
	    }
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		 logger.log(LogStatus.PASS, "Test Case logical Passed");

	}
	@Test(priority=5)
	public void behaviour_exam() throws InterruptedException
	
	{
 
		//behaviour
		logger = extent.startTest("pass Test");
		Assert.assertTrue(true);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/h3[4]/span")).click();
		//driver.findElement(By.xpath("//h3[@id='ui-id-8']/div/table/tbody/tr/td[2]/label")).click();
		driver.findElement(By.xpath("(//input[@id='btnStartExam'])[4]")).click();
		
		for(int i=1;i<=25;i++)
		{	
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"spnMCA\"]")).click();
		driver.findElement(By.id("spnMCA")).click();
		driver.findElement(By.id("spnMC1_FC")).click();
		driver.findElement(By.id("lnkNext")).click(); 
	    }
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		 logger.log(LogStatus.PASS, "Test Case behaviour Passed");
 
	}
	
	@Test(priority=6)
	public void Tech_fundamental_exam() throws InterruptedException
	
	{
 
		//fundamental
		logger = extent.startTest("pass Test");
		Assert.assertTrue(true);
		driver.findElement(By.xpath("//h3[@id='ui-id-9']/div/table/tbody/tr/td[2]")).click();
		//driver.findElement(By.xpath("//h3[@id='ui-id-11']/div/table/tbody/tr/td[2]")).click();
		//driver.findElement(By.xpath("//*[@id=\"btnStartExam\"")).click(); 
		driver.findElement(By.xpath("(//input[@id='btnStartExam'])[5]")).click();
		Thread.sleep(1000);
		for(int i=1;i<=20;i++)
		{
  	
			driver.findElement(By.id("trrdoMCA")).click();
			driver.findElement(By.id("lnkNext")).click();
     
	}
  Thread.sleep(1000);
 driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
  Thread.sleep(1000);
  driver.findElement(By.xpath("//*[@id=\"btnProceed\"]")).click();
  driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
  logger.log(LogStatus.PASS, "Test Case Technical Fundamental Passed");
	}
	
	@Test(priority=7)
	public void Feedback_Form() throws InterruptedException
	
	{
 
 
  //feedback
		logger = extent.startTest("pass Test");
		Assert.assertTrue(true);
  Thread.sleep(1000);
  driver.findElement(By.id("rblIdQ12")).click();
  driver.findElement(By.id("rblIdQ22")).click();
  driver.findElement(By.id("rblIdQ32")).click();
  Thread.sleep(1000);
  driver.findElement(By.id("btnProceed")).click();

  driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/div[4]/button")).click();
  driver.findElement(By.id("btnProceed")).click();
 
  logger.log(LogStatus.PASS, "Test Case Feedback Passed");
  driver.close();
		}
	@AfterMethod
	 public void getResult(ITestResult result) throws Exception{
	if(result.getStatus() == ITestResult.FAILURE){
	logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
	logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
	//To capture screenshot path and store the path of the screenshot in the string "screenshotPath"
	                   //We do pass the path captured by this mehtod in to the extent reports using "logger.addScreenCapture" method. 

	String screenshotPath = extendreport.getScreenhot(driver, result.getName());
	//To add it in the extent report 
	logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
	}else if(result.getStatus() == ITestResult.SKIP){
	logger.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
	}
	//ending test
	//endTest(logger) : It ends the current test and prepares to create HTML report
	extent.endTest(logger);
	}		
}



























 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 //assessment modified date 09/05/2018

/*
//import static org.testng.AssertJUnit.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

import org.testng.Assert;
//import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.SkipException;

import java.lang.Thread;
//import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.Alert;
//import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
@Test
public class exam {
private WebDriver driver;
	ExtentReports extent;
	ExtentTest logger;	
	@BeforeClass
	public void report() throws InterruptedException 
	{			
		extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/STMExtentReport.html", true);
		 extent
		                .addSystemInfo("Host Name", "SoftwareTestingMaterial")
		                .addSystemInfo("Environment", "Automation Testing")
		                .addSystemInfo("User Name", "Rajkumar SM");
		                extent.loadConfig(new File(System.getProperty("user.dir")+"\\testng.xml"));
		 }
	@BeforeTest(alwaysRun=true)
	public void mvc() throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\\\griddriver\\\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	
	@Test(priority=1)
	public void username()throws Exception
	{   logger = extent.startTest("pass Test");
	    Assert.assertTrue(true);
		driver.get("http://52.76.103.21:8091");
	    //driver.get("http://172.18.1.2:8095");
		//driver.get("https://assess.hiremee.co.in");
		//driver.get("http://devmvcassess.hiremee.co.in");
		driver.findElement(By.id("txtUserName")).sendKeys("HC001294");
	    driver.findElement(By.id("btnLogin")).click();
	    takeSnapShot(driver, "D://screenshot//test1.png") ; 
	    logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	    driver.navigate().refresh();
	}
	@Test(priority=2)
	public void password()throws Exception
	{ 
		logger = extent.startTest("pass Test");
		driver.findElement(By.id("passwordfield")).sendKeys("Test@123");
		driver.findElement(By.id("btnLogin")).click();
		takeSnapShot(driver, "D://screenshot//test2.png") ; 
		Assert.assertTrue(true);
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
		driver.navigate().refresh();
	}
	@Test(priority=3)
	public void userpass()throws Exception
	{ 
		logger = extent.startTest("pass Test");
		driver.findElement(By.id("txtUserName")).sendKeys("HC000831");
		driver.findElement(By.id("passwordfield")).sendKeys("Test@@@@123");
		driver.findElement(By.id("btnLogin")).click();
		this.takeSnapShot(driver, "D://screenshot//test3.png"); 
		Assert.assertTrue(true);
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");
		driver.navigate().refresh();
	}
	@Test(priority=4)
	public void login()throws Exception
	{
		try
		{
			logger = extent.startTest("pass Test");
			Assert.assertTrue(true);
			driver.findElement(By.id("txtUserName")).sendKeys("HC188159");
			
			driver.findElement(By.id("passwordfield")).sendKeys("123456");
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String Captcha;   
          System.out.println("Please Enter the captcha :: ");
          Captcha= br.readLine();  
		    driver.findElement(By.id("Captcha")).sendKeys(Captcha);
			driver.findElement(By.id("Captcha")).click();
			
			driver.findElement(By.id("btnLogin")).click();
			//driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[4]/button")).click();
			this.takeSnapShot(driver, "D://screenshot//test4.png"); 
			Thread.sleep(1000);
			logger.log(LogStatus.PASS, "Test Case Passed is passTest");	
			//instruction();
		}
		catch(Exception e)
			{	
				invigilatorlogin();
			}
		}
	   @Test(priority=5)
	   public void instruction()throws Exception
	      {
	   	   logger = extent.startTest("pass Test");  
	   	   Thread.sleep(1000);
	       driver.findElement(By.id("chkAcknowledgement")).click();
	       driver.findElement(By.id("btnProceed")).click();
	       this.takeSnapShot(driver, "D://screenshot//test5.png") ; 
	       Assert.assertTrue(true);
	       logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	      }
	   @Test(priority=6)
	   public void invigilatorlogin()throws Exception
	   	{
		try 
		{
		logger = extent.startTest("pass Test");
	    
	    Thread.sleep(10000);
	   // driver.switchTo().alert().accept();
	   // driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[4]/button")).click();
	    driver.findElement(By.id("UserName")).sendKeys("HC188134");
	    driver.findElement(By.id("passwordfield")).sendKeys("123456");
	    driver.findElement(By.id("invigilatorpasswordfield")).sendKeys("oH1Wx9BP");
	    driver.findElement(By.id("btnInvigilatorLogin")).click();
	    this.takeSnapShot(driver, "D://screenshot//test6.png") ; 
	    Assert.assertTrue(true);
	    logger.log(LogStatus.SKIP, "Test Case Passed is passTest");
	    Thread.sleep(1000);
		}
		catch(SkipException e)
			{
				throw new SkipException("Skipping - This is not ready for testing ");
			}
	  
	   	}
	
	   @Test(priority=7)

 public void verbal()throws Exception
		{
	   logger = extent.startTest("pass Test");
	   Assert.assertTrue(true);
	   driver.findElement(By.xpath("//h3[@id='ui-id-1']/span")).click();
	   driver.findElement(By.id("btnStartExam")).click();
	   Thread.sleep(1000);
	   for(int i=1;i<=10;i++)
	   	{
		   WebElement ele =  driver.findElement(By.id("trrdoMCA"));
		   WebElement ele1 =  driver.findElement(By.id("trrdoMCB"));
		   WebElement ele2=  driver.findElement(By.id("trrdoMCC"));
		   if (ele.isDisplayed())
		   {
			   ele.click();  
			   driver.findElement(By.id("lnkNext")).click();
		   this.takeSnapShot(driver, "D://screenshot//test7.png") ;
		   }
  else if (ele1.isDisplayed()) {
      ele1.click();
      driver.findElement(By.id("lnkNext")).click();
      this.takeSnapShot(driver, "D://screenshot//test8.png") ; 
  }
  else if (ele2.isDisplayed()) {
      ele2.click();
      driver.findElement(By.id("lnkNext")).click();
      this.takeSnapShot(driver, "D://screenshot//test9.png") ; 
  }
  else
  {
  	 driver.findElement(By.id("adoD")).click();
  	    driver.findElement(By.id("lnkNext")).click();
  	  this.takeSnapShot(driver, "D://screenshot//test10.png") ; 
  }
  }	
  
  Thread.sleep(1000);
  driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
  this.takeSnapShot(driver, "D://screenshot//test11.png") ; 
  logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	}
	   
 @Test(priority=8)
public void quantitative()throws Exception
	{ logger = extent.startTest("pass Test");
	    Assert.assertTrue(true);
	driver.findElement(By.xpath("//h3[@id='ui-id-3']/span")).click();
	driver.findElement(By.xpath("(//input[@id='btnStartExam'])[2]")).click();
	Thread.sleep(1000);
  for(int i=1;i<=10;i++)
  	
  { 
  	driver.findElement(By.id("trrdoMCC"));
      driver.findElement(By.id("lnkNext")).click();
  }
      driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
   this.takeSnapShot(driver, "D://screenshot//test12.png") ;
      logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	}
 @Test(priority=9)
public void logical()throws Exception
	{ logger = extent.startTest("pass Test");
  Assert.assertTrue(true);
  driver.findElement(By.xpath("//h3[@id='ui-id-5']/div/table/tbody/tr/td[2]")).click();
  driver.findElement(By.xpath("(//input[@id='btnStartExam'])[3]")).click();
  Thread.sleep(1000);
  for(int i=1;i<=10;i++)
  {
   driver.findElement(By.id("trrdoMCA")).click();
   driver.findElement(By.id("lnkNext")).click();
 
	    }
  Thread.sleep(1000);
  driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
this.takeSnapShot(driver, "D://screenshot//test13.png") ;
  logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	}
 
 @Test(priority=10)
public void behaviour()throws Exception
	{
	 logger = extent.startTest("pass Test");
  Assert.assertTrue(true);
  Thread.sleep(1000);
  driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/h3[4]/span")).click();
  //driver.findElement(By.xpath("//h3[@id='ui-id-8']/div/table/tbody/tr/td[2]/label")).click();
  driver.findElement(By.xpath("(//input[@id='btnStartExam'])[4]")).click();
  
  for(int i=1;i<=25;i++)
  {	 Thread.sleep(1000);
  	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
  	//driver.findElement(By.xpath("//*[@id=\"spnMCA\"]")).click();
  	driver.findElement(By.id("spnMCA")).click();
      driver.findElement(By.id("spnMC1_FC")).click();
      driver.findElement(By.id("lnkNext")).click(); 
	    }
  Thread.sleep(1000);
  driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
 this.takeSnapShot(driver, "D://screenshot//test14.png") ;
  logger.log(LogStatus.PASS, "Test Case Passed is passTest");
  Thread.sleep(1000);
	}
 /*
 @Test(priority=11)
public void techcore()throws Exception
	{logger = extent.startTest("pass Test");
  Assert.assertTrue(true);
  driver.findElement(By.xpath("//h3[@id='ui-id-9']/div")).click();
  driver.findElement(By.xpath("(//input[@id='btnStartExam'])[5]")).click();
  WebElement ele =  driver.findElement(By.id("trrdoMCA"));
	WebElement ele1 =  driver.findElement(By.id("trrdoMCB"));
	WebElement ele2=  driver.findElement(By.id("trrdoMCC"));  
  for(int i=1;i<=30;i++)
  {   Thread.sleep(1000);
    
    
    if (ele.isDisplayed()) {
        ele.click();  
        driver.findElement(By.id("lnkNext")).click();
this.takeSnapShot(driver, "D://screenshot//test14.png") ; 
    }
    else if (ele1.isDisplayed()) {
        ele1.click();
        driver.findElement(By.id("lnkNext")).click();
this.takeSnapShot(driver, "D://screenshot//test15.png") ; 
    }
    else if (ele2.isDisplayed()) {
        ele2.click();
        driver.findElement(By.id("lnkNext")).click();
        this.takeSnapShot(driver, "D://screenshot//test16.png") ; 
    }
    else
    {
    	 driver.findElement(By.id("adoD")).click();
    	    driver.findElement(By.id("lnkNext")).click();
    	    this.takeSnapShot(driver, "D://screenshot//test17.png") ; 
   
    }
 }
  Thread.sleep(10000);
  driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
 this.takeSnapShot(driver, "D://screenshot//test15.png") ;
 logger.log(LogStatus.SKIP, "Test Case Passed is passTest");
  Thread.sleep(1000);
	}
	
 @Test(priority=11)
public void fundamental()throws Exception
	{logger = extent.startTest("pass Test");
  Assert.assertTrue(true);
 driver.findElement(By.xpath("//h3[@id='ui-id-9']/div/table/tbody/tr/td[2]")).click();
  //driver.findElement(By.xpath("//h3[@id='ui-id-11']/div/table/tbody/tr/td[2]")).click();
 //driver.findElement(By.xpath("//*[@id=\"btnStartExam\"")).click(); 
 driver.findElement(By.xpath("(//input[@id='btnStartExam'])[5]")).click();
  Thread.sleep(1000);
  for(int i=1;i<=20;i++)
  {
  	driver.findElement(By.id("trrdoMCA")).click();
      driver.findElement(By.id("lnkNext")).click();
     
  }
  Thread.sleep(1000);
  
 driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
this.takeSnapShot(driver, "D://screenshot//test16.png") ; 
  Thread.sleep(1000);
  driver.findElement(By.xpath("//*[@id=\"btnProceed\"]")).click();
  driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
this.takeSnapShot(driver, "D://screenshot//test17.png") ; 
  logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	}
 @Test(priority=12)
public void feedback()throws Exception
	{logger = extent.startTest("pass Test");
  Assert.assertTrue(true);
  Thread.sleep(1000);
  driver.findElement(By.id("rblIdQ12")).click();
  driver.findElement(By.id("rblIdQ22")).click();
  driver.findElement(By.id("rblIdQ32")).click();
  Thread.sleep(1000);
  driver.findElement(By.id("btnProceed")).click();
this.takeSnapShot(driver, "D://screenshot//test18.png") ; 
  driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div/div/div[4]/button")).click();
  driver.findElement(By.id("btnProceed")).click();
 this.takeSnapShot(driver, "D://screenshot//test19.png") ; 
  logger.log(LogStatus.PASS, "Test Case Passed is passTest");
	}
@AfterMethod
public void getReport(ITestResult result)
{
	if(result.getStatus() == ITestResult.FAILURE) {
		//log
		logger.log(LogStatus.FAIL, "Test Case Failed is "+ result.getName());
		logger.log(LogStatus.FAIL, "Test Case Failed is "+ result.getThrowable());
		}else if(result.getStatus() == ITestResult.SKIP) {
			logger.log(LogStatus.FAIL, "Test Case Failed is "+ result.getName());
		}
	extent.endTest(logger);
	}
@AfterTest
public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

    //Convert web driver object to TakeScreenshot

    TakesScreenshot scrShot =((TakesScreenshot)webdriver);

    //Call getScreenshotAs method to create image file

            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

            File DestFile=new File(fileWithPath);

            //Copy file at destination

            FileUtils.copyFile(SrcFile, DestFile);
}
 
 @AfterClass
 public void endReport(){
                extent.flush();
                extent.close();
    }
}
*/
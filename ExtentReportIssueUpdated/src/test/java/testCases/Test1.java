package testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.service.ExtentTestManager;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;

@Listeners(ExtentITestListenerClassAdapter.class)
public class Test1 {
	
    static {
    	
        System.setProperty("extent.reporter.html.start", "true");
        System.setProperty("extent.reporter.html.config", "./src/main/resources/extentReport/html-config.xml");
        System.setProperty("extent.reporter.html.out", "test-output/ExtentReport/ExtentReport.html");
    }
    
    @BeforeSuite
    public void beforeSuiteMethod() {
    	
    	//ExtentTestManager.getTest().info("Calling b4 suite method.");
    }
    
	@BeforeTest
	public void b4Test() {
		
		//ExtentTestManager.getTest().info("Calling b4 Test method.");
		
	}
	
	
	
	@BeforeMethod
	public void initMethod() {
		
		//ExtentTestManager.getTest().info("Starting BeforeMethod method.");
		//System.out.println("This is an initial method...");
		
	}
	
	@Test
	public void testMethod() {
		
		//ExtentTestManager.getTest().info("Starting test method.");
		//System.out.println("This is test a test Method.");
	    Assert.assertTrue(true);
	}
	
	@Test
	public void testMethod1() {
		
		//ExtentTestManager.getTest().info("Starting test1 method.");
		//System.out.println("This is test1 a test Method.");
		Assert.assertTrue(false);
	}

}

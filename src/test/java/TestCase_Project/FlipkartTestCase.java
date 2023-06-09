package TestCase_Project;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import BaseConfigurations.BaseFlipkart;
import PageObjectsFlipkart.Brands;
import PageObjectsFlipkart.CancelPopUp;
import PageObjectsFlipkart.HomePage2;
import PageObjectsFlipkart.RemoveFilters;

public class FlipkartTestCase extends BaseFlipkart {
	
	public Brands brandsobj;
	public CancelPopUp cancelobj;
	public HomePage2 mobileobj;
	public RemoveFilters filterobj;
	WebDriver driver;
	
	@Parameters({"Port"})
	@BeforeClass
	public void setup1(String Port) throws MalformedURLException
	{
		driver=setUp(Port);
		
		cancelobj = new CancelPopUp(driver);
		mobileobj = new HomePage2(driver);
		brandsobj= new  Brands(driver);
		filterobj = new RemoveFilters(driver);
	}
	
	@Test
	public void scenarioDemo() throws InterruptedException
	{
		cancelobj.CancelAction();
		mobileobj.MobileNavi();
		brandsobj.clickBrand();
		filterobj.cancelFilters();
		
	}


}

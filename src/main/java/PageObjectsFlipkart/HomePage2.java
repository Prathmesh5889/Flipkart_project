package PageObjectsFlipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage2 {
	
	WebDriver driver;
	
    public HomePage2(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver,this);
}
	@FindBy(xpath="//div[text()='Mobiles']")
	public WebElement mobile;
	
	public void MobileNavi() throws InterruptedException 
	{
		mobile.click();
		Thread.sleep(3000);
		
	}
    

}

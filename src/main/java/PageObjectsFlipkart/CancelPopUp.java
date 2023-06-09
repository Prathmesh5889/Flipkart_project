package PageObjectsFlipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelPopUp {
	
    WebDriver driver;
	
	public CancelPopUp(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='✕']")
	public WebElement cancel;
	
	public void CancelAction()
	{
		cancel.click();
		
	}


}

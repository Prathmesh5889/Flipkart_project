package PageObjectsFlipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Brands {
	
	WebDriver driver;

	  public Brands(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	   @FindBy(xpath="//div[text()='SAMSUNG']")
	   public WebElement Samsung;

	   @FindBy(xpath="//div[text()='APPLE']")
	   public WebElement Apple;

	   @FindBy(xpath="//div[text()='realme']")
	   public WebElement Realme;

	   public void clickBrand() throws InterruptedException
	  {
		Samsung.click();
		Thread.sleep(3000);
		
		Apple.click();
		Thread.sleep(3000);
		Realme.click();
	   }


	}



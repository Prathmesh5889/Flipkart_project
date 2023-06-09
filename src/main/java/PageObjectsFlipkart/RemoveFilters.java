package PageObjectsFlipkart;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class RemoveFilters {
		
		   WebDriver driver;

		  public RemoveFilters(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		   @FindBy(xpath="(//div[text()='APPLE'])[1]")
		   public WebElement cancelA;

		   @FindBy(xpath="(//div[text()='realme'])[1]")
		   public WebElement cancelR;

		   @FindBy(xpath="(//div[text()='SAMSUNG'])[1]")
		   public WebElement cancelS;

		   public void cancelFilters() throws InterruptedException
		  {
			   cancelA.click();
			   Thread.sleep(3000);
			   cancelR.click();
			   Thread.sleep(3000);
			   cancelS.click();
		   }

	}




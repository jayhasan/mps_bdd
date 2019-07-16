package PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class USAPageLocator {
	
	
	
	
	
	@FindBy(xpath= "//span[contains(text(),'Select Vehicle')]")
	public WebElement SelectVehicle;
	
	@FindBy(xpath= "//div[@class='tcom-gnav-carousel__slide js_slide active']//li[7]//a[1]//div[4]//h4[1]")
	public WebElement ToyotaCemry2019 ;
	
	

	@FindBy(xpath= "//span[contains(text(),'Shopping Tools')]")
	public WebElement ShoppingTools;
	

	@FindBy(xpath= "//span[@class='label'][contains(text(),'Find a Dealer')]")
	public WebElement FindADealer;
	
	

}
//*[@id="tcom-secondary-nav"]/ul/li[3]/button/span
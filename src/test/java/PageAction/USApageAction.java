package PageAction;

import org.openqa.selenium.support.PageFactory;


import PageLocator.USAPageLocator;
import TestBase.BaseTest;



public class USApageAction extends BaseTest {

	USAPageLocator usaPageLocator = new USAPageLocator();

	public USApageAction() {
		this.usaPageLocator = new USAPageLocator();
		PageFactory.initElements(driver, usaPageLocator);
	}

	public void ClickSelectVehicle() {

		usaPageLocator.SelectVehicle.click();

	}
	
	/*  public void VerifyToyotaCemry2019() {
	  
	  boolean ToyotaCemry2019 = homePageLocator.ToyotaCemry2019.isDisplayed();
	  Assert.assertTrue(ToyotaCemry2019); }*/
	 

	public void ClickShoppingTools() {
		usaPageLocator.ShoppingTools.click();

	}

	public void ClickFindADealer() {
		usaPageLocator.FindADealer.click();

	}

	/*
	 * public void enterUserNsme(String userName) {
	 * homePageLocator.ToyotaCemry2019.sendKeys(userName);
	 */

}

/*
 * public void user(string firstname) { // This is an example of an second
 * properties (like user name and password)
 * 
 * prop.getProperty("DUserName"); }
 */

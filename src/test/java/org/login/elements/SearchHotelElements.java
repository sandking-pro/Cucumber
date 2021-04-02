package org.login.elements;

import org.adactin.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelElements extends BaseClass {
	public SearchHotelElements() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radioSelect;

	public WebElement getRadioSelect() {
		return radioSelect;
	}
	
	@FindBy(id="continue")
	private WebElement continueBtn;

	public WebElement getContinueBtn() {
		return continueBtn;
	}

}

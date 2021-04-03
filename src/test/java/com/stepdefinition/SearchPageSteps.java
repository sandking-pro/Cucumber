package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.adactin.BaseClass;
import org.login.elements.BookHotel;
import org.login.elements.SearchHotelElements;
import org.login.elements.SelectHotel;


import cucumber.api.java.en.Then;

public class SearchPageSteps extends BaseClass{
	SearchHotelElements sh;
	SelectHotel selh;
	BookHotel bh;
	
	@Then("User Should Select {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_Should_Select_and(String loc, String htl, String rt, String nor, String chkin, String chkout, String apr,
			String cpr) {
		sh = new SearchHotelElements();
		selectDropdown(sh.getLocation(), loc, "vt");
		selectDropdown(sh.getHotels(), htl, "vt");
		selectDropdown(sh.getRt(), rt, "vt");
		selectDropdown(sh.getNor(), nor, "val");
		enterText(sh.getCheckin(), chkin);
		enterText(sh.getCheckout(), chkout);
		selectDropdown(sh.getApr(), apr, "val");
		selectDropdown(sh.getCpr(), cpr, "val");
		
	}

	@Then("User should click the search button")
	public void user_should_click_the_search_button() {
		btnClick(sh.getSubmitSearch());
	    
	}
	
	@Then("User should select hotel and click the continue button")
	public void user_should_select_hotel_and_click_the_continue_button() {
	    selh = new SelectHotel();
	    btnClick(selh.getSelectHotel());
		btnClick(selh.getContinueBtn());
	}
	

	@Then("User should enter {string},{string},{string},{string},{string},{string},{string}and {string}")
	public void user_should_enter_and(String fname,String lname,String address,String cc, String cct, String ccm, String ccy, String cvv){
		bh = new BookHotel();
		enterText(bh.getFname(), fname);
		enterText(bh.getLname(), lname);
		enterText(bh.getAddress(), address);
		enterText(bh.getCcnum(), cc);
		enterText(bh.getCc_cvv(), cvv);
		selectDropdown(bh.getCctype(), cct,"val");
		selectDropdown(bh.getCc_exp_month(), ccm,"val");
		selectDropdown(bh.getCc_exp_year(), ccy,"val");		
	}
	
	@Then("User should click the book now button")
	public void user_should_click_the_book_now_button() {
		btnClick(bh.getBook_now());
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS) ;
		System.out.println(getAttributeText(bh.getOrderno()));
	}


}

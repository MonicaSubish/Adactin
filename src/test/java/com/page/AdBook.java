package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Utility;

public class AdBook extends Utility {

	public AdBook() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
    private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(xpath="//*[@name='address']")
	private WebElement address;
	
	@FindBy(xpath="//*[@id='cc_num']")
	private WebElement card;
	
	@FindBy(xpath="//*[@id='cc_type']")
	private WebElement cType;
	
	@FindBy(xpath="//*[@id='cc_exp_month']")
	private WebElement month;
	
	@FindBy(xpath="//*[@id='cc_exp_year']")
	private WebElement year;
	
	@FindBy(xpath="//*[@id='cc_cvv']")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement book;
	
	
	public WebElement getFname() {
		return fname;
	}

	public void setFname(WebElement fname) {
		this.fname = fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public void setLname(WebElement lname) {
		this.lname = lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public WebElement getCard() {
		return card;
	}

	public void setCard(WebElement card) {
		this.card = card;
	}

	public WebElement getcType() {
		return cType;
	}

	public void setcType(WebElement cType) {
		this.cType = cType;
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(WebElement month) {
		this.month = month;
	}

	public WebElement getYear() {
		return year;
	}

	public void setYear(WebElement year) {
		this.year = year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public void setCvv(WebElement cvv) {
		this.cvv = cvv;
	}

	public WebElement getBook() {
		return book;
	}

	public void setBook(WebElement book) {
		this.book = book;
	}
	
	
}



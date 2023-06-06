package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Utility;

public class AdSearchPage extends Utility{

	public AdSearchPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@name='location']")
	private WebElement location;
	
	@FindBy(xpath="//*[@name='hotels']")
	private WebElement hotel;
	
	@FindBy(xpath="//*[@name='room_type']")
	private WebElement room;
	
	@FindBy(xpath="//*[@name='room_nos']")
	private WebElement roomNo;
	
	@FindBy(xpath="//*[@name ='datepick_in']")
	private WebElement checkInDate;
	
	@FindBy(xpath="//*[@name ='datepick_out']")
	private WebElement checkOutDate;
	
	@FindBy(xpath="//*[@name ='adult_room']")
	private WebElement adult;
	
	@FindBy(xpath="//*[@name ='child_room']")
	private WebElement child;
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement search;
	
	@FindBy(xpath="//*[@type='reset']")
	private WebElement reset;

	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public void setHotel(WebElement hotel) {
		this.hotel = hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public void setRoom(WebElement room) {
		this.room = room;
	}

	public WebElement getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(WebElement roomNo) {
		this.roomNo = roomNo;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(WebElement checkInDate) {
		this.checkInDate = checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(WebElement checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public WebElement getAdult() {
		return adult;
	}

	public void setAdult(WebElement adult) {
		this.adult = adult;
	}

	public WebElement getChild() {
		return child;
	}

	public void setChild(WebElement child) {
		this.child = child;
	}

	public WebElement getSearch() {
		return search;
	}

	public void setSearch(WebElement search) {
		this.search = search;
	}

	public WebElement getReset() {
		return reset;
	}

	public void setReset(WebElement reset) {
		this.reset = reset;
	}
	
	
	
	
	
	


	

	



	
}

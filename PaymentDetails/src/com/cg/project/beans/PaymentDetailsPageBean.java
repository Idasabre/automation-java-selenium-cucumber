package com.cg.project.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentDetailsPageBean {
	
	@FindBy(how=How.ID,id="txtFirstName")
	private WebElement firstName;	
	
	@FindBy(how=How.NAME,name="txtLN")
	private WebElement lastName;
																																															
	@FindBy(how=How.ID,id="txtDebit")																								
	private WebElement debitCardNo;
	
	@FindBy(how=How.ID,id="txtCvv")																								
	private WebElement cvv;
	
	@FindBy(how=How.ID,id="txtMonth")																								
	private WebElement expiryMonth;
	
	@FindBy(how=How.ID,id="txtYear")																								
	private WebElement expiryYear;
	
	@FindBy(how=How.XPATH,xpath="//input[contains(@Value,'Register')]")																								
	private WebElement register;
	

	public String getFirstName() {
		return firstName.getText();
	}

	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}

	public String getLastName() {
		return lastName.getText();
	}

	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	public String getDebitCardNo() {
		return debitCardNo.getText();
	}

	public void setDebitCardNo(String debitCardNo) {
		this.debitCardNo.sendKeys(debitCardNo);
	}

	public String getCvv() {
		return cvv.getText();
	}

	public void setCvv(String cvv) {
		this.cvv.sendKeys(cvv);
	}

	public String getExpiryMonth() {
		return expiryMonth.getText();
	}

	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth.sendKeys(expiryMonth);
	}

	public String getExpiryYear() {
		return expiryYear.getText();
	}

	public void setExpiryYear(String expiryYear) {
		this.expiryYear.sendKeys(expiryYear);
	}

	public void clickRegister() {
		register.click();
	}

}

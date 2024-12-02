package com.cg.project.stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.project.beans.PaymentDetailsPageBean;
import com.cg.project.utils.Utils;

import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.*;

public class PaymentDetailsStepDef {
	
	private WebDriver driver;
	private PaymentDetailsPageBean pageBean;
	
	@Before()
	public void setUpStepEnv() {
		driver= Utils.getWebDriver();
	}

	@Given("^User is on Payment Details page$")
	public void user_is_on_Payment_Details_page() throws Throwable {
		driver.get("D:/CAPGEMINI/PaymentDetails.html");
		//pageBean= PageFactory.initElements(driver, PaymentDetailsPageBean.class);
		
		String expectedTitle="Payment Details";
		String actualTitle= driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@When("^User click 'Register' link without entering 'FirstName'$")
	public void user_click_Register_link_without_entering_FirstName() throws Throwable {
		pageBean.clickRegister();
	}

	@Then("^'Please fill the First Name' message should display$")
	public void please_fill_the_First_Name_message_should_display() throws Throwable {
		String expectedMessage="Please fill the First Name";
		String actualMessage= driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User click 'Register' link without entering 'LastName'$")
	public void user_click_Register_link_without_entering_LastName() throws Throwable {
	    driver.switchTo().alert().dismiss();
		pageBean.setFirstName("test1");
		pageBean.clickRegister();
	}
	
	@Then("^'Please fill the Last Name' message should display$")
	public void please_fill_the_Last_Name_message_should_display() throws Throwable {
	    String expectedMessage="Please fill the Last Name";
		String actualMessage= driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
	}
	
	@When("^User click 'Register' link without entering 'DebitCardNo'$")
	public void user_click_Register_link_without_entering_DebitCardNo() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setLastName("test2");
		pageBean.clickRegister();
	}
	
	@Then("^'Please fill the Debit card Number' message should display$")
	public void please_fill_the_Debit_card_Number_message_should_display() throws Throwable {
	    String expectedMessage="Please fill the Debit card Number";
		String actualMessage= driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User click 'Register' link without entering 'CVV'$")
	public void user_click_Register_link_without_entering_CVV() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setDebitCardNo("123456789");
		pageBean.clickRegister();
	}

	@Then("^'Please fill the CVV' message should display$")
	public void please_fill_the_CVV_message_should_display() throws Throwable {
		String expectedMessage="Please fill the CVV";
		String actualMessage= driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User click 'Register' link without entering 'CardExpMonth'$")
	public void user_click_Register_link_without_entering_CardExpMonth() throws Throwable {
		driver.switchTo().alert().dismiss();
		pageBean.setCvv("123");
		pageBean.clickRegister();
	}

	@Then("^'Please fill expiration month' message should display$")
	public void please_fill_expiration_month_message_should_display() throws Throwable {
	    String expectedMessage="Please fill expiration month";
		String actualMessage= driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User click 'Register' link without entering 'CardExpYear'$")
	public void user_click_Register_link_without_entering_CardExpYear() throws Throwable {
	    driver.switchTo().alert().dismiss();
		pageBean.setExpiryMonth("04");
		pageBean.clickRegister();
	}
	
	@Then("^'Please fill the expiration year' message should display$")
	public void please_fill_the_expiration_year_message_should_display() throws Throwable {
		String expectedMessage="Please fill the expiration year";
		String actualMessage= driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	@When("^User click 'Register' link after entering Valid set of information$")
	public void user_click_Register_link_after_entering_Valid_set_of_information() throws Throwable {
		pageBean.setFirstName("test1");
		pageBean.setLastName("test2");
		pageBean.setDebitCardNo("123456789");
		pageBean.setCvv("123");
		pageBean.setExpiryMonth("04");
		pageBean.setExpiryYear("2022");
		pageBean.clickRegister();
	}

	@Then("^'Registarion successful!!!' message should display$")
	public void registarion_successful_message_should_display() throws Throwable {
	    String expectedMessage="Registarion successful!!!";
		String actualMessage= driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
	}
	
	@After
	public void tearDownStepEnv() {
		driver.switchTo().alert().dismiss();
		driver.close();
		driver = null;
	}
}

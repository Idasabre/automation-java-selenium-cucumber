$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PaymentDetails.feature");
formatter.feature({
  "line": 1,
  "name": "Conference room booking payment",
  "description": "This feature will test payment for room booking",
  "id": "conference-room-booking-payment",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6653448300,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User has already filled all neccessery details in Room booking form",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 7,
  "name": "User will try to register payment details with invalid set of information",
  "description": "",
  "id": "conference-room-booking-payment;user-will-try-to-register-payment-details-with-invalid-set-of-information",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is on Payment Details page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User click \u0027Register\u0027 link without entering \u0027FirstName\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "\u0027Please fill the First Name\u0027 message should display",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User click \u0027Register\u0027 link without entering \u0027LastName\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "\u0027Please fill the Last Name\u0027 message should display",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User click \u0027Register\u0027 link without entering \u0027DebitCardNo\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "\u0027Please fill the Debit card Number\u0027 message should display",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User click \u0027Register\u0027 link without entering \u0027CVV\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "\u0027Please fill the CVV\u0027 message should display",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "User click \u0027Register\u0027 link without entering \u0027CardExpMonth\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "\u0027Please fill expiration month\u0027 message should display",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "User click \u0027Register\u0027 link without entering \u0027CardExpYear\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "\u0027Please fill the expiration year\u0027 message should display",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentDetailsStepDef.user_is_on_Payment_Details_page()"
});
formatter.result({
  "duration": 303158400,
  "status": "passed"
});
formatter.match({
  "location": "PaymentDetailsStepDef.user_click_Register_link_without_entering_FirstName()"
});
formatter.result({
  "duration": 145257000,
  "status": "passed"
});
formatter.match({
  "location": "PaymentDetailsStepDef.please_fill_the_First_Name_message_should_display()"
});
formatter.result({
  "duration": 6246900,
  "status": "passed"
});
formatter.match({
  "location": "PaymentDetailsStepDef.user_click_Register_link_without_entering_LastName()"
});
formatter.result({
  "duration": 158046700,
  "status": "passed"
});
formatter.match({
  "location": "PaymentDetailsStepDef.please_fill_the_Last_Name_message_should_display()"
});
formatter.result({
  "duration": 4070900,
  "status": "passed"
});
formatter.match({
  "location": "PaymentDetailsStepDef.user_click_Register_link_without_entering_DebitCardNo()"
});
formatter.result({
  "duration": 145780400,
  "status": "passed"
});
formatter.match({
  "location": "PaymentDetailsStepDef.please_fill_the_Debit_card_Number_message_should_display()"
});
formatter.result({
  "duration": 4480500,
  "status": "passed"
});
formatter.match({
  "location": "PaymentDetailsStepDef.user_click_Register_link_without_entering_CVV()"
});
formatter.result({
  "duration": 140203700,
  "status": "passed"
});
formatter.match({
  "location": "PaymentDetailsStepDef.please_fill_the_CVV_message_should_display()"
});
formatter.result({
  "duration": 3622000,
  "status": "passed"
});
formatter.match({
  "location": "PaymentDetailsStepDef.user_click_Register_link_without_entering_CardExpMonth()"
});
formatter.result({
  "duration": 118796200,
  "status": "passed"
});
formatter.match({
  "location": "PaymentDetailsStepDef.please_fill_expiration_month_message_should_display()"
});
formatter.result({
  "duration": 4507900,
  "status": "passed"
});
formatter.match({
  "location": "PaymentDetailsStepDef.user_click_Register_link_without_entering_CardExpYear()"
});
formatter.result({
  "duration": 120867900,
  "status": "passed"
});
formatter.match({
  "location": "PaymentDetailsStepDef.please_fill_the_expiration_year_message_should_display()"
});
formatter.result({
  "duration": 4014300,
  "status": "passed"
});
formatter.after({
  "duration": 187139600,
  "status": "passed"
});
formatter.before({
  "duration": 5400333200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User has already filled all neccessery details in Room booking form",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 29,
  "name": "User will try to register payment details with valid set of information",
  "description": "",
  "id": "conference-room-booking-payment;user-will-try-to-register-payment-details-with-valid-set-of-information",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "User is on Payment Details page",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "User click \u0027Register\u0027 link after entering Valid set of information",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "\u0027Registarion successful!!!\u0027 message should display",
  "keyword": "Then "
});
formatter.match({
  "location": "PaymentDetailsStepDef.user_is_on_Payment_Details_page()"
});
formatter.result({
  "duration": 266238000,
  "status": "passed"
});
formatter.match({
  "location": "PaymentDetailsStepDef.user_click_Register_link_after_entering_Valid_set_of_information()"
});
formatter.result({
  "duration": 580826300,
  "status": "passed"
});
formatter.match({
  "location": "PaymentDetailsStepDef.registarion_successful_message_should_display()"
});
formatter.result({
  "duration": 3744200,
  "status": "passed"
});
formatter.after({
  "duration": 211491500,
  "status": "passed"
});
});
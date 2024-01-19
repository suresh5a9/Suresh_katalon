import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.keyword.builtin.CallTestCaseKeyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


public class registration {

	@Given("User logs into system succesfully")
	def callLogintest() {

		WebUI.callTestCase(findTestCase('Login using feature file with tags'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User selects (.*) details")
	def selectAppointmentDetails(String facility) {
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/facility'), facility, false)
		
		WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

		WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'))

		WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/td_19'))

		WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_Comment_comment'), 'appointment')
	}

	@And("clicks on submit")
	def Click() {
		WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'))
		
	}
	@Then("Appointment should be created succesfully")
	def appointmentConfirm() {

		WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Appointment Confirmation'), 'Appointment Confirmation')
		
		WebUI.takeScreenshotAsCheckpoint("confirmation")
		WebUI.closeBrowser()
	}
}

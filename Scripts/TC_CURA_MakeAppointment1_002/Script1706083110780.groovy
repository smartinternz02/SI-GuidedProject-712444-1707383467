import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/appointment/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/appointment/input_username'), 'John Doe')

WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))

WebUI.verifyTextPresent('Make Appointment', true)

WebUI.click(findTestObject('appointment/div_Medicare                                                                             Medicaid                                                                             None'))

WebUI.click(findTestObject('appointment/div_Apply for hospital readmission'))

WebUI.click(findTestObject('appointment/div_Visit Date (Required)_input-group-addon'))

WebUI.selectOptionByValue(findTestObject('appointment/div_Visit Date (Required)_input-group-addon'), '', true)

WebUI.click(findTestObject('appointment/textarea_Comment_comment'))

WebUI.setText(findTestObject('appointment/textarea_Comment_comment'), '')

WebUI.click(findTestObject('appointment/button_Book Appointment'))

WebUI.verifyTextPresent('Appointment Confirmation', true)


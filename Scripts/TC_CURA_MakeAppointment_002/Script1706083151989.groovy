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

WebUI.click(findTestObject('Object Repository/record-1/a_Make Appointment'))

WebUI.click(findTestObject('Object Repository/record-1/input_username'))

WebUI.click(findTestObject('Object Repository/record-1/input_form-control'))

WebUI.setText(findTestObject('Object Repository/record-1/input_username'), 'John Doe')

WebUI.setText(findTestObject('Object Repository/record-1/input_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Object Repository/record-1/button_Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/record-1/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Object Repository/record-1/label_Apply for hospital readmission'))

//WebUI.click(findTestObject(''))
unchecked = WebUI.verifyElementNotChecked(findTestObject('Object Repository/record-1/label_Apply for hospital readmission'), 
    0)

if (unchecked == true) {
    System.out.println('element not checkeck')

    WebUI.check(findTestObject('Object Repository/record-1/label_Apply for hospital readmission'))

    System.out.println('element checkeck')
}

WebUI.delay(3)

//WebUI.verifyElementChecked(findTestObject('Object Repository/record-1/label_Apply for hospital readmission'), 0)
WebUI.click(findTestObject('Object Repository/record-1/label_None'))

WebUI.click(findTestObject('Object Repository/record-1/label_Medicaid'))

WebUI.click(findTestObject('Object Repository/record-1/input_visit_date'))

WebUI.click(findTestObject('Object Repository/record-1/td_17'))

WebUI.click(findTestObject('Object Repository/record-1/td_27'))

WebUI.setText(findTestObject('Object Repository/record-1/textarea_comment'), 'whsbnk')

WebUI.click(findTestObject('Object Repository/record-1/button_Book Appointment'))

WebUI.verifyTextPresent('Appointment Confirmation', false)


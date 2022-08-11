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

'1. open brower'
WebUI.openBrowser('https://sparkle-dev.intalents.co/en/auth/login')

'2. set text email'
WebUI.setText(findTestObject('Object Repository/Login/TC01_email'), 'linh@mailinator.com')

'3. set text pass'
WebUI.setText(findTestObject('Object Repository/Login/TC01_password'), '1q2w3E*123')

'4. click btn login'
WebUI.click(findTestObject('Object Repository/Login/TC01_btnlogin'))

'5. verify text present'
WebUI.verifyTextPresent('Basic information', false)

'6. find teacher'
WebUI.click(findTestObject('Object Repository/Login/TC04_findteacher'))

'7. search teacher'
WebUI.click(findTestObject('Object Repository/Login/TC05_btnsearch'))




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

WebUI.openBrowser(GlobalVariable.linkProd)

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Login/txtEmail'), 0)

WebUI.verifyElementPresent(findTestObject('Login/txtPassword'), 0)

WebUI.verifyElementPresent(findTestObject('Login/btnMasuk'), 0)

WebUI.verifyElementPresent(findTestObject('Login/btnForgotPassword'), 0)

WebUI.verifyElementPresent(findTestObject('Login/btnRegister'), 0)

WebUI.setText(findTestObject('Login/txtEmail'), 'adminadmin@gmail.com')

WebUI.setText(findTestObject('Login/txtPassword'), GlobalVariable.passStaging)

WebUI.click(findTestObject('Login/btnMasuk'))

WebUI.verifyTextPresent('Password atau email anda salah.', false)

WebUI.delay(5)

WebUI.closeBrowser()


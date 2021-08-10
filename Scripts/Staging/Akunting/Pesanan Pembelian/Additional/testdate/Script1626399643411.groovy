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

WebUI.navigateToUrl('https://sysrest.jubelio.com/login')

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio/input_Email_email'), 'jubelio.automated1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Test/Page_Jubelio/input_Password_password'), 'cV+3yqq7s7LQCoX9pWpn8Q==')

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Selamat Datang/a_Akunting'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Selamat Datang/a_Pembelian'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Selamat Datang/span_Pesanan Pembelian'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/span_Tambah Baru'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/input_Tanggal_form-control'), '6 Jun 2021')


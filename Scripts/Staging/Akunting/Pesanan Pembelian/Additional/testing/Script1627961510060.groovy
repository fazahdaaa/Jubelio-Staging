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

WebUI.switchToWindowTitle('Jubelio')

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio/input_Email_email (2)'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio/input_Email_email (2)'), 'jubelio.automated1@gmail.com')

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Test/Page_Jubelio/input_Password_password (2)'), 'cV+3yqq7s7LQCoX9pWpn8Q==')

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio/button_Masuk (2)'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Selamat Datang/a_Akunting (2)'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Selamat Datang/a_Pembelian (2)'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Selamat Datang/span_Penerimaan Barang'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Penerimaan Barang/span_Tambah Baru'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio - Penerimaan Barang/input_Tanggal_form-control'), '3 Agt 2021')

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Penerimaan Barang/div_Harap pilih'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Penerimaan Barang/div_BLIBLI'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Penerimaan Barang/div_Harap pilih'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Penerimaan Barang/div_AUTO-01'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Penerimaan Barang/div_Harap pilih'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Penerimaan Barang/div_Pusat'))

WebUI.doubleClick(findTestObject('Object Repository/Test/Page_Jubelio - Penerimaan Barang/div_2'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio - Penerimaan Barang/input_Online_editor-main'), '1')

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Penerimaan Barang/div_asfasfsdgdssdfasfasfcasa2Buah1Harap pilih'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Penerimaan Barang/div_1'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Penerimaan Barang/div_1'))


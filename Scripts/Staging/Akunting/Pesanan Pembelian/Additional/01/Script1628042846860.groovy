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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sysrest.jubelio.com/login')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sysrest.jubelio.com/login')

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio/input_Email_email (3)'), 'jubelio.automated1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Test/Page_Jubelio/input_Password_password (3)'), 'cV+3yqq7s7LQCoX9pWpn8Q==')

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio/button_Masuk (3)'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Selamat Datang/a_Akunting (3)'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Selamat Datang/a_Pembelian (3)'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Selamat Datang/a_Tagihan'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/button_Tambah Baru'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/a_Faktur'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/input_Tanggal_form-control (2)'), '4 Agt 2021')

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/input_No. Tagihan_bill_no'), '[auto]-fdsghsfhdf')

WebUI.click(findTestObject('Test/Page_Jubelio - Pembelian/ddlBarang - List'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/div_BLIBLI'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/input_Tanggal_form-control (2)'), '31 Desember 2021')

WebUI.sendKeys(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/input_Tanggal_form-control (2)'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/input_Tanggal_form-control (2)'), '31 Des 2021')

WebUI.click(findTestObject('Test/Page_Jubelio - Pembelian/ddlBarang - List'))

WebUI.doubleClick(findTestObject('Test/Page_Jubelio - Pembelian/ddlBarang - List'))

WebUI.doubleClick(findTestObject('Test/Page_Jubelio - Pembelian/txtHarga - List'))

WebUI.setText(findTestObject('Test/Page_Jubelio - Pembelian/txtHargaList - Editor'), '1000')

WebUI.click(findTestObject('Test/Page_Jubelio - Pembelian/txtQTY - List'))

WebUI.doubleClick(findTestObject('Test/Page_Jubelio - Pembelian/txtQTY - List'))

WebUI.setText(findTestObject('Test/Page_Jubelio - Pembelian/txtHargaList - Editor'), '5')

WebUI.doubleClick(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/div_PPN (1)'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/div_No Tax (1)'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/button_Simpan'))


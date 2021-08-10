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

WebUI.doubleClick(findTestObject('Object Repository/Test/Page_Jubelio/input_Email_email'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio/input_Email_email'), 'jubelio.automated1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Test/Page_Jubelio/input_Password_password'), 'cV+3yqq7s7LQCoX9pWpn8Q==')

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Selamat Datang/a_Barang'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Selamat Datang/span_Bundle'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Bundle/span_Tambah Baru'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Bundle/div_Normal_public-DraftStyleDefault-block p_9bef64'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio - Bundle/div_chgcjvjkvhkcvhkbjlvkj'), '<div data-contents="true"><div class="RichTextEditor__block___2Vs_D RichTextEditor__paragraph___3NTf9" data-block="true" data-editor="1joau" data-offset-key="ek7v3-0-0"><div data-offset-key="ek7v3-0-0" class="public-DraftStyleDefault-block public-DraftStyleDefault-ltr" style=""><span data-offset-key="ek7v3-0-0"><span data-text="true" style="">chgcjvjkvhkcvhkbjlvkj</span></span></div></div></div>')

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Bundle/i_Isi Bundle_fa fa-plus'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Bundle/div_Harap pilih'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Bundle/div_Harap pilih'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Bundle/button_Pilih'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Bundle/span_'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Bundle/strong_Foto Produk'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Bundle/strong_Harga'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Bundle/strong_Info Pengiriman'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Bundle/strong_Info Penjualan'))


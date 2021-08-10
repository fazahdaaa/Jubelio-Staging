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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio/input_Email_email'), 'jubelio.automated1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Test/Page_Jubelio/input_Password_password'), 'cV+3yqq7s7LQCoX9pWpn8Q==')

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Selamat Datang/a_Barang'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Selamat Datang/a_Katalog'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Selamat Datang/a_In Review'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - In Review/button_Tambah Baru'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio - In Review/input_Nama_item_group_name'), 'fasfsfs')

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - In Review/div_Pilih kategori'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - In Review/div_Elektronik'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - In Review/div_Harap pilih'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - In Review/div_2 Man'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio - In Review/input_SKU_item_code'), 'sfasfasfsadasdsdf')

WebUI.scrollToElement(findTestObject('Object Repository/Test/Page_Jubelio - In Review/input_SKU_item_code'), 0)

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - In Review/div_dgadfgsdfgfdgdsfgfgdf'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio - In Review/div_dgadfgsdfgfdgdsfgfgdf'), '<div data-contents="true"><div class="RichTextEditor__block___2Vs_D RichTextEditor__paragraph___3NTf9" data-block="true" data-editor="5ol66" data-offset-key="4oeqv-0-0"><div data-offset-key="4oeqv-0-0" class="public-DraftStyleDefault-block public-DraftStyleDefault-ltr" style=""><span data-offset-key="4oeqv-0-0"><span data-text="true" style="">dgadfgsdfgfdgdsfgfgdf</span></span></div></div></div>')


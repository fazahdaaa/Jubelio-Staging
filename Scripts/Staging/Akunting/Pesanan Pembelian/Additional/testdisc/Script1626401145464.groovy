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

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio/input_Email_email (1)'), 'jubelio.automated1@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Test/Page_Jubelio/input_Password_password (1)'), 'cV+3yqq7s7LQCoX9pWpn8Q==')

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio/button_Masuk (1)'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Selamat Datang/a_Akunting (1)'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Selamat Datang/a_Pembelian (1)'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Selamat Datang/a_Pesanan Pembelian (1)'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/span_Tambah Baru (1)'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/input_Tanggal_form-control (1)'), '16 Jul 2021')

WebUI.doubleClick(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/span_Harap pilih (1)'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/a_Barang'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/a_Katalog'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/a_In Review'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - In Review/button_Tambah Baru (1)'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio - In Review/input_Nama_item_group_name (1)'), 'asfasdfa')

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - In Review/div_Pilih kategori (1)'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - In Review/div_Kesehatan'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - In Review/div_Pilih kategori (1)'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - In Review/div_Perawatan Diri'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - In Review/div_Pilih kategori (1)'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - In Review/div_Perawatan Diri Lainnya'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio - In Review/input_SKU_item_code (1)'), 'asdasda')

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - In Review/div_Normal_public-DraftStyleDefault-block p_9bef64 (1)'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio - In Review/div_fadsgfhgafsgdfhjhdgsfadfsgjfdgsfadfsdgh_3b1a9c'), 
    '<div data-contents="true"><div class="RichTextEditor__block___2Vs_D RichTextEditor__paragraph___3NTf9" data-block="true" data-editor="a63ct" data-offset-key="90mem-0-0"><div data-offset-key="90mem-0-0" class="public-DraftStyleDefault-block public-DraftStyleDefault-ltr" style=""><span data-offset-key="90mem-0-0"><span data-text="true" style="">fadsgfhgafsgdfhjhdgsfadfsgjfdgsfadfsdghfgjkfhdgsfadsdfgj</span></span></div></div></div>')

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - In Review/button_Pilih Gambar'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio - In Review/input_Berat Paket (Gram)_form-control'), '1000')

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - In Review/span_Simpan'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - In Review/a_Akunting'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - In Review/a_Pembelian'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - In Review/span_Pesanan Pembelian'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio - In Review/input_Berat Paket (Gram)_form-control'), '16 Jul 2021')

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/span_Pesanan Pembelian_close-btn thick'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/span_Tambah Baru (1)'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/input_Tanggal_form-control (1)'), '16 Jul 2021')

WebUI.doubleClick(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/span_Harap pilih (1)'))

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/div_asdasda - asfasdfa'))

WebUI.doubleClick(findTestObject('Test/Page_Jubelio - Pembelian/txtDiscount'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/input_Online_editor-main (1)'), '1000')

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/div_asdasdaasfasdfa01Buah00PPN01Harap pilih_5beede'))

WebUI.doubleClick(findTestObject('Test/Page_Jubelio - Pembelian/txtDiscount'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/input_Online_editor-main (1)'), '2')

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/div_asdasdaasfasdfa10001Buah00PPN1.0001Hara_90da94'))


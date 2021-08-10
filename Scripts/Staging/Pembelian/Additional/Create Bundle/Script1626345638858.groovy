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

WebUI.callTestCase(findTestCase('Staging/Login/001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Staging/Pembelian/Additional/Create Barang'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Staging/Login/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Staging/Login/001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Barang/Barang - Katalog/Barang - Katalog - In Review/menuBarang'))

WebUI.click(findTestObject('Barang/Barang - Katalog/Barang - Katalog - In Review/subMenuKatalog'))

WebUI.click(findTestObject('Barang/Barang - Bundle/subMenuBundle'))

WebUI.click(findTestObject('Barang/Barang - Bundle/btnTambahBaru'))

WebUI.setText(findTestObject('Barang/Barang - Bundle/txtNama'), 'Masker 6pcs Konsinyasi Item')

WebUI.click(findTestObject('Barang/Barang - Bundle/ddlPilihKategori1'))

WebUI.delay(GlobalVariable.shortDelay)

WebUI.scrollToElement(findTestObject('Barang/Barang - Bundle/optKategori - Kesehatan'), 0)

WebUI.click(findTestObject('Barang/Barang - Bundle/optKategori - Kesehatan'))

WebUI.click(findTestObject('Barang/Barang - Bundle/ddlKategori2'))

WebUI.delay(GlobalVariable.shortDelay)

WebUI.click(findTestObject('Barang/Barang - Bundle/optKategori2 - Perawatan Diri'))

WebUI.click(findTestObject('Barang/Barang - Bundle/ddlKategori3'))

WebUI.delay(GlobalVariable.shortDelay)

WebUI.click(findTestObject('Barang/Barang - Bundle/optKategori3 - Perawatan Diri lainnya'))

WebUI.setText(findTestObject('Barang/Barang - Bundle/txtSKU'), 'BUNDLE01')

WebUI.scrollToElement(findTestObject('Barang/Barang - Bundle/txtSKU'), 0)

WebUI.click(findTestObject('Test/Page_Jubelio - Bundle/div_chgcjvjkvhkcvhkbjlvkj'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio - Bundle/div_chgcjvjkvhkcvhkbjlvkj'), 'BBarang Masker 6pcs untuk tester bundle item pertama')

WebUI.click(findTestObject('Barang/Barang - Bundle/btnIsiBundle'))

WebUI.click(findTestObject('Barang/Barang - Bundle/ddlIsiBundle - Produk'))

WebUI.delay(GlobalVariable.shortDelay)

WebUI.click(findTestObject('Barang/Barang - Bundle/optProduk - NORMAL01'))

WebUI.setText(findTestObject('Barang/Barang - Bundle/txtIsiBundle - Quantity'), '2')

WebUI.click(findTestObject('Barang/Barang - Bundle/btnIsiBundle - Pilih'))

WebUI.click(findTestObject('Barang/Barang - Bundle/ddlInfoPengiriman'))

//CustomKeywords.'testPackage.uploadPict.uploadFile'(findTestObject('Barang/Barang - Bundle/btnUploadFotoProduk'), GlobalVariable.fileUploadPath)
WebUI.setText(findTestObject('Barang/Barang - Bundle/txtBeratPaket'), '100')

WebUI.scrollToElement(findTestObject('Barang/Barang - Bundle/btnSimpan'), 0)

WebUI.click(findTestObject('Barang/Barang - Bundle/btnSimpan'))

WebUI.delay(GlobalVariable.longDelay)


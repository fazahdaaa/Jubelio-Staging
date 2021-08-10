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

WebUI.click(findTestObject('Barang/Barang - Katalog/Barang - Katalog - In Review/menuBarang'))

WebUI.click(findTestObject('Barang/Barang - Katalog/Barang - Katalog - In Review/subMenuKatalog'))

WebUI.click(findTestObject('Barang/Barang - Katalog/Barang - Katalog - In Review/subMenu-InReview'))

WebUI.click(findTestObject('Barang/Barang - Katalog/Barang - Katalog - In Review/btnTambahBaru'))

WebUI.setText(findTestObject('Barang/Barang - Katalog/Barang - Katalog - In Review/txtNama'), 'Masker 6pcs Normal Item')

WebUI.click(findTestObject('Barang/Barang - Katalog/Barang - Katalog - In Review/ddlKategoriBarang'))

WebUI.delay(GlobalVariable.shortDelay)

WebUI.scrollToElement(findTestObject('Barang/Barang - Katalog/Barang - Katalog - In Review/optKategoriBarang - Kesehatan'), 
    0)

WebUI.click(findTestObject('Barang/Barang - Katalog/Barang - Katalog - In Review/optKategoriBarang - Kesehatan'))

WebUI.click(findTestObject('Barang/Barang - Katalog/Barang - Katalog - In Review/ddlKategoriBarang - 2'))

WebUI.delay(GlobalVariable.shortDelay)

WebUI.click(findTestObject('Barang/Barang - Katalog/Barang - Katalog - In Review/optKategoriBarang - 2 - Perawatan Diri'))

WebUI.click(findTestObject('Barang/Barang - Katalog/Barang - Katalog - In Review/ddlKategoriBarang - 3'))

WebUI.delay(GlobalVariable.shortDelay)

WebUI.click(findTestObject('Barang/Barang - Katalog/Barang - Katalog - In Review/optKategoriBarang - 3 -Perawatan Diri Lainnya'))

WebUI.setText(findTestObject('Barang/Barang - Katalog/Barang - Katalog - In Review/txtSKU'), 'NORMAL01')

WebUI.scrollToElement(findTestObject('Barang/Barang - Katalog/Barang - Katalog - In Review/txtSKU'), 0)

WebUI.click(findTestObject('Object Repository/Test/Page_Jubelio - In Review/div_dgadfgsdfgfdgdsfgfgdf'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio - In Review/div_dgadfgsdfgfdgdsfgfgdf'), 'BBarang Masker 6pcs untuk tester normal item pertama')

CustomKeywords.'testPackage.uploadPict.uploadFile'(findTestObject('Barang/Barang - Katalog/Barang - Katalog - In Review/btnPilihGambar'), 
    GlobalVariable.fileUploadPath)

WebUI.setText(findTestObject('Barang/Barang - Katalog/Barang - Katalog - In Review/txtBeratPaket'), '100')

//WebUI.uploadFile(findTestObject('Barang/Barang - Katalog/Barang - Katalog - In Review/btnPilihGambar'), GlobalVariable.fileUploadPath)
WebUI.scrollToElement(findTestObject('Barang/Barang - Katalog/Barang - Katalog - In Review/txtLebarPaket'), 0)

WebUI.setText(findTestObject('Barang/Barang - Katalog/Barang - Katalog - In Review/txtHargaDefault'), '1000')

WebUI.scrollToElement(findTestObject('Barang/Barang - Katalog/Barang - Katalog - In Review/btnSimpan'), 0)

WebUI.click(findTestObject('Barang/Barang - Katalog/Barang - Katalog - In Review/btnSimpan'))

WebUI.delay(GlobalVariable.longDelay)


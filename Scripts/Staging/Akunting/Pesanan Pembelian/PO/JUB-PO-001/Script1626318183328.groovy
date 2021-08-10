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

WebUI.callTestCase(findTestCase('Staging/Akunting/Pesanan Pembelian/Additional/Akses Akunting'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Pesanan Pembelian/menuPesananPembelian'))

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Pesanan Pembelian/btnTambahBaru'))

WebUI.clearText(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Pesanan Pembelian/txtNoPesanan'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Pesanan Pembelian/txtNoPesanan'), 'AUTO-01')

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Pesanan Pembelian/ddlPemasok'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.medDelay)

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Pesanan Pembelian/optPemasok - BLIBLI'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Pesanan Pembelian/ddlLokasi'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.medDelay)

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Pesanan Pembelian/optLokasi - Pusat'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Pesanan Pembelian/ddlPilihBarangList'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.medDelay)

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Pesanan Pembelian/optPilihBarangList - 1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Test/Page_Jubelio - Pembelian/txtHarga'))

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/input_Online_editor-main'), '1000')

WebUI.doubleClick(findTestObject('Test/Page_Jubelio - Pembelian/txtQTY'))

WebUI.setText(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Pesanan Pembelian/txtQtyList'), '2')

WebUI.doubleClick(findTestObject('Object Repository/Test/Page_Jubelio - Pembelian/div_PPN'))

WebUI.delay(GlobalVariable.medDelay)

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Pesanan Pembelian/optPajakList - No tax'))

WebUI.scrollToElement(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Pesanan Pembelian/btnSimpan'), 
    0)

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Pesanan Pembelian/btnSimpan'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.longDelay)

WebUI.callTestCase(findTestCase('Staging/Akunting/Pesanan Pembelian/Additional/Hapus Pembelian'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Staging/Pembelian/Additional/Hapus Barang'), [:], FailureHandling.STOP_ON_FAILURE)


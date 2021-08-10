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

WebUI.callTestCase(findTestCase('Staging/Akunting/Pesanan Pembelian/Additional/Create Pesanan Pembelian'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Staging/Login/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Staging/Login/001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Staging/Akunting/Pesanan Pembelian/Additional/Akses Akunting'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Penerimaan Barang/menuPenerimaanBarang'))

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Penerimaan Barang/btnTambahBaru'))

WebUI.setText(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Penerimaan Barang/txtNoTagihan'), 'AUTO-BILL-02')

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Penerimaan Barang/ddlPemasok'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.shortDelay)

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Penerimaan Barang/optPemasok - BLIBLI'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Penerimaan Barang/ddlPesananPembelian'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.shortDelay)

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Penerimaan Barang/optPesananPembelian - 1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Penerimaan Barang/ddlLokasi'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Penerimaan Barang/optLokasi - Pusat'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Penerimaan Barang/txtQTY'), 0)

WebUI.doubleClick(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Penerimaan Barang/txtQTY'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Test/Page_Jubelio - Penerimaan Barang/input_Online_editor-main'), '2')

WebUI.delay(GlobalVariable.shortDelay)

WebUI.scrollToElement(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Penerimaan Barang/btnSimpan'), 
    0)

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Penerimaan Barang/btnSimpan'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.longDelay)

WebUI.callTestCase(findTestCase('Staging/Akunting/Pesanan Pembelian/Additional/Min'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Staging/Akunting/Pesanan Pembelian/Additional/Hapus Pesanan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Staging/Akunting/Pesanan Pembelian/Additional/Hapus Pembelian'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Staging/Pembelian/Additional/Hapus Barang'), [:], FailureHandling.STOP_ON_FAILURE)


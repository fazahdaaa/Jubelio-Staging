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

WebUI.callTestCase(findTestCase('Staging/Akunting/Pesanan Pembelian/Additional/Create Pesanan Pembelian'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Staging/Login/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Staging/Login/001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Staging/Akunting/Pesanan Pembelian/Additional/Akses Akunting'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Tagihan/menuTagihan'))

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Tagihan/btnTambahBaru'))

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Tagihan/btnTambahBaru - Retur'))

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Tagihan/Retur/txtNoRetur'))

WebUI.setText(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Tagihan/Retur/txtNoRetur'), 'AUTO-TAGR-001')

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Tagihan/Retur/ddlPemasok'))

WebUI.delay(GlobalVariable.shortDelay)

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Tagihan/Retur/optPemasok - BLIBLI'))

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Tagihan/Retur/ddlTagihan'))

WebUI.delay(GlobalVariable.shortDelay)

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Tagihan/Retur/optTagihan - 1'))

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Tagihan/Retur/ddlLokasi'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.shortDelay)

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Tagihan/Retur/optLokasi - Pusat'), FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Tagihan/Retur/ddlPajak'))

WebUI.delay(GlobalVariable.shortDelay)

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Tagihan/Retur/optPajak - PPN'))

WebUI.scrollToElement(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Tagihan/Faktur/btnSimpan'), 0)

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Tagihan/Faktur/btnSimpan'))

WebUI.delay(GlobalVariable.shortDelay)

WebUI.callTestCase(findTestCase('Staging/Akunting/Pesanan Pembelian/Additional/Hapus Tagihan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Staging/Akunting/Pesanan Pembelian/Additional/Hapus Pembelian'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Staging/Pembelian/Additional/Hapus Barang'), [:], FailureHandling.STOP_ON_FAILURE)


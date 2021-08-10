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

WebUI.scrollToElement(findTestObject('menuDashboard'), 0)

WebUI.click(findTestObject('menuDashboard'), FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Staging/Akunting/Pesanan Pembelian/Additional/Akses Akunting'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Pesanan Pembelian/menuPesananPembelian'))

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Pesanan Pembelian/Pesanan Pembelian/cbxHeaderPesananPembelian'))

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Pesanan Pembelian/Pesanan Pembelian/btnDelete'))

WebUI.click(findTestObject('Akunting/Akunting - Pembelian/Akunting - Pembelian - Pesanan Pembelian/Pesanan Pembelian/btnConfirmasiDelete - Ya'))


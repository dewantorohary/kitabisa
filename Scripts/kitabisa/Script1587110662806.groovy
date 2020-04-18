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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kitabisa.com/')

WebUI.scrollToElement(findTestObject('Page_Kitabisacom - Indonesias Fundraising Platform/Page_Kitabisacom - Indonesias Fundraising Platform/h3_Pilih Kategori Favoritmu'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/img_Sisa hari_style__ListImageCanvas-sc-1sl_3e9b67'))

WebUI.click(findTestObject('Object Repository/Page_Bantu Mereka Kesulitan Bekerja di Teng_80ca00/button_DONASI SEKARANG'))

WebUI.click(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/p_Nominal minimal donasi'))

WebUI.click(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/div_BCA Virtual Account'))

WebUI.setText(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/input_atau lengkapi data di bawah ini_fullname'), 
    'hary')

WebUI.setText(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/input_atau lengkapi data di bawah ini_username'), 
    '089622908767')

WebUI.click(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/button_LANJUTKAN PEMBAYARAN'))

WebUI.click(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/span_Sisa hari_style__BannerCloseIcon-sc-10_859bca'))

WebUI.scrollToElement(findTestObject('Page_Kitabisacom - Indonesias Fundraising Platform/h5_Yuk bantu sebarkan ke teman dan keluarga'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Kitabisacom - Indonesias Fundraising Platform/button_KEMBALI KE PENGGALANGAN'))


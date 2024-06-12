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

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.click(findTestObject('Object Repository/Page_React App/button_Entrar'))

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Entrar_Login'), 'Rdalmarco')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_React App/input_Entrar_senha'), '6wgwWWSkQ7Z5JNFp6IDipA==')

WebUI.click(findTestObject('Object Repository/Page_React App/button_Logar'))

WebUI.click(findTestObject('Object Repository/Page_React App/a_Cadastros'))

WebUI.click(findTestObject('Object Repository/Page_React App/a_Equipamento'))

WebUI.click(findTestObject('Object Repository/Page_React App/td_Kollmorgen AKM52. Potncia Nominal 2.5 kW_3112cc'))

WebUI.setText(findTestObject('Object Repository/Page_React App/input_Entrar_Login'), 'Teste Rafael Equipamento 2')

WebUI.click(findTestObject('Object Repository/Page_React App/button_Enviar'))

WebUI.click(findTestObject('Object Repository/Page_React App/a_Relatrios'))

WebUI.click(findTestObject('Object Repository/Page_React App/a_Gerais'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_React App/select_Selecione uma opoMaquinasEquipamento_7e377f'), 
    'Equipamentos', true)

WebUI.click(findTestObject('Object Repository/Page_React App/button_Gerar PDF'))


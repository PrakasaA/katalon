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

Mobile.startApplication('mobileapp/Calculator.apk', false)

Mobile.tap(findTestObject('calculator Help/dotThree.ImageView'), 0)

Mobile.tap(findTestObject('calculator Help/help.TextView - Help'), 0)

Mobile.tap(findTestObject('calculator Help/android.widget.TextView - Search help'), 0)

Mobile.setText(findTestObject('calculator Help/android.widget.EditText - Search help'), 'keyboard', 0)

Mobile.tap(findTestObject('calculator Help/android.widget.TextView - Change your keyboard theme, sound, or vibration'), 
    0)

Mobile.scrollToText('Vibration strength on keypress', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('calculator Help/android.widget.TextView - Vibration strength on keypress'), 0)

x = Mobile.getText(findTestObject('calculator Help/android.widget.TextView - Vibration strength on keypress'), 0)

Mobile.verifyEqual(x, 'Vibration strength on keypress')

Mobile.closeApplication()


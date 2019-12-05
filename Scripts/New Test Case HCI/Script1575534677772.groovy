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

Mobile.startExistingApplication('id.co.myhomecredit')

//Get device height and width
device_Height = Mobile.getDeviceHeight()

device_Width = Mobile.getDeviceWidth()

int startY = device_Height / 2

int endY = startY

int startX = device_Width * 0.70

int endX = device_Width * 0.30
 
Mobile.tap(findTestObject('android.widget.FrameLayout0'), 0)

Mobile.swipe(startX, startY, endX, endY)

Mobile.swipe(startX, startY, endX, endY)

Mobile.swipe(startY, startX, endX, endY)

Mobile.tap(findTestObject('android.widget.TextView0 - DAFTAR'), 0)

Mobile.tap(findTestObject('android.widget.TextView0 - Tanggal Lahir'), 0)

Mobile.tap(findTestObject('android.widget.Button0 - Oke'), 0)

Mobile.tap(findTestObject('android.widget.EditText0 - Masukkan No. Handphone Anda'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Masukkan No. Handphone Anda'), '8517218575', 10)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('android.widget.EditText0 - Tentukan Kode PIN (4 Digit)'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Tentukan Kode PIN (4 Digit)'), '1234', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('android.widget.EditText0 - Konfirmasi Kode PIN'), 0)

Mobile.setText(findTestObject('android.widget.EditText0 - Konfirmasi Kode PIN'), '1234', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('android.widget.Button0 - LANJUTKAN'), 0)

Mobile.scrollToText('peraturan perundang-undangan yang berlaku.', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('android.widget.TextView0 - Saya Setuju'), 0)

Mobile.openNotifications()

TestObject notification = findTestObject('Object Repository/First Notification Item')
Mobile.tap(notification, 10)

TestObject otp = findTestObject('Object Repository/First Notification Item')
String otpText = Mobile.getText(otp, 10)

Mobile.closeNotifications()

Mobile.tap(findTestObject('android.widget.EditText0'), 0)

Mobile.setText('android.widget.EditText0', otpText, 10)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('android.widget.Button0 - DAFTAR'), 0)

Mobile.closeApplication()


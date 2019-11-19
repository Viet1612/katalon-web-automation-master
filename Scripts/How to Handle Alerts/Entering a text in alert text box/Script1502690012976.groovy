import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

'Storing the URL in a variable'
def htmlDir = RunConfiguration.getProjectDir() + GlobalVariable.Alert2_Html_Path

'Open browser'
WebUI.openBrowser(htmlDir)



'Clicking on  button'
WebUI.click(findTestObject('Alerts/button_ClickHere'))

'Using the current driver Instance'
WebDriver driver = DriverFactory.getWebDriver()

'Passing the text in the text box in the Alert\r\n'
driver.switchTo().alert().sendKeys('Testingaaaaaaa')

Thread.sleep(4000)

'Dismiss the Alert '
WebUI.dismissAlert()


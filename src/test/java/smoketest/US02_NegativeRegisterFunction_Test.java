package smoketest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US02_NegativeRegisterFunction_Page;
import utilities.ConfigReader;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

public class US02_NegativeRegisterFunction_Test extends TestBaseFinal {

    US02_NegativeRegisterFunction_Page uS02_NegativeRegisterFunction_Page;
    SoftAssert softAssert;

    public void setup() {
        softAssert = new SoftAssert();
        uS02_NegativeRegisterFunction_Page = new US02_NegativeRegisterFunction_Page();
    }

    @Test
    public void RegisterWithoutPassword() {
        setup();
        extentTest = extentReports.createTest("Register Without Password", "We are trying to register without typing password");
        extentTest.info("User goes to the homepage");
        extentTest.info("User clicks the Hesap Olustur");
        //uS02_NegativeRegisterFunction.SignUpButton.click();
        ReusableMethods.clickElementByJS(uS02_NegativeRegisterFunction_Page.SignUpButton);
        extentTest.info("User types the name and surname");
        uS02_NegativeRegisterFunction_Page.nameAndSurname.sendKeys(ConfigReader.getProperty("nameAndSurname"));
        extentTest.info("User types the email");
        uS02_NegativeRegisterFunction_Page.email.sendKeys(ConfigReader.getProperty("email"));
        extentTest.info("User clicks the Hesap Olustur");
        uS02_NegativeRegisterFunction_Page.HesapOlustur.click();
        extentTest.info("Verified the failure message");
        softAssert.assertTrue(uS02_NegativeRegisterFunction_Page.failureMessage.isDisplayed());
        softAssert.assertAll();
        extentTest.info("Driver closed");
    }

    @Test
    public void RegisterWithoutEmail() {
        setup();
        extentTest = extentReports.createTest("Register Without Email Adress", "We are trying to register without typing Email Adress");
        extentTest.info("User goes to the homepage");
        extentTest.info("User clicks the Hesap Olustur");
        //uS02_NegativeRegisterFunction.SignUpButton.click();
        ReusableMethods.clickElementByJS(uS02_NegativeRegisterFunction_Page.SignUpButton);
        extentTest.info("User types the name and surname");
        uS02_NegativeRegisterFunction_Page.nameAndSurname.sendKeys(ConfigReader.getProperty("nameAndSurname"));
        extentTest.info("User types the password");
        uS02_NegativeRegisterFunction_Page.password.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("User clicks the Hesap Olustur");
        uS02_NegativeRegisterFunction_Page.HesapOlustur.click();
        extentTest.info("Verified the failure message");
        softAssert.assertTrue(uS02_NegativeRegisterFunction_Page.failureMessage.isDisplayed());
        softAssert.assertAll();
        extentTest.info("Driver closed");

    }

    @Test
    public void RegisterWithoutnameAndSurname() {
        setup();
        extentTest = extentReports.createTest("Register Without nameAndSurname", "We are trying to register without typing nameAndSurname");
        extentTest.info("User goes to the homepage");
        extentTest.info("User clicks the Hesap Olustur");
        //uS02_NegativeRegisterFunction.SignUpButton.click();
        ReusableMethods.clickElementByJS(uS02_NegativeRegisterFunction_Page.SignUpButton);
        extentTest.info("User types the email");
        uS02_NegativeRegisterFunction_Page.email.sendKeys(ConfigReader.getProperty("email"));
        extentTest.info("User types the password");
        uS02_NegativeRegisterFunction_Page.password.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("User clicks the Hesap Olustur");
        uS02_NegativeRegisterFunction_Page.HesapOlustur.click();
        extentTest.info("Verified the failure message");
        softAssert.assertTrue(uS02_NegativeRegisterFunction_Page.failureMessage.isDisplayed());
        softAssert.assertAll();
        extentTest.info("Driver closed");
    }

}
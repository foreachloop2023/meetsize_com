package smoketest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US02_NegativeRegisterFunction;
import utilities.ConfigReader;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;

public class US02_NegativeRegisterFunction_Test extends TestBaseFinal {

    US02_NegativeRegisterFunction uS02_NegativeRegisterFunction;
    SoftAssert softAssert;


    @Test
    public void RegisterWithoutPassword() {
        SoftAssert softAssert = new SoftAssert();
        uS02_NegativeRegisterFunction = new US02_NegativeRegisterFunction();
        extentTest=extentReports.createTest("Register Without Password","We are trying to register without typing password");
        extentTest.info("User goes to the homepage");
        extentTest.info("User clicks the Hesap Olustur");
        //uS02_NegativeRegisterFunction.SignUpButton.click();
        ReusableMethods.clickElementByJS(uS02_NegativeRegisterFunction.SignUpButton);
        extentTest.info("User types the name and surname");
        uS02_NegativeRegisterFunction.nameAndSurname.sendKeys(ConfigReader.getProperty("nameAndSurname"));
        extentTest.info("User types the email");
        uS02_NegativeRegisterFunction.email.sendKeys(ConfigReader.getProperty("email"));
        extentTest.info("User clicks the Hesap Olustur");
        uS02_NegativeRegisterFunction.HesapOlustur.click();
        extentTest.info("Verified the failure message");
        softAssert.assertTrue(uS02_NegativeRegisterFunction.failureMessage.isDisplayed());
        softAssert.assertAll();
        extentTest.info("Driver closed");
    }

    @Test
    public void RegisterWithoutEmail(){
        softAssert = new SoftAssert();
        uS02_NegativeRegisterFunction = new US02_NegativeRegisterFunction();
        extentTest=extentReports.createTest("Register Without Email Adress","We are trying to register without typing Email Adress");
        extentTest.info("User goes to the homepage");
        extentTest.info("User clicks the Hesap Olustur");
        //uS02_NegativeRegisterFunction.SignUpButton.click();
        ReusableMethods.clickElementByJS(uS02_NegativeRegisterFunction.SignUpButton);
        extentTest.info("User types the name and surname");
        uS02_NegativeRegisterFunction.nameAndSurname.sendKeys(ConfigReader.getProperty("nameAndSurname"));
        extentTest.info("User types the password");
        uS02_NegativeRegisterFunction.password.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("User clicks the Hesap Olustur");
        uS02_NegativeRegisterFunction.HesapOlustur.click();
        extentTest.info("Verified the failure message");
        softAssert.assertTrue(uS02_NegativeRegisterFunction.failureMessage.isDisplayed());
        softAssert.assertAll();
        extentTest.info("Driver closed");

    }
    @Test
    public void RegisterWithoutnameAndSurname() {
        softAssert = new SoftAssert();
        uS02_NegativeRegisterFunction = new US02_NegativeRegisterFunction();
        extentTest=extentReports.createTest("Register Without nameAndSurname","We are trying to register without typing nameAndSurname");
        extentTest.info("User goes to the homepage");
        extentTest.info("User clicks the Hesap Olustur");
        //uS02_NegativeRegisterFunction.SignUpButton.click();
        ReusableMethods.clickElementByJS(uS02_NegativeRegisterFunction.SignUpButton);
        extentTest.info("User types the email");
        uS02_NegativeRegisterFunction.email.sendKeys(ConfigReader.getProperty("email"));
        extentTest.info("User types the password");
        uS02_NegativeRegisterFunction.password.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("User clicks the Hesap Olustur");
        uS02_NegativeRegisterFunction.HesapOlustur.click();
        extentTest.info("Verified the failure message");
        softAssert.assertTrue(uS02_NegativeRegisterFunction.failureMessage.isDisplayed());
        softAssert.assertAll();
        extentTest.info("Driver closed");
    }

}
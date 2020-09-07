package smoketest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US03_LoginFunction_Page;
import utilities.ConfigReader;
import utilities.TestBaseFinal;

public class US03_LoginFunction_Test extends TestBaseFinal {
    US03_LoginFunction_Page uS03_LoginFunction_Page;
    SoftAssert softAssert;

    public void setup() {
        uS03_LoginFunction_Page = new US03_LoginFunction_Page();
        softAssert=new SoftAssert();
    }
    @Test
    public void login() {
        setup();
        extentTest = extentReports.createTest("Login Function Test", "we are making login function test");
        extentTest.info("User clicks the login button");
        uS03_LoginFunction_Page.LoginButtonFirst.click();
        extentTest.info("User types the email");
        uS03_LoginFunction_Page.email.sendKeys(ConfigReader.getProperty("email"));
        extentTest.info("user enters the password");
        uS03_LoginFunction_Page.password.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("User clicks the login button");
        uS03_LoginFunction_Page.Login.click();
        extentTest.info("User verify loginning the page");
        softAssert.assertTrue(uS03_LoginFunction_Page.ilanEkleLink.isDisplayed());
        softAssert.assertAll();
        extentTest.info("Driver closed");
    }
}

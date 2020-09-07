package smoketest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US04_NegativeLoginFunction_Page;
import utilities.ConfigReader;
import utilities.TestBaseFinal;

public class US04_NegativeLoginFunction_Test extends TestBaseFinal {
    US04_NegativeLoginFunction_Page uS04_NegativeLoginFunction_Page;
    SoftAssert softAssert;

    public void setup(){
        uS04_NegativeLoginFunction_Page=new US04_NegativeLoginFunction_Page();
        softAssert=new SoftAssert();
    }


    @Test
    public void loginTestWitInvalidPassword(){
        setup();
        extentTest=extentReports.createTest("Negative Login testing","we are trying to login with wrong password");
        extentTest.info("user goes to the homepage");
        extentTest.info("user clicks the login button");
        uS04_NegativeLoginFunction_Page.LoginButtonFirst.click();
        extentTest.info("user types the email");
        uS04_NegativeLoginFunction_Page.email.sendKeys(ConfigReader.getProperty("email"));
        extentTest.info("user types the wrong password");
        uS04_NegativeLoginFunction_Page.password.sendKeys(ConfigReader.getProperty("wrong_password"));
        extentTest.info("user clicks the login button");
        uS04_NegativeLoginFunction_Page.Login.click();
        extentTest.info("user verify the failure message");
        softAssert.assertTrue(uS04_NegativeLoginFunction_Page.failureMessage.isDisplayed());
        extentTest.info("driver closed");
    }
    @Test
    public void loginTestWitInvalidemail(){
        setup();
        extentTest=extentReports.createTest("Negative Login testing","we are trying to login with wrong email");
        extentTest.info("user goes to the homepage");
        extentTest.info("user clicks the login button");
        uS04_NegativeLoginFunction_Page.LoginButtonFirst.click();
        extentTest.info("user types the wrong email");
        uS04_NegativeLoginFunction_Page.email.sendKeys(ConfigReader.getProperty("wrong_email"));
        extentTest.info("user types the password");
        uS04_NegativeLoginFunction_Page.password.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("user clicks the login button");
        uS04_NegativeLoginFunction_Page.Login.click();
        extentTest.info("user verify the failure message");
        softAssert.assertTrue(uS04_NegativeLoginFunction_Page.failureMessage.isDisplayed());
        extentTest.info("driver closed");
    }




}

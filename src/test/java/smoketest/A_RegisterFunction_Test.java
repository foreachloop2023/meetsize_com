package smoketest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.A_RegisterFunction_Page;
import utilities.ConfigReader;
import utilities.ReusableMethods;
import utilities.TestBaseFinal;
public class A_RegisterFunction_Test extends TestBaseFinal {
    @Test
    public void positiveRegistration() {
        A_RegisterFunction_Page a_registerFunction_page = new A_RegisterFunction_Page();
        SoftAssert softAssert = new SoftAssert();
        extentTest = extentReports.createTest("Registration Test", "We are doing registration test with sample datas.");
        extentTest.info("User goes to the home page");
        extentTest.info("User clicks the Sign Up");
        ReusableMethods.clickElementByJS(a_registerFunction_page.SignUpButton);
        extentTest.info("User Enters the name and surname");
        a_registerFunction_page.nameAndSurname.sendKeys(ConfigReader.getProperty("nameAndSurname"));
        extentTest.info("User Enters the email adress");
        a_registerFunction_page.email.sendKeys(ConfigReader.getProperty("email"));
        extentTest.info("User enters the password");
        a_registerFunction_page.password.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("User clicks the create an account button");
        a_registerFunction_page.createAccountButton.click();
        extentTest.info("verify the access message");
        softAssert.assertTrue(a_registerFunction_page.accessRegistration.isDisplayed());
        softAssert.assertAll();
        extentTest.info("User clicks the OK button");
        a_registerFunction_page.okButton.click();
        extentTest.info("Driver closed");
    }

    @Test
    public void positiveRegistration2() {

    }

}

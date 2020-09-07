package smoketest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US05_ResetPassword_Page;
import utilities.ConfigReader;
import utilities.TestBaseFinal;

public class US05_ResetPassword_Test extends TestBaseFinal {

    US05_ResetPassword_Page uS05_ResetPassword_Page;
    SoftAssert softAssert;

    public void setup() {
        uS05_ResetPassword_Page = new US05_ResetPassword_Page();
        softAssert = new SoftAssert();
    }

    @Test
    public void resetPassword() {
        setup();
        extentTest = extentReports.createTest("Reset Password", "user resets password");
        extentTest.info("user goes to the homepage");
        extentTest.info("user clicks to the giris yap button");
        uS05_ResetPassword_Page.girisYapIlk.click();
        extentTest.info("user clicks to the sifrei unuttum");
        uS05_ResetPassword_Page.sifreniziUnuttunuz.click();
        extentTest.info("user types the email");
        uS05_ResetPassword_Page.email.sendKeys(ConfigReader.getProperty("reset_Email"));
        extentTest.info("user clicks to the gonder button");
        uS05_ResetPassword_Page.gonder.click();
        extentTest.info("user verify the acces message");
        softAssert.assertTrue(uS05_ResetPassword_Page.message.isDisplayed());
        extentTest.info("driver closed.");


    }
}

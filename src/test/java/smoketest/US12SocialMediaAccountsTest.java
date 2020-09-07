package smoketest;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.US12SocialMediaAccountsPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseFinal;

public class US12SocialMediaAccountsTest extends TestBaseFinal {
    @Test
    public void socialMediaTest() throws InterruptedException {
        US12SocialMediaAccountsPages socialMediaAccountsPages=new US12SocialMediaAccountsPages();
        SoftAssert softAssert=new SoftAssert();
        extentTest=extentReports.createTest("Social Media Test","We are doing test by clicking social accounts");
        extentTest.info("User goes to the home page");
        driver.get("https://meetsize.com");
        extentTest.info("user clicks the giris yap");
        socialMediaAccountsPages.girisYapButton.click();
        extentTest.info("user enters the email");
        socialMediaAccountsPages.email.sendKeys(ConfigReader.getProperty("email"));
        extentTest.info("user enters the password");
        socialMediaAccountsPages.password.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("user clicks the login");
        socialMediaAccountsPages.logInButton.click();
        extentTest.info("user scroll down the pages");

        JavascriptExecutor js=(JavascriptExecutor) Driver.getdriver();

        extentTest.info("user clicks the Facebook");
        js.executeScript("arguments[0].click();",socialMediaAccountsPages.facebook);

        extentTest.info("user clicks the Twitter");
        js.executeScript("arguments[0].click();",socialMediaAccountsPages.twitter);

        extentTest.info("user clicks the Instagram");
        js.executeScript("arguments[0].click();",socialMediaAccountsPages.instagram);

        driver.navigate().back();
        extentTest.info("user clicks the Linkedin");
        js.executeScript("arguments[0].click();",socialMediaAccountsPages.linkedin);





    }








}

package smoketest;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US13ContactUsPages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseFinal;

public class US13ContactUsTest extends TestBaseFinal {
    US13ContactUsPages us13ContactUsPages;

    @Test
    public void contactUsTest() throws InterruptedException {
        us13ContactUsPages = new US13ContactUsPages();

        driver.get("https://meetsize.com");

        us13ContactUsPages.girisYapButton.click();

        us13ContactUsPages.email.sendKeys(ConfigReader.getProperty("email"));

        us13ContactUsPages.password.sendKeys(ConfigReader.getProperty("password"));

        us13ContactUsPages.logInButton.click();

        Thread.sleep(3000);

        JavascriptExecutor js = ((JavascriptExecutor) Driver.getdriver());
        js.executeScript("arguments[0].click();", us13ContactUsPages.contactUs);
        us13ContactUsPages.name.sendKeys(ConfigReader.getProperty("name"));
        us13ContactUsPages.lastname.sendKeys(ConfigReader.getProperty("lastname"));
        us13ContactUsPages.phone.sendKeys(ConfigReader.getProperty("phone"));
        us13ContactUsPages.emailContactUs.sendKeys(ConfigReader.getProperty("email"));
        us13ContactUsPages.messageContactUs.sendKeys(ConfigReader.getProperty("message"));
        us13ContactUsPages.sendContact.click();
        Assert.assertTrue(us13ContactUsPages.messageSentSuccessfully.isDisplayed());

    }
}

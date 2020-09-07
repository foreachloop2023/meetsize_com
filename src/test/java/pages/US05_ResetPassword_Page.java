package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US05_ResetPassword_Page {
    public US05_ResetPassword_Page() {

        PageFactory.initElements(Driver.getdriver(),this);
    }

    @FindBy(linkText = "Giriş Yap")
    public WebElement girisYapIlk;

    @FindBy(linkText = "Şifrenizi unuttunuz mu?")
    public WebElement sifreniziUnuttunuz;

    @FindBy(className ="outline-none")
    public WebElement email;

    @FindBy(xpath = "//button[@class='focus:outline-none reset-button']")
    public WebElement gonder;

    @FindBy(xpath = "//div[@id='swal2-content']")
    public WebElement message;


}

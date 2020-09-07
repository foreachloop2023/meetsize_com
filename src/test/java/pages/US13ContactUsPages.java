package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US13ContactUsPages {
    public US13ContactUsPages(){
        PageFactory.initElements(Driver.getdriver(),this);
    }
    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[.='Giriş Yap']")
    public WebElement logInButton;

    @FindBy(xpath = "//a[.='Giriş Yap']")
    public WebElement girisYapButton;

    @FindBy(xpath = "/html/body/footer/div[2]/div/div[2]/ul/li[2]/a")
    public WebElement contactUs;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement name;

    @FindBy(id="lastname")
    public WebElement lastname;

    @FindBy(id = "phone")
    public WebElement phone;

    @FindBy(id = "email")
    public WebElement emailContactUs;

    @FindBy(id = "message")
    public WebElement messageContactUs;

    @FindBy(xpath = "//*[@id='sendContact']")
    public WebElement sendContact;

    @FindBy(xpath = "//*[.='Mesajınız başarıyla gönderildi.']")
    public WebElement messageSentSuccessfully;
}

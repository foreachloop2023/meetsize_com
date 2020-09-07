package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US12SocialMediaAccountsPages {
    public US12SocialMediaAccountsPages(){
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

    @FindBy(xpath = "//a[@class='flex items-center no-underline']")
    public WebElement facebook;

    @FindBy(xpath = "(//a[@class='flex items-center no-underline'])[2]")
    public WebElement twitter;

    @FindBy(xpath = "(//a[@class='flex items-center no-underline'])[3]")
    public WebElement instagram;

    @FindBy(xpath ="(//a[@class='flex items-center no-underline'])[3]")
    public WebElement linkedin;




}

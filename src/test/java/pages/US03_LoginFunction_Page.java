package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US03_LoginFunction_Page {
    public US03_LoginFunction_Page() {
        PageFactory.initElements(Driver.getdriver(), this);
    }
    @FindBy(linkText = "Giriş Yap")
    public WebElement LoginButtonFirst;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button")
    public WebElement Login;

    @FindBy(linkText = "İlan Ekle")
    public WebElement ilanEkleLink;
}

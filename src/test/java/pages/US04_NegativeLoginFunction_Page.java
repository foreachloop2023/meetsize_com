package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US04_NegativeLoginFunction_Page {

    public US04_NegativeLoginFunction_Page() {
        PageFactory.initElements(Driver.getdriver(),this);
    }
    @FindBy(linkText = "Giriş Yap")
    public WebElement LoginButtonFirst;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button")
    public WebElement Login;

    @FindBy(xpath = "//div[@id='swal2-content']")
    public WebElement failureMessage;





}

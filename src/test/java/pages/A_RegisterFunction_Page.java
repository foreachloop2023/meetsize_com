package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class A_RegisterFunction_Page {
    public A_RegisterFunction_Page() {
        PageFactory.initElements(Driver.getdriver(),this);
    }

    @FindBy(xpath = "(//a[@class='flex'])[3]")
    public WebElement SignUpButton;

    @FindBy(id = "name")
    public WebElement nameAndSurname;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@class='focus:outline-none register-button']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//div[@id='swal2-content']")
    public WebElement accessRegistration;

    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
    public WebElement okButton;






}

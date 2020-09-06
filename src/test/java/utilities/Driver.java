package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    // selamlari silmek istiyorum burasi yanlis olmus.
    // merhabalar.
    //Driver class, driver instance'i baslatmak icin kullanilir (Singleton Driver)
    // ihtiyacimiz oldugunda driver'i kurmak ve baslatmak icin kullaniyoruz
    //driver null oldugunda create edip baslatacagiz()
    // Driver class i farkli browserlar(tarayici) ile de kullanacagimiz sekilde olusturacagiz

    //baska obje olusturulmasini engellemek icin bunu bu sekilde yapiyoruz
    private Driver() {
    }

    // driver instance olusturalim

    static WebDriver driver;

    //driveri baslatmak icin static bir method olusturalim.
    public static WebDriver getdriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    break;
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
            }
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;

    }

    public static void closeDriver(){
        if(driver!=null){  //eger driver chrome'u isaret ediyorsa
            driver.quit();  // driver'i kapat
            driver=null; // driver'in null oldugundan emin olmak icin tekrar null olarak atayalim.
        }               //Boylelikle driver'i tekrar baslatabilirim.
    }                   //Multi Browser Test(chrome, firefox, ie ...) yaparken bu onemli olacaktir.
}

package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    /*
    POM'de Driver icin TestBase class'ina extends etmek yerine
    Driver clas'indan static methodlar kullanarak
     driver olusturup ilgili ayarlarin yapilmasi
    ve en sonda driver'in kapatilmasi tercih edilmistir.
    POM'de Driver class'indaki getDriver()'nin obje olusturularak kullanilmasini engellemek icin
    Singleton pattern kullanimi benimsenmiştir

    Singleton Pattern:  tekli kullanim ,  bir class'in farkli class'lardan obje olustularak
    kullanimini engellemek icin kullanilir.

    Bunu saglamak icin yapmamiz gerek sey oldujca basit obje olusturmak icin kullanilan constructor'i private yaptiginizda
    baska class'larda Driver class'indan obje olusturulmasi munkun OLAMAZ.

     */


    private Driver() {// Singleton Pattern yaptik
    }

    static WebDriver driver;
    public static WebDriver getDriver() {
        if (driver == null) {// bunu yapmamızın sebebi driver hic acilmamissa yeni bir
            // driver ac ve ayarları yap acilmissa return driver ile devam et diyor
            switch(ConfigReader.getProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver =new ChromeDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                    default:
                        WebDriverManager.chromedriver().setup();
                        driver=new ChromeDriver();
            }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        }
        return driver;
    }


    public static void closeDriver() {
        if (driver != null) {// driver'a deger atanmissa
        driver.close();
        driver=null;
        }
    }
}

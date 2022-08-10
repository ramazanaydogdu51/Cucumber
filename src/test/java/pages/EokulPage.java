package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EokulPage {
    public EokulPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//img[@alt='e-Okul Yönetimi Bilgi Sistemi Girişi']")
    public WebElement sistemeGiris;

    @FindBy (xpath = "//input[@id='txtKullaniciAd']")
    public WebElement kullaniciAdi;

    @FindBy (xpath = "//input[@id='txtSifre']")
    public WebElement password;

    @FindBy (xpath = "//a[@id='mdlIOK']")
    public WebElement ilkOkulOrtaOkulKurumIslemleri;

    @FindBy(xpath = "(//td[@style='CURSOR: hand;CURSOR:pointer;'])[8]")
    public WebElement devamsizlikIslemleri;

    @FindBy (xpath = "(//td[@style='CURSOR: hand;CURSOR:pointer;'])[12]")
    public WebElement gunlukDevamsizlikGirisi;

    @FindBy (xpath = "//input[@name='txtTarih']")
    public WebElement tarih;

    @FindBy (xpath = "//input[@class='submitButton']")
    public WebElement listele;

    @FindBy (xpath = "(//input[@type='checkbox'])[88]")
    public WebElement tamGunYok;



}

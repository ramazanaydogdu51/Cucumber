package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.EokulPage;
import utilities.ConfigReader;
import utilities.Driver;

public class eokulStepDefinitions {
    EokulPage eokulPage=new EokulPage();
    @Given("kullanici eokulUrl anasayfasinda")
    public void kullanici_anasayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("eokulUrl"));

    }
    @Given("e okul yonetim sistemine giris yapar")
    public void e_okul_yonetim_sistemine_giris_yapar() {
    eokulPage.sistemeGiris.click();

    }
    @And("kullanici kullanici adini girer")
    public void kullaniciKullaniciAdiniGirer() {
        eokulPage.kullaniciAdi.sendKeys(ConfigReader.getProperty("eokulUsername"));
    }

    @And("kullanici sifresini girer")
    public void kullaniciSifresiniGirer() {
        eokulPage.password.sendKeys(ConfigReader.getProperty("eokulPassword"));
    }
    @Given("ilkokul ortaokul kurum islemlerine giris yapar")
    public void ilkokul_ortaokul_kurum_islemlerine_giris_yapar() {
    eokulPage.ilkOkulOrtaOkulKurumIslemleri.click();

    }
    @Given("devamsizlik islemlerine giris yapar")
    public void devamsizlik_islemlerine_giris_yapar() {
    eokulPage.devamsizlikIslemleri.click();
    }
    @Given("gunluk devamsizlik islemlerine giris yapar")
    public void gunluk_devamsizlik_islemlerine_giris_yapar() {
    eokulPage.gunlukDevamsizlikGirisi.click();

    }



}

# hotel my camp sitesinde  3 adet negativ test senaryosu olusturalim
  #1- dogru username yanlis password
  #2- yanlis username dogru pasword
  #3- yanlis username yanlis pasword

  Feature: US1006 yanlis sifre ile siteye giris yapilamaz
  Scenario: TC09 yanlis password ile giris yapilamaz
  Given kullanici "HMCUrl" anasayfasinda
  Then Log in yazisina tiklar
  And gecerli username girer
  And gecersiz password girer
  And Login butonuna basar
  Then sayfaya giris yapilamadigini kontrol eder
  And sayfayi kapatir
    @pr1 @pr2
      Scenario:TC10 yanlis kullanici adi ile giris yapilamaz
        Given kullanici "HMCUrl" anasayfasinda
        Then Log in yazisina tiklar
        And gecersiz username girer
        And gecerli password girer
        And Login butonuna basar
        Then sayfaya giris yapilamadigini kontrol eder
        And sayfayi kapatir

    Scenario:TC11 yanlis kullanici adi ve yanlis sifre ile giris yapilamaz
      Given kullanici "HMCUrl" anasayfasinda
      Then Log in yazisina tiklar
      And gecersiz username girer
      And gecersiz password girer
      And Login butonuna basar
      Then sayfaya giris yapilamadigini kontrol eder
      And sayfayi kapatir
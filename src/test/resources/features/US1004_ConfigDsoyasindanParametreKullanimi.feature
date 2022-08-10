Feature: US 1004 kullanici parametre configuration file'i kullanabilmeli

  Scenario: TC07 configration properties dosyasindan parametre kullanimi

    Given kullanici "brcUrl" anasayfasinda
    Then kullanici 5 sn bekler
    And url'in "blue" icerdigini test eder
    Then sayfayi kapatir
Feature: devamsizlik girer
  Scenario: TC01 surekli devamsiz ogrenciyi yok yazar
    Given kullanici "eokulUrl" anasayfasinda
    And e okul yonetim sistemine giris yapar
    And kullanici kullanici adini girer
    And kullanici sifresini girer
    And ilkokul ortaokul kurum islemlerine giris yapar
    And kullanici 1 sn bekler
    And devamsizlik islemlerine giris yapar
    And kullanici 1 sn bekler
    And gunluk devamsizlik islemlerine giris yapar

Feature: US1009 Datatables sitesine 5 farkli giris yapalim
    @sirali @datatable
  Scenario Outline: TC14 kullanici 5 farkli kayit girisi yapabilmeli

    When kullanici "datatablesUrl" anasayfasinda
    Then new butonuna basar
    And isim bolumuna "<firstname>" yazar
    And soyisim bolumuna "<lastname>" yazar
    And position bolumuna "<position>" yazar
    And ofis bolumune "<office>" yazar
    And extension bolumuna "<extension>" yazar
    And startDate bolumuna "<startDate>" yazar
    And salary bolumune "<salary>" yazar
    And Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    Then isim bolumunda "<firstname>" oldugunu test eder
   And kullanici 1 sn bekler
    And sayfayi kapatir

    Examples:
    |firstname|lastname|position  |office|extension|startDate |salary|
    |Alim     |Alim    |qa        |ankara|UI       |2021-10-21|10000|
    |Berk     |Can     |tester    |ankara|api      |2022-05-05  |11000|
    |Huseyin  |Kacmaz  |BA        |berlin|-        |2022-07-10|40000|
    |Fatih    |Sahin   |PO        |berlin|-        |2022-03-12|45000|

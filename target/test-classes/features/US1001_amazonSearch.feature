@Tumu
Feature: US1001 Kullanici Amazon Sayfasinda Arama Yapar
  @Nutella @ikisi
  Scenario: TC01 kullanici amazonda Nutella aratir

    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir
    @Java @ikisi
    Scenario: TC02 kullanici amazonda Java aratir
      Given kullanici amazon anasayfasinda
      Then kullanici Java icin arama yapar
      And sonuclarin Java icerdigini test eder
      And sayfayi kapatir
      @Iphone
      Scenario: T03 kullanici amazonda iphone aratir
        When kullanici amazon anasayfasinda
        And kullanici iphone icin arama yapar
        Then sonuclarin iphone icerdigini test eder
        And sayfayi kapatir
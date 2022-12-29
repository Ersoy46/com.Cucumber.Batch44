@parametreliTest
Feature: US1003 parametre ile stepdefinition olusturma
@paralel1
  Scenario: TC05_Parametre kullanımı

    Given kullanıcı amazon sayfasına gider
    And "Java" icin arama yapar
    Then sonucların "Java" icerdigini test eder
    And sayfayi kapatir

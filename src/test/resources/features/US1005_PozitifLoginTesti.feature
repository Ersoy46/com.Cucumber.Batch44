Feature: US1005 Pozitif Login Testi

  @hotel
  Scenario: TC08 Pozitif login

    Given kullanıcı "HMCUrl" sayfasına gider
    And login linkine tıklar
    Then kullanici adi olarak "HMCValidUsername" girer
    And password olarak "HMCValidPassword" girer
    And login butonuna basar
    Then basarili olarak giris yapildigini test eder
    And sayfayi kapatir
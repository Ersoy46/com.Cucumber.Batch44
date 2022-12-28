Feature: US1006 Negative Login Testi

  Scenario: TC09 yanlis username, dogru sifre ile giris yapilamaz

    Given kullanıcı "HMCUrl" sayfasına gider
    Then login butonuna basar
    And kullanici adi olarak "HMCWrongUsername" girer
    And password olarak "HMCValidPassword" girer
    Then login butonuna basar
    And giris yapilamadigini test eder

   @basarisiz
    Scenario: TC10 dogru username,yanlis sifre ile giris yapilamaz

      Given kullanıcı "HMCUrl" sayfasına gider
      Then login linkine tıklar
      And kullanici adi olarak "HMCValidUsername" girer
      And password olarak "HMCWrongPassword" girer
      Then login butonuna basar
      And giris yapilamadigini test eder
      And sayfayi kapatir

      Scenario: TC11 yanlis username yanlis sifre ile giris yapilamaz

        Given kullanıcı "HMCUrl" sayfasına gider
        Then login linkine tıklar
        And kullanici adi olarak "HMCWrongUsername" girer
        And password olarak "HMCWrongPassword" girer
        Then login butonuna basar
        And giris yapilamadigini test eder
        And sayfayi kapatir


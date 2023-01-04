@deneme234
Feature: US1010 Herokuapp sayfasinda Add Butonu testi

  Scenario: TC15 sonradan görünen elemanlar calışmalı

   Given kullanıcı "HerokuappUrl" sayfasına gider
    When Add Element butonuna basin
    Then Delete butonu görününceye kadar bekler
    And Delete butonunun göründügünü test eder
    Then Delete butonuna basarak butonu siler
    And sayfayi kapatir

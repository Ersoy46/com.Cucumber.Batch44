@WebUni
Feature: US1011 WebUniversity window handle

  Scenario Outline: TC16 Resuable method ile window handle

   Given kullanıcı "WebUniversityUrl" sayfasına gider
    And Login partola kadar asagı iner
    And Login portala tıklar
    Then acilan diger windova gecer
    And "<username>" ve "<password>"  kutularina deger yazar
    And WebUniversity Login butonuna basar
    And Popup'ta cikan yazinin "validaton failed" oldgunu test eder
    Then Ok diyerek Popup'i kapatir
    And Ilk sayfaya geri döner
    And Ilk sayfaya döndügünü test eder
   And sayfayi kapatir

   Examples:
   |username|password|
   |Mustafa |Donat   |

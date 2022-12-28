Feature:US1007 Scenario Outline ile amazon search

  Scenario Outline:TC12 amazonda bir listedeki tüm elementleri aratma

    Given kullanıcı "AmazonUrl" sayfasına gider
    Then "<aranacakEleman>" icin arama yapar
    And sonucların "<aranacakEleman>" icerdigini test eder
    And sayfayi kapatir



    Examples:
      | aranacakEleman |
      | Apple          |
      | Java           |
      | Samsung        |
      | Armut          |
      | Nutella        |
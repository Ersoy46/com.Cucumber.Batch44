Feature: US1001_amazon_search
@paralel1
  Scenario: TC01_Amazon Search Testi

    Given kullanıcı amazon sayfasına gider
    And iphone icin arama yapar
    Then sonucların iphone icerdigini test eder

  Scenario: TC01_Amazon Search Testi02

    Given kullanıcı amazon sayfasına gider
    And tea pot icin arama yapar
    Then sonucların tea pot icerdigini test eder

    Given kullanıcı amazon sayfasına gider
    And flower icin arama yapar
    Then sonucların flower icerdigini test eder



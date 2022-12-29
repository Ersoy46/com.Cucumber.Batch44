
@paralel2
Feature: US1002 Background ile amazon search testi

  Background: amazon sayfasına giriş
    Given kullanıcı amazon sayfasına gider


@wip
  Scenario: TC02_Amazon iphone Search Testi

    And iphone icin arama yapar
    Then sonucların iphone icerdigini test eder

  Scenario: TC03_Amazon tea pot Search Testi

    And tea pot icin arama yapar
    Then sonucların tea pot icerdigini test eder

  Scenario: TC04_Amazon flower Search Testi
    And flower icin arama yapar
    Then sonucların flower icerdigini test eder
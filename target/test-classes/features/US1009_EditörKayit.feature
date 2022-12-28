@Editör
Feature:US1009 Scenario Outline ile editör database sayfasina kayit


  Scenario Outline:TC14 kullanici yeni kayit ekleyebilmeli



    When kullanici editör ana sayfaya adresine gider
    Then new butonuna basar
    And firstname olarak "<firstname>" yazar
    And lastname olarak "<lastname>" yazar
    And Position olarak "<position>" yazar
    And Office olarak "<office>" yazar
    And Extension olarak "<extension>" yazar
    And Start date olarak "<startDate>" yazar
    And 1 saniye bekler
    And Salary olarak "<salary>" yazar

    And Create tusuna basar
    When kullanici "<firstname>" ile arama yapar
    Then isim bölümünde "<firstname>" oldugunu dogrular

Examples:
    |firstname|lastname|position|office|extension|startDate|salary|
    |mehmet   |bulut   |amele   |amsterdam|amele |2020-02-01|200  |
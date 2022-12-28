Feature:US1008 Scenario Outline kullanarak farkli degerlerle negative login testi
@SO
  Scenario Outline: TC13 farkli kullanici ve password

    Given kullanıcı "HMCUrl" sayfasına gider
    And login linkine tıklar
    Then scenario outline'dan kullanici adi olarak "<username>" yazar
    And scenario outline'dan password olarak "<password>" yazar
    And login butonuna basar
    Then giris yapilamadigini test eder




    Examples:
      | username | password   |
      | MANAGER  | MANAGER1   |
      | manager  | manager1   |
      | MANager  | MANager1   |
      | Man ager | Man ager1! |


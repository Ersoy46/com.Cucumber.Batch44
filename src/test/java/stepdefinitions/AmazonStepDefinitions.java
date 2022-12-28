package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPages=new AmazonPage();

    @Given("kullanıcı amazon sayfasına gider")
    public void kullanıcı_amazon_sayfasına_gider() {
      Driver.getDriver().get(ConfigReader.getProperty("AmazonUrl"));
    }

    @Given("iphone icin arama yapar")
    public void iphone_icin_arama_yapar() {
amazonPages.amazonAramaKutusu.sendKeys("iphone"+ Keys.ENTER);
    }

    @Then("sonucların iphone icerdigini test eder")
    public void sonucların_iphone_icerdigini_test_eder() {
String sonucYazisiStr=amazonPages.sonucYazisiElementi.getText();
        Assert.assertTrue(sonucYazisiStr.contains("iphone"));
    }

    @Given("tea pot icin arama yapar")
    public void tea_pot_icin_arama_yapar() {
        amazonPages.amazonAramaKutusu.sendKeys("tea pot"+ Keys.ENTER);
    }

    @Then("sonucların tea pot icerdigini test eder")
    public void sonucların_tea_pot_icerdigini_test_eder() {
        String sonucYazisiStr=amazonPages.sonucYazisiElementi.getText();
        Assert.assertTrue(sonucYazisiStr.contains("tea pot"));
    }

    @Given("flower icin arama yapar")
    public void flower_icin_arama_yapar() {
        amazonPages.amazonAramaKutusu.sendKeys("flower"+ Keys.ENTER);
    }

    @Then("sonucların flower icerdigini test eder")
    public void sonucların_flower_icerdigini_test_eder() {
        String sonucYazisiStr=amazonPages.sonucYazisiElementi.getText();
        Assert.assertTrue(sonucYazisiStr.contains("flower"));
    }

    @Given("{string} icin arama yapar")
    public void icin_arama_yapar(String arananKelime) {
       amazonPages.amazonAramaKutusu.sendKeys(arananKelime+Keys.ENTER);
    }
    @Then("sonucların {string} icerdigini test eder")
    public void sonucların_icerdigini_test_eder(String arananKelime) {
        String sonucYazisiStr=amazonPages.sonucYazisiElementi.getText();
        Assert.assertTrue(sonucYazisiStr.contains(arananKelime));
    }

    @And("sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();

    }

    @Given("kullanıcı {string} sayfasına gider")
    public void kullanıcıSayfasınaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));

    }







}
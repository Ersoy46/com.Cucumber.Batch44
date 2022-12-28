package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigReader;

public class HotelMyCampStepDefinitions {
    HMCPage hmcPage = new HMCPage();

    @Given("login linkine tıklar")
    public void login_linkine_tıklar() {
hmcPage.spamGelişmişTuşu.click();
hmcPage.spamYenidenDeneSekmesi.click();
        hmcPage.mainPageLoginTuşu.click();

    }

    @Then("kullanici adi olarak {string} girer")
    public void kullanici_adi_olarak_girer(String kullanıcıTipi) {
hmcPage.usernameBox.sendKeys(ConfigReader.getProperty(kullanıcıTipi));
    }

    @Then("password olarak {string} girer")
    public void password_olarak_girer(String passwordTürü) {
hmcPage.passwordBox.sendKeys(ConfigReader.getProperty(passwordTürü));
    }

    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        hmcPage.loginButonu.click();
    }

    @Then("basarili olarak giris yapildigini test eder")
    public void basarili_olarak_giris_yapildigini_test_eder() {
        Assert.assertTrue(hmcPage.başarılıGirişYazisi.isDisplayed());
    }

    @And("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {
        Assert.assertTrue(hmcPage.girişYapılamadıElementi.isDisplayed());
    }


    @Then("scenario outline'dan kullanici adi olarak {string} yazar")
    public void scenarioOutlineDanKullaniciAdiOlarakYazar(String username) {
        hmcPage.usernameBox.sendKeys(username);
    }

    @And("scenario outline'dan password olarak {string} yazar")
    public void scenarioOutlineDanPasswordOlarakYazar(String password) {
        hmcPage.passwordBox.sendKeys(password);
    }
}

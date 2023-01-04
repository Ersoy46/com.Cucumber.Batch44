package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniversityPage;
import utilities.Driver;
import utilities.ResuableMethods;

public class WebUniversityStepDefinitions {
WebUniversityPage webUniversityPage=new WebUniversityPage();

    @Given("Login partola kadar asagı iner")
    public void login_partola_kadar_asagı_iner() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }

    @Given("Login portala tıklar")
    public void login_portala_tıklar() {
        webUniversityPage.webUniversityLoginPortal.click();
    }

    @Then("acilan diger windova gecer")
    public void acilan_diger_windova_gecer() {
        ResuableMethods.switchToWindow("WebDriver | Login Portal");
    }

    @Then("{string} ve {string}  kutularina deger yazar")
    public void ve_kutularina_deger_yazar(String username , String password) {
webUniversityPage.webUniversityusernameBox.sendKeys(username);
webUniversityPage.webuniversitypasswordBox.sendKeys(password);
    }

    @Then("WebUniversity Login butonuna basar")
    public void web_university_login_butonuna_basar() {
webUniversityPage.webuniversityLoginButonu.click();
    }

    @Then("Popup'ta cikan yazinin {string} oldgunu test eder")
    public void popup_ta_cikan_yazinin_oldgunu_test_eder(String popupYazi) {
        String alertYazisi=Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(popupYazi,alertYazisi);
    }

    @Then("Ok diyerek Popup'i kapatir")
    public void ok_diyerek_popus_i_kapatir() {
Driver.getDriver().switchTo().alert().accept();
    }

    @Then("Ilk sayfaya geri döner")
    public void ılk_sayfaya_geri_döner() {
ResuableMethods.switchToWindow("WebDriverUniversity.com");
    }

    @Then("Ilk sayfaya döndügünü test eder")
    public void ılk_sayfaya_döndügünü_test_eder() {
String actualTtile=Driver.getDriver().getTitle();
String expectedTitle="WebDriverUniversity.com";
Assert.assertEquals(expectedTitle,actualTtile);
    }
}
package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EditörPage;
import utilities.Driver;

public class EditörStepDefinations {
    EditörPage editörPage = new EditörPage();

    @When("kullanici editör ana sayfaya adresine gider")
    public void kullanici_https_editor_datatables_net_adresine_gider() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        editörPage.newButonu.click();
    }

    @Then("firstname olarak {string} yazar")
    public void firstname_olarak_yazar(String firstname) {
        editörPage.firsnameBox.sendKeys(firstname);
    }

    @Then("lastname olarak {string} yazar")
    public void lastname_olarak_yazar(String lastname) {
        editörPage.lastnameBox.sendKeys(lastname);
    }

    @Then("Position olarak {string} yazar")
    public void position_olarak_yazar(String pozition) {
        editörPage.pozitionBox.sendKeys(pozition);
    }

    @Then("Office olarak {string} yazar")
    public void office_olarak_yazar(String office) {
        editörPage.officeBox.sendKeys(office);
    }

    @Then("Extension olarak {string} yazar")
    public void extension_olarak_yazar(String extension) {
        editörPage.extensiontBox.sendKeys(extension);
    }

    @Then("Start date olarak {string} yazar")
    public void start_date_olarak_yazar(String startDate) {
        editörPage.startDateBox.sendKeys(startDate + Keys.ENTER);

    }

    @Then("Salary olarak {string} yazar")
    public void salary_olarak_yazar(String salary) {
        editörPage.salaryBox.sendKeys(salary);
    }

    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        editörPage.createTusuBox.click();

    }

    @When("kullanici {string} ile arama yapar")
    public void kullanici_ile_arama_yapar(String firstname) {
        editörPage.searchBoxElement.sendKeys(firstname);
    }

    @Then("isim bölümünde {string} oldugunu dogrular")
    public void isim_bölümünde_oldugunu_dogrular(String firstname) {
        String sonucStr = editörPage.aramaSonucuElement.getText();
        Assert.assertTrue(sonucStr.contains(firstname));
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int süre) {
        try {
            Thread.sleep(süre * 3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

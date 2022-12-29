package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HerokuappPage;
import utilities.ResuableMethods;


public class HerokuappStepDefinitions {
    HerokuappPage herokuappPage=new HerokuappPage();
    @When("Add Element butonuna basin")
    public void add_element_butonuna_basin() {
herokuappPage.addButonuElement.click();
    }
    @Then("Delete butonu görününceye kadar bekler")
    public void delete_butonu_görününceye_kadar_bekler() {
        ResuableMethods.waitForVisibility(herokuappPage.deleteButonu,20);
    }
    @Then("Delete butonunun göründügünü test eder")
    public void delete_butonunun_göründügünü_test_eder() {
        Assert.assertTrue(herokuappPage.deleteButonu.isDisplayed());
    }
    @Then("Delete butonuna basarak butonu siler")
    public void delete_butonuna_basarak_butonu_siler() {
herokuappPage.deleteButonu.click();
    }
}


package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablesPage;

public class DataTablesStepDefinitions {
    DataTablesPage dataTablesPage=new DataTablesPage();
    @Then("new butonuna basar")
    public void new_butonuna_basar() {
    dataTablesPage.newButonu.click();
    }
    @Then("isim bolumuna {string} yazar")
    public void isim_bolumuna_yazar(String firstName) {
        dataTablesPage.firstName.sendKeys(firstName);

    }
    @Then("soyisim bolumuna {string} yazar")
    public void soyisim_bolumuna_yazar(String lastName) {
        dataTablesPage.lastName.sendKeys(lastName);
    }
    @Then("position bolumuna {string} yazar")
    public void position_bolumuna_yazar(String position) {
        dataTablesPage.position.sendKeys(position);

    }
    @Then("ofis bolumune {string} yazar")
    public void ofis_bolumune_yazar(String office) {
        dataTablesPage.office.sendKeys(office);
    }
    @Then("extension bolumuna {string} yazar")
    public void extension_bolumuna_yazar(String extension) {
        dataTablesPage.extn.sendKeys(extension);
    }
    @Then("startDate bolumuna {string} yazar")
    public void start_date_bolumuna_yazar(String startDate) {
        dataTablesPage.startDate.sendKeys(startDate);


    }
    @Then("salary bolumune {string} yazar")
    public void salary_bolumune_yazar(String salary) {
     dataTablesPage.salary.sendKeys(salary);
    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
       dataTablesPage.create.click();

    }

    @When("kullanici {string} ile arama yapar")
    public void kullaniciIleAramaYapar(String firstName) {
        dataTablesPage.search.sendKeys(firstName);
    }


    @Then("isim bolumunda {string} oldugunu test eder")
    public void isimBolumundaOldugunuTestEder(String firstName) {

        Assert.assertTrue(dataTablesPage.aramaSonucIlkElement.getText().contains(firstName));
    }
}

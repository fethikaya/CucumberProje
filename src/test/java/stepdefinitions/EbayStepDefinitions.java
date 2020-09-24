package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.EbayPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class EbayStepDefinitions {

    EbayPage ebayPage = new EbayPage();



    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {
        Driver.getDriver().get(string);
    }


    @Given("kullanici ebay aramakutusuna {string} yazar ve arar")
    public void kullanici_ebay_aramakutusuna_yazar_ve_arar(String string) {
       ebayPage.ebayAramaKutsu.sendKeys(string+ Keys.ENTER);
    }



    @Then("kullanici ebaysonuc sayisini ekrana yazdirir")
    public void kullanici_ebaysonuc_sayisini_ekrana_yazdirir() {
        System.out.println(ebayPage.ebaySonucSayisi.getText());
    }





}



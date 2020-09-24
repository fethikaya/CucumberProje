package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = {"html:target/default-cucumber-reports",  //html rapor alır
                "json:target/json-reports/cucumber.json" ,  // json olarak rapor alır
                "junit:target/xml-report/cucumber.xml"},// junitolarak Rapor alır

        features = "src/test/resources/features",  // Feautures class'ın adresi
        glue = "stepdefinitions", // testlerinin içerisinde olduğu paketin ismi
        tags = "@amazon", // Sectiğimiz taga ait testleri çalıştırır
        dryRun = false  // Senaryoda oluşturğumuz ancak henüs test methodu yazılmamış
        // stepslerin methodlarını consol'da görmek için dryRun= true kullanıyoruz.
        // dryRun = true yaparsak çalışmaz
        // çalışması için dryRun = false yapmamız lazım

        // bu kalıptır, sabit her zaman olur
)


public class AmazonRunner {
}


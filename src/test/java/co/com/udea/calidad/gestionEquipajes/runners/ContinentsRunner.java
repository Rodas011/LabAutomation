package co.com.udea.calidad.gestionEquipajes.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/get_continents_info.feature/",
        glue = "co.com.udea.calidad.gestionEquipajes.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class ContinentsRunner {}






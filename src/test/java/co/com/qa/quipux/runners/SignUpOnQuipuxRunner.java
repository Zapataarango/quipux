package co.com.qa.quipux.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/signUpOnQuipux.feature",
        glue = "co.com.qa.quipux.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class SignUpOnQuipuxRunner {


}

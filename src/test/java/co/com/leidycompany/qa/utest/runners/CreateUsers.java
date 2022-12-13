package co.com.leidycompany.qa.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/create_users.feature",
        glue = "co.com.leidycompany.qa.utest.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class CreateUsers {

}

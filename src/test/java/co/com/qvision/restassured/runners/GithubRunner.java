package co.com.qvision.restassured.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features="src/test/resources/features/github.feature",
    glue = {"co.com.qvision.restassured.definitions"},
    snippets = SnippetType.CAMELCASE)
public class GithubRunner {

}

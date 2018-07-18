package co.com.qvision.restassured.definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.GithubRestUserAPISteps;

public class GithubDefinition {

  @Steps
  GithubRestUserAPISteps userAPISteps;

  @Given("^github user profile api$")
  public void githubUserProfileApi() throws Exception {
    userAPISteps.withUserProfileAPIEndpoint();
  }

  @When("^looking for (.*) via the api$")
  public void lookingForUserViaTheApi(String user) throws Exception {
    userAPISteps.getProfileOfUser(user);
  }

  @Then("^github's response contains a login same (.*)$")
  public void githubSResponseContainsALoginSameUser(String user) throws Exception {
    userAPISteps.profileShouldContainLoginValue(user);
  }

}

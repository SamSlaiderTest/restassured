package steps;

import static net.serenitybdd.rest.RestRequests.given;
import static net.serenitybdd.rest.RestRequests.when;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.is;
import static services.GithubUrls.USERS_URL;

import net.thucydides.core.annotations.Step;

public class GithubRestUserAPISteps {

  private String api;

  @Step("Given the github REST API for user profile")
  public void withUserProfileAPIEndpoint() {
     api = "https://api.github.com/users/{user}";
  }

  @Step("When looking for {0} via the api")
  public void getProfileOfUser(String user) {
    when().get(api, user);
  }

  @Step("Then there should be a login field with value {0} of user {0}")
  public void profileShouldContainLoginValue(String user) {
    then().body("login", is(user));
  }
}

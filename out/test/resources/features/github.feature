Feature: GitHub
  As GitHub user
  I want to test the GitHub API

  Scenario: Check user profile
    Given github user profile api
    When looking for SamSlaiderTest via the api
    Then github's response contains a login same SamSlaiderTest
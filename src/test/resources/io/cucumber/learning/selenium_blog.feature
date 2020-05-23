Feature: Selenium Blog

  Scenario: Sign up selenium blog
    Given New user access selenium blog
    When New user informs "Karla", "karla@test.com", "karla-password"
    Then New user is redirected to page "Welcome to the alpha blog Karla"

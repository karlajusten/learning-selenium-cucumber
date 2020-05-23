package io.cucumber.learning;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class StepDefinitions {

    WebDriver driver;

    @Given("New user access selenium blog")
    public void new_user_access_selenium_blog() {
        driver = new FirefoxDriver();
        driver.navigate().to("https://selenium-blog.herokuapp.com/signup");
    }

    @When("New user informs {string}, {string}, {string}")
    public void new_user_informs(String username, String email, String password) {
        SignupPage signup = new SignupPage(driver);
        signup.enter_username(username);
        signup.enter_email_address(email);
        signup.enter_password(password);
        signup.submit_form();
    }

    @Then("New user is redirected to page {string}")
    public void new_user_is_redirected_to_page(String expected_banner_text) {
        UsersPage users = new UsersPage(driver);
        String banner_text = users.get_banner_text();
        assertEquals(expected_banner_text,banner_text);
        driver.quit();
    }

}

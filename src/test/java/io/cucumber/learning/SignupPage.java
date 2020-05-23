package io.cucumber.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Timestamp;
import java.util.Date;


public class SignupPage {

    //css selectors
    String USERNAME_FIELD = "user_username";
    String EMAIL_FILED = "user_email";
    String PASSWORD_FIELD = "user_password";
    String SUBMIT_BUTTON = "submit";

    WebDriver driver;


    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enter_username(String username) {
        WebElement username_field = driver.findElement(By.id(USERNAME_FIELD));
        username_field.sendKeys(username);
    }

    public void enter_email_address(String email) {
        WebElement email_field = driver.findElement(By.id(EMAIL_FILED));
        email_field.sendKeys(email);
    }

    public void enter_password(String password) {
        WebElement password_field = driver.findElement(By.id(PASSWORD_FIELD));
        password_field.sendKeys(password);
    }

    public void submit_form() {
        WebElement sign_up_button = driver.findElement(By.id(SUBMIT_BUTTON));
        sign_up_button.click();
    }
}
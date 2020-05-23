package io.cucumber.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UsersPage {

    String SUCCESS_BANNER = "flash_success";

    WebDriver driver;

    public UsersPage(WebDriver driver) {
        this.driver = driver;
    }

    public String get_banner_text() {
        WebElement banner = driver.findElement(By.id(SUCCESS_BANNER));
        return banner.getText();
    }
}

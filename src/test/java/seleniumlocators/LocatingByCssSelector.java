package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.time.Duration;

public class LocatingByCssSelector {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com/");

        WebElement userNameField = driver.findElement(By.cssSelector("input#user-name"));
        WebElement passwordField = driver.findElement(By.cssSelector("input#password"));
        WebElement loginButton = driver.findElement(By.cssSelector("input#login-button"));

        userNameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();
    }
}

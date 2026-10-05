package seleniumwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);

        WebElement userNameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        userNameField.sendKeys("Admin");

        Thread.sleep(5000);
        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordField.sendKeys("admin123");

        Thread.sleep(5000);
        WebElement loginButton = driver.findElement(By.xpath("//button[text()=' Login ']"));
        loginButton.click();

    }
}

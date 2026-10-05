package HandlingWebElement;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HandlingDoubleClick {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement doubleClickText = driver.findElement(By.xpath("//h2[text()='Double Click']"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView()",doubleClickText);

        WebElement button = driver.findElement(By.xpath("//button[text='Copy Text']"));

        Actions act = new Actions(driver);
        act.doubleClick(button).build().perform();
    }
}

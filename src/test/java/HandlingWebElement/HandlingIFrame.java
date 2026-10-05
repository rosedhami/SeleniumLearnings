package HandlingWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingIFrame {
    public static void main (String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice-automation.com/iframes/");


        driver.switchTo().frame("iframe-1");
        WebElement docs = driver.findElement(By.xpath("//a[text()='Docs']"));
        docs.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame("iframe-2");

        WebElement download = driver.findElement(By.xpath("//span[text()='Downloads']"));
        download.click();
    }
}

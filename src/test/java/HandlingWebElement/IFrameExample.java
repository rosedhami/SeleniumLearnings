package HandlingWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IFrameExample {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.automationtesting.in/Frames.html");
        WebElement frameWithInFrame= driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
        frameWithInFrame.click();


        WebElement firstIframe= driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(firstIframe);

        WebElement secondIframe= driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
        driver.switchTo().frame(secondIframe);

        WebElement textField= driver.findElement(By.xpath("//input[@type='text']"));
        textField.sendKeys("Broadway Infosys");

        driver.switchTo().defaultContent();


        WebElement iframe= driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
        driver.switchTo().frame(iframe);

        WebElement textFieldBox= driver.findElement(By.xpath("//input[@type='text']"));
        textFieldBox.sendKeys("Broadway Infosys");




    }
}


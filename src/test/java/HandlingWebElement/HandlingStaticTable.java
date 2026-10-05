package HandlingWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandlingStaticTable{
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement staticTableText = driver.findElement(By.xpath("//h2[text()='Static Web Table']"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView()",staticTableText);

        List<WebElement> numberOfRows = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
        System.out.println("The total number of rows are:" +numberOfRows.size());

        List<WebElement> numberOfColumns = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
        System.out.println("The total number of columns are:" +numberOfColumns.size());

        List<WebElement> allDataElements = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td"));

        for(WebElement data : allDataElements){
            String value = data.getText();
            System.out.println(value);
        }
    }

    }




package HandlingWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandlingDynamicTable {
    static WebDriver driver;

    public static void main(String[] args){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice.expandtesting.com/dynamic-table");

        List<WebElement> numberOfColumns = driver.findElements(By.xpath("//table[@class='table table-striped']/thead/tr/th"));
        System.out.println("The total number of columns are:" +numberOfColumns.size());

        List<WebElement> numberOfRows = driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
        System.out.println("Number of rows which contains data are:" +numberOfRows.size());

    }
}

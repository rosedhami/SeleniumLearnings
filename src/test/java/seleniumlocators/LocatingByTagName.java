package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class LocatingByTagName {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        driver.get("https://www.saucedemo.com/");
//
//         List<WebElement> divTags = driver.findElements(By.tagName("div"));
//        System.out.println("The total number of div tag are:" +divTags.size());

//        driver.get("https://www.imdb.com/");
//        List<WebElement> linkTags = driver.findElements(By.tagName("link"));
//        System.out.println("The total number of links are:" +linkTags.size());

        driver.get("https://testautomationpractice.blogspot.com/");
        List<WebElement> linkTags = driver.findElements(By.tagName("link"));
        System.out.println("The total number of links are:" +linkTags.size());

    }
}

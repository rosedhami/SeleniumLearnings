package HandlingWebElement;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HandlingDragNDrop {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement dragNDropText = driver.findElement(By.xpath("//h2[text()='Drag and Drop']"));

        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("arguments[0].scrollIntoView()",dragNDropText);

        WebElement draggableBox = driver.findElement(By.id("draggable"));
        WebElement droppableBox = driver.findElement(By.id("droppable"));

        Actions act = new Actions(driver);
        act.dragAndDrop(draggableBox,draggableBox).build().perform();
    }
}

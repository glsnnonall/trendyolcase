import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class TestDeneme {

    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void loginTest() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Trendyol");
        driver.findElements(By.name("btnK")).get(1).click();
        driver.findElements(By.cssSelector("div[aria-level='3'] span")).get(0).click();
        driver.findElement(By.className("category-header")).click();
        TimeUnit.SECONDS.sleep(3);
        driver.findElement(By.className("search-box")).sendKeys("kazak"+ Keys.ENTER);
        TimeUnit.SECONDS.sleep(3);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,800)", "");
    }
    @Test
    @Order

    public void favoriteKazak(){
        List<WebElement> imageList=driver.findElements(By.className("[class='image-overlay-body']"));
        WebElement item=imageList.get(9);
        item.click();

    }
}





























package tests.day03_Webelements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_locators {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon ana sayfaya gidin
        driver.get("https://www.amazon.com");

        // arama kutusunun yanindaki today's deals linkine tiklayin

        WebElement todaysDealsElementi= driver.findElement(By.linkText("Today's Deals"));
        todaysDealsElementi.click();

        Thread.sleep(2000);


        // acilan sayfada ilk urunu tiklayin

        List<WebElement> urunElementleriListesi=driver.findElements(By.className("DealGridItem-module__dealItemContent_1vFddcq1F8pUxM8dd9FW32"));

        urunElementleriListesi.get(0).click();

        Thread.sleep(2000);
        driver.close();
    }
}

package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.navigate().to("https://www.wisequarter.com");
        Thread.sleep(1000);

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(1000);

        // yeniden wisequarter sayfasina git
        driver.navigate().back();
        Thread.sleep(1000);


        // yeniden amazon sayfasina git(ileri - forward)
        driver.navigate().forward();
        Thread.sleep(1000);


        driver.close();
    }
}

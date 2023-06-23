package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P05 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1));

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        driver.manage().deleteAllCookies();

        driver.findElement(By.name("firstname")).sendKeys("Abuzer"+Keys.ENTER);

    }
}

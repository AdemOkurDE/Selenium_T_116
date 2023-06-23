package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class p06 {
    public static void main(String[] args) {

    System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1));

        driver.get("http://www.babayigit.net/murat/testpage.html");

        driver.findElement(By.id("ad")).sendKeys("Murat");
        driver.findElement(By.id("soyad")).sendKeys("Yigit");
        driver.findElement(By.id("yas")).sendKeys("41");
        driver.findElement(By.id("meslek")).sendKeys("ogretmen");
        driver.findElement(By.id("dogum_yeri")).sendKeys("Istanbul");
        driver.findElement(By.id("mezun_okul")).sendKeys("Bogazici");
        driver.findElement(By.id("cocuk_sayisi")).sendKeys("2");
        driver.findElement(By.xpath("//*[@type='submit']")).click();


    }
}

package tests.day02_tekrar;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) throws InterruptedException {


            // 1. Yeni bir package olusturalim : day01
            // 2. Yeni bir class olusturalim : C03_GetMethods
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            // 3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

            // 4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        // 5. Sayfa basliginin “Amazon” icerdigini test edin
        String expectedIcerik="Amazon";
        String actualTitle= driver.getTitle();
        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Amazon title test PASSED");
        }else {
            System.out.println("Amazon title test FAILED\nActual title : " + actualTitle);
        }
            // 6. Sayfa adresini(url) yazdirin
        System.out.println("Actual Url : "+ driver.getCurrentUrl());

            // 7. Sayfa url’inin “amazon” icerdigini test edin.
        String actualUrl= driver.getCurrentUrl();
        expectedIcerik="amazon";
        if (actualUrl.contains(expectedIcerik)){
            System.out.println("Amazon Url test PASSED");
        }else {
            System.out.println("Amazon title test FAILED\nActual title : " + actualUrl);
        }
            // 8. Sayfa handle degerini yazdirin
        System.out.println("Window Handle degeri : "+driver.getWindowHandle());

        // 9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
            // 10. Sayfayi kapatin.

        driver.manage().window().setSize(new Dimension(1200,550));
        driver.manage().window().setPosition(new Point(150,150));

        Thread.sleep(2000);
        driver.close();


    }
}

package tests.day03_Webelements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class C02_Locators {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon ana sayfaya gidin
        driver.get("https://www.amazon.com");

        // arama cubuguna Nutella yazdirin aratin

        WebElement aramaKutusuElementi= driver.findElement(By.id("twotabsearchtextbox"));

        // yada "By.name" ile de aratabiliriz
        // WebElement aramaKutusuElementi= driver.findElement(By.name("field-keywords"));

        aramaKutusuElementi.sendKeys("Nutella");
        aramaKutusuElementi.submit();

        // gosterilen urunlerin 10'dan fazla oldugunu test edin
        // Locator stratejisi olarak By.className secildiginde class attribute'nin degeri space(bosluk) iceririyorsa
        // locate islemi basarisiz olabilir

        //List<WebElement> urunIsimElementleriList= driver.findElements(By.className("a-size-base-plus a-color-base a-text-normal"));
        List<WebElement> urunIsimElementleriList = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        if (urunIsimElementleriList.size()>10){
            System.out.println("Liste urun sayisi testi PASSED");
        }else {
            System.out.println("Liste urun sayisi testi FAILED");
        }


        // 5. urun isminin Nutella icerdigini test edin

        String besinciUrunIsmi=urunIsimElementleriList.get(4).getText();

        System.out.println("Besinci Urun ismi : " + besinciUrunIsmi);

        String expectedIcerik="Nutella";

        if (besinciUrunIsmi.contains(expectedIcerik)){
            System.out.println("5. urun isim testi PASSED");
        }else {
            System.out.println("5. urun isim testi FAILED");
        }


        Thread.sleep(1000);
        driver.close();

    }
}

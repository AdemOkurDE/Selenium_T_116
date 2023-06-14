package tests.day03_Webelements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_Locators {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        /*
            1- Bir test class’i olusturun ilgili ayarlari yapin
        */

          //  2- https://www.automationexercise.com/ adresine gidin

        driver.get("https://www.automationexercise.com/");


          //  3- Sayfada 147 adet link bulundugunu test edin.

        List<WebElement> linkSayisi=driver.findElements(By.tagName("a"));
        System.out.println("Link sayisi : "+ linkSayisi.size());

        int expectedLinkSayisi=147;

        if (linkSayisi.size()==expectedLinkSayisi){
            System.out.println("Link sayisi testi PASSED");
        }else {
            System.out.println("Link sayisi testi FAILED");
        }



          //  4- Products linkine tiklayin
        driver.findElement(By.partialLinkText("Products")).click();


          //  5- special offer yazisinin gorundugunu test edin
        WebElement specialOfferElementi= driver.findElement(By.id("sale_image"));

        if (specialOfferElementi.isDisplayed()){
            System.out.println("Special offer testi PASSED");
        }else {
            System.out.println("Special offer testi FAILED");
        }


          //  6- Sayfayi kapatin

        Thread.sleep(1000);
        driver.close();





    }
}

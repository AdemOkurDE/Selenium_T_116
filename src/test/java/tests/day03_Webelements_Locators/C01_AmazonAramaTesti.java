package tests.day03_Webelements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_AmazonAramaTesti {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon ana sayfaya gidin

        driver.get("https://www.amazon.com");

        // arama cubuguna Nutella yazdirin aratin
        /*
            Bir webelementi kullanabilmek icin oncelikle o webelementi
            driverin bulabilmesi icin locate etmeliyiz.
            Yani yerini tarif edecek bilgiye ulasmaliyiz

            amazon arama cubugu icin bu bilginin id = twotabsearchtextbox oldugunu
            amazon sayfasinda arastirma yaparak bulduk

            Sonra locate bilgisini kullllanarak web sayfasinda o elementi bulup
            bu class'da o webelementi kullanabilmek icin kaydedecek bir hazir methoda ihtiyacimiz var.

         */

        WebElement aramaKutusuElementi= driver.findElement(By.id("twotabsearchtextbox"));

        /*
            Bu satirda 3 islem yapiliyor
            1 - locate islemi : id = twotabsearchtextbox
            2 - bu locate'i kullanarak istedigimiz arama kutusunu bize getirecek method
                driver.findElement(locate stratejisi)
            3 - locate edip, findElement() ile buldugumuz web elementi
                icinde bulundugumuz class'da kullanabilmek icin
                bir WebElement objesine ATAMAK
         */

        aramaKutusuElementi.sendKeys("Nutella");
        aramaKutusuElementi.submit();

        // Arama sonuclarinin Nutella icerdigini test edin.
        WebElement aramaSonucElementi= driver.findElement(By.className("sg-col-inner"));

        /*
        System.out.println(aramaSonucElementi);
        aramaSonucElementi objesini bir WebElement olarak olusturduk
        WebElement bir primitive data turu olmadigindan
        direk yazdirmak istersek referansini yazdirir

         */
        System.out.println(aramaSonucElementi.getText());

        String expectedIcerik="Nutella";
        String actualSonucYazisi=aramaSonucElementi.getText();

        if (actualSonucYazisi.contains(expectedIcerik)){
            System.out.println("Nutella test PASSED");
        }else {
            System.out.println("Nutella test FAILED\n actuel Text : " + actualSonucYazisi);
        }

        Thread.sleep(3000);
        driver.close();


    }
}

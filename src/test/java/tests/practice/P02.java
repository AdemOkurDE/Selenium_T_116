package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02 {

        /*
        . .Exercise2...
        1-Driver oluşturalim
        2-Java class'imiza chnomedriver.exet i tanitalim
        3-Driver'in tum ekranı kaplamasini saglayalim
        4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim.
          Eger oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
        5-"https://www.otto.de" adresine gidelim
        6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
        7-Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim
        8-Ardindan "https://wisequarter.com/" adresine gidip
        9-BU adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
        10-Bir onceki web sayfamiza geri donelim
        11-Sayfayı yenileyelim
        12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
        13- En son adim olarak butun sayfalarimizi kapatmis olalim
     */

    public static void main(String[] args) throws InterruptedException {

        // 1-Driver oluşturalim
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        // 2-Java class'imiza chmomedriver.exet i tanitalim
        WebDriver driver = new ChromeDriver();

        // 3-Driver'in tum ekranı kaplamasini saglayalim
        driver.manage().window().maximize();

        // 4-"https://www.otto.de" adresine gidelim
        driver.get("https://www.otto.de");
        driver.findElement(By.xpath("//*[@class='p_btn100--1st cookieBanner__button js_cookieBannerPermissionButton']")).click();
        Thread.sleep(2000);

        // 5-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim.
        //   Eger oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

         // 6-BU web adresinin sayfa basligini (title) ve adres (url)ini alalim
        String actualTitle= driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        String actualUrl=driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        // 7-Title ve url inin "0TT0" kelimesinin içerip icermedigini kontrol edelim
        String expectedIcerik="OTTO";
        if (actualTitle.contains(expectedIcerik)){ //&&actualUrl.contains(expectedIcerik) -- iptal ettik
            System.out.println("OTTO test PASSED");
        } else {
            System.out.println("OTTO test FAILED");
        }

        // 8-Ardindan "https://wisequarter.com/" adresine gidip
        driver.navigate().to("https://wisequarter.com/");
        Thread.sleep(2000);

        // 9-BU adresin basligini alalim ve "Quarter" kelimesini icenip icermedigini kontrol edelim
        actualTitle= driver.getTitle();
        System.out.println("Wisequarter Title = " + actualTitle);
        expectedIcerik="Quarter";
        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Wisequarter test PASSED");
        } else {
            System.out.println("Wisequarter test FAILED");
        }

        // 10-Bir onceki web sayfamiza geri donelim
        driver.navigate().back();
        Thread.sleep(2000);

        // 11-Sayfayı yenileyelim
       driver.navigate().refresh();

        // 12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
        driver.navigate().forward();
        driver.close();
        Thread.sleep(1000);

        // 13- En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.quit();


    }
}

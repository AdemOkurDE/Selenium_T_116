package tests.day03_Webelements_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Homework {
    public static void main(String[] args) throws InterruptedException {
        /*
            1.Bir class oluşturun : AmazonSearchTest
2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
a.web sayfasına gidin. https://www.amazon.com/
b.Search(ara) “city bike”
c. Amazon'da görüntülenen ilgili sonuçların sayısını
yazdırın
d.Sonra karşınıza çıkan ilk sonucun resmine tıkla


         */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");

        // b.Search(ara) “city bike”

        WebElement aramaKutusuElementi = driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusuElementi.sendKeys("nutella");
        aramaKutusuElementi.submit();

        // c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın

        // List<WebElement> urunSayisiList=driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']"));
        List<WebElement> urunSayisiList=driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));

        System.out.println("Gosterilen Urun sayisi : "+urunSayisiList.size());

        // d.Sonra karşınıza çıkan ilk sonucun resmine tıkla

        urunSayisiList.get(0).click();



        Thread.sleep(1000);
        driver.close();

    }
}

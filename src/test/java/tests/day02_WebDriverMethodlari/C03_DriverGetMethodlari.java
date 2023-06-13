package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverGetMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.get("https://www.wisequarter.com");
        Thread.sleep(1000);

        // Sayfa title'inin "Wise" icerdigini test edin

        System.out.println(driver.getTitle());

        String expectedIcerik= "Wise";
        String actualTitle= driver.getTitle();
        if (actualTitle.contains(expectedIcerik)){
            System.out.println("Title testi PASSED");
        }else {
            System.out.println("Title Wise icermiyor! Test FAILED");
        }

        // Url'in https://www.wisequarter.com oldugunu test edin
        String expectedUrl="https://www.wisequarter.com";
        String actualUrl=driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)){
            System.out.println("Url testi PASSED");
        }else {
            System.out.println("Url Testi FAILED");
            System.out.println("Actual URL :" + actualUrl);
        }

        // System.out.println(driver.getPageSource());
        // sayfa kaynagi teslerde cok kullanilmaz!!

        System.out.println(driver.getWindowHandle());  // 6F56EFD0F6356EA83DA1D5769FA7C0A4  <== her browser calistirildiginda farkli olarak yeniden olusturulur

        System.out.println(driver.getWindowHandles());

        driver.close();


    }
}

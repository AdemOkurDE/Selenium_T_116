package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C02_SeleniumDriveriOtomatikKullanma {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        Thread.sleep(1000);

        driver.get("https://www.amazon.com");
        Thread.sleep(3000); //3sn bekle komutu(3000 milisaniye)

        driver.close();

    }
}

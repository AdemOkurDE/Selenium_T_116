package tests.day02_WebDriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        System.out.println("Ilk Sayfanin Size(boyutlar) : "+ driver.manage().window().getSize());
        System.out.println("Ilk Sayfanin Konumu : "+ driver.manage().window().getPosition());

        Thread.sleep(1000);
        driver.manage().window().maximize();
        System.out.println("maximize Sayfanin Size(boyutlar) : "+ driver.manage().window().getSize());
        System.out.println("maximize Sayfanin Konumu : "+ driver.manage().window().getPosition());

        Thread.sleep(1000);
        driver.manage().window().fullscreen();
        System.out.println("fullscreen Sayfanin Size(boyutlar) : "+ driver.manage().window().getSize());
        System.out.println("fullscreen Sayfanin Konumu : "+ driver.manage().window().getPosition());

        Thread.sleep(1000);
        driver.close();

    }
}

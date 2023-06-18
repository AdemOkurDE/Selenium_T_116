package tests.day02_tekrar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Amazon_Nutella_Click_ile {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");
        WebElement aranacakKelime= driver.findElement(By.id("twotabsearchtextbox"));
        aranacakKelime.sendKeys("Nutella");
        WebElement clickButton= driver.findElement(By.id("nav-search-submit-button"));
        clickButton.click();


        Thread.sleep(5000);
        driver.close();

    }
}

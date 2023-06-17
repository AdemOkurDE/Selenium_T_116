package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01 {

//    ....Exercise-1:...
//    Create a new class with main method
//    Set Path
//    Create a chrome driver
//    Maximize window
//    Open google home page https://www.google.com
//    On the same class, navigate to amazon home page https://www.amazon.com and navigate back to google
//    Wait about 4 sn
//    Navigate forward to amazon
//    Refresh page
//    Close/quit the browser
//    And Last step print "All is well" on console


    //  Create a new class with main method
    public static void main(String[] args) throws InterruptedException {

        //  Set Path
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");

        //  Create a chrome driver
        WebDriver driver = new ChromeDriver();

        //  Maximize window
        driver.manage().window().maximize();

        //  Open google home page https://www.google.com
        driver.get("https://www.google.com");
        Thread.sleep(750);

        driver.findElement(By.xpath("//*[@id='W0wltc']")).click();

        Thread.sleep(2000);
        /*
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        */

        //  On the same class, navigate to amazon home page https://www.amazon.com and navigate back to google
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@data-action-type='DISMISS']")).click();
       Thread.sleep(2000);
        driver.navigate().back();

        //  Wait about 4 sn
        Thread.sleep(4000);

        //  Navigate forward to amazon
        driver.navigate().forward();


        //    Refresh page
        driver.navigate().refresh();


        //    Close/quit the browser
        driver.close();

        //    And Last step print "All is well" on console
        System.out.println("All is well");



    }
}

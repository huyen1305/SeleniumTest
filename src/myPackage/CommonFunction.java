package myPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by thanh huyền on 23-Jun-17.
 */
public class CommonFunction {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        //Init driver
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "https://only-testing-blog.blogspot.in/2013/09/test.html";

        //open browser
        driver.get(baseUrl);

        //common functions
//        System.out.println("do some common funtions");
//        driver.findElement(By.id("fname")).click();
//        driver.findElement(By.name("fname")).sendKeys("Huyen");
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//*[@value='Bike']")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.cssSelector("[value='Car']")).click();
//        Thread.sleep(5000);

        //using webElement
//        WebElement element = driver.findElement(By.linkText("Newer Post"));
//        element.click();
//        Thread.sleep(5000);
//        driver.navigate().back();
//        Thread.sleep(5000);
//        Boolean isPresent = driver.findElements(By.className("home-link")).size() > 0;
//        if(isPresent) {
//            System.out.println("pass");
//        }
//        else {
//            System.out.println("fail");
//        }
//        Thread.sleep(5000);

        //drop down box
        // maximize the browser
        driver.manage().window().maximize();

        Select orderBy = new Select(driver.findElement(By.xpath("//div/select")));
        orderBy.selectByVisibleText("Saab");
        orderBy.selectByIndex(1);
        orderBy.selectByValue("Russia");


//        close browser
//        driver.close();
    }
}

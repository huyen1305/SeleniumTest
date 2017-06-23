package myPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by thanh huyền on 23-Jun-17.
 */
public class myClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        //declare driver
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://google.com.vn";
        String expectedTitle = "Google";
        String actualTile = "";

        // launch Firefox and open url
        driver.get(baseUrl);

        // get actual title
        actualTile = driver.getTitle();
        System.out.println(actualTile);

        //compare actual title and expected title
        if (actualTile.contentEquals(expectedTitle)) {
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }

        //close firefox
        driver.close();
    }
}

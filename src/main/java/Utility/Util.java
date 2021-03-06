package Utility;


import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static Webpages.BasePages.driver;

public class Util {

    public static String getText (WebElement element ){

        return element.getText();
    }
    public static boolean isDisplayed(WebElement element){

        return element.isDisplayed();
    }


    public static void sendKey( WebElement element, String string) {
        element.sendKeys(string);
    }

    public static void waitTime(long seconds){

        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public static void click(WebElement element){
        waitTime(20);
        element.isEnabled();
        element.click();
    }


}

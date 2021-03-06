package Webpages;


import Utility.Util;
import okio.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CloudPay extends BasePages{

    public CloudPay(){
        driverWait = new WebDriverWait(driver, 20);
        PageFactory.initElements(driver,this);
    }

    @FindBy( css = "#twotabsearchtextbox")
    WebElement searchBox;

    @FindBy ( xpath = "//a[@id='nav-logo-sprites']")
    WebElement browseContent;

    @FindBy( xpath = "//input[@value='Go']")
    WebElement clickSearch;

    @FindBy( xpath = "(//i[@class='a-icon a-icon-checkbox'])[12]")
    WebElement refineSearch;

    @FindBy ( xpath = "//span[contains(text(),'2020 Newest Dell Inspiron 15 3000 PC Laptop')]")
    WebElement dellNewest;

    @FindBy(css = "input#add-to-cart-button-ubb.a-button-input")
    WebElement addToCart;

    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2")
    WebElement monitorSelect;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    WebElement monitorAddToCart;

    public void goToHomePage(){

        driver.get(baseUrl);
    }

    public boolean isUserOnHomePage() {

        return Util.isDisplayed(browseContent);
    }
    public void searchBox(){
        Util.sendKey(searchBox,laptopType);
        Util.click(clickSearch);
    }

    public void searchBoxMonitor(){

        Util.sendKey(searchBox,monitorType);
        Util.click(clickSearch);
    }
    public void setRefineSearch(String choiceRam){

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        System.out.println(" is 4 gb dispalyed"+driver.findElement(By.linkText(choiceRam)).isDisplayed());
        driver.findElement(By.linkText(choiceRam)).isDisplayed();
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.linkText(choiceRam)).click();


    }

    public void selectDellNewest(String myDellLaptop) {

        System.out.println("link"+ driver.findElement(By.partialLinkText(myDellLaptop)).isDisplayed());
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,1000)");
        Util.waitTime(5);

        driver.findElement(By.partialLinkText(myDellLaptop)).click();

    }

    public String dellPrice(){

        return String.valueOf(driver.findElement(By.xpath("//span[contains(text(),'$189.99')]")).getText());

    }

    public void addToTheCart(){
        Util.waitTime(10);
        Util.click(addToCart);

    }

    public void setMonitorSelect(){
        Util.waitTime(2);
        Util.click(monitorSelect);
        Util.waitTime(2);
        Util.click(monitorAddToCart);
    }


}

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

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CloudPay extends BasePages{

    public CloudPay(){
        driverWait = new WebDriverWait(driver, 20);
        PageFactory.initElements(driver,this);
    }

    @FindBy( css = "#twotabsearchtextbox")
    WebElement searchBox;

    @FindBy ( css = "#nav-logo-sprites")
    WebElement browseContent;

//    @FindBy (xpath = "//input[@id='twotabsearchtextbox']")
//    WebElement getSearchBox;

    @FindBy( xpath = "//input[@value='Go']")
    WebElement clickSearch;

    @FindBy( xpath = "(//i[@class='a-icon a-icon-checkbox'])[12]")
    WebElement refineSearch;

    @FindBy ( xpath = "//span[contains(text(),'2020 Newest Dell Inspiron 15 3000 PC Laptop')]")
    WebElement dellNewest;

    @FindBy ( xpath =  "(//span[@class='a-price-whole'])[1]")
    WebElement laptopPrice;

    @FindBy(xpath = "//input[@id='add-to-cart-button-ubb']")
    WebElement addToCart;

    @FindBy(xpath = "//span[contains(text(),'KOORUI 24 Inch Computer Monitor')]")
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

        //span[contains(text(),'4 GB')]

        List<WebElement> refSearch = driver.findElements(By.cssSelector(".a-icon.a-icon-checkbox"));
        System.out.println(choiceRam);
        System.out.println("No of checkbox "+ Integer.toString(refSearch.size()));
        for ( WebElement searchOption:refSearch) {

           // System.out.println("No of checkbox______________ "+ Integer.toString(refSearch.size()));

         //     if(searchOption.equals(driver.findElement(By.linkText("4 GB"))))
         //   if(searchOption.equals(By.xpath("//span[contains(text(),'4 GB')]"))){
//            if(searchOption.equals(By.xpath("//li[@id='p_n_feature_thirty-three_browse-bin/23720420011']//i[@class='a-icon a-icon-checkbox']")))
//            {
//                searchOption.click();
//            }
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("4 GB")));
             driver.findElement(By.linkText("4 GB")).click();
        }

    }

    public void selectDellNewest(){

        String [] myDell = {    };

        List <WebElement> myDellLaptop = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

        System.out.println("No of items"+ Integer.toString(myDellLaptop.size()));


    }

    public String dellPrice(){
        String price = Util.getText(laptopPrice);
        return price;
    }

    public void addToTheCart(){
        Util.waitTime(2);
        Util.click(addToCart);

    }

    public void setMonitorSelect(){
        Util.waitTime(2);
        Util.click(monitorSelect);
        Util.waitTime(2);
        Util.click(monitorAddToCart);
    }


}

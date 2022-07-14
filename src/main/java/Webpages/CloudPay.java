package Webpages;


import Utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    WebElement clickGo;

    @FindBy( xpath = "(//i[@class='a-icon a-icon-checkbox'])[12]")
    WebElement refineSearch;

    public void goToHomePage(){
        driver.get(baseUrl);
    }

    public boolean isUserOnHomePage() {
        return Util.isDisplayed(browseContent);
    }
    public void searchBox(){
        Util.sendKey(searchBox,laptopType);
    }

    public void setClickGo(){
        Util.click(clickGo);
    }

    public void setRefineSearch(){
        Util.click(refineSearch);

    }


}

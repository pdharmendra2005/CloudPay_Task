package stepdef;


import Utility.Util;
import Webpages.CloudPay;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefinitions {

    CloudPay cloudPay;

    public StepDefinitions(){

        cloudPay = new CloudPay();
    }

    @Given("I am on Amazon search home page")
    public void i_am_on_amazon_search_home_page() {
        cloudPay.goToHomePage();
        cloudPay.isUserOnHomePage();
    }
    @When("I search {string} from Home page")
    public void i_search_from_home_page(String laptopChoice) {
        cloudPay.searchBox();

    }
    @And("I click {string} to refine my search")
    public void iClickToRefineMySearch(String choiceRam) {

        cloudPay.setRefineSearch(choiceRam);
    }
    @And("I pick {string} Laptop desired laptop")
    public void i_pick_desired_laptop(String myDellLaptop) {
        cloudPay.selectDellNewest(myDellLaptop);
    }

    @Then("I should see the price {string} for Dell Inspiron PC Laptop")
    public void iShouldSeeThePriceForDellInspironPCLaptop(String price) {
        Util.waitTime(4);
        Assert.assertEquals(cloudPay.dellPrice(),price);
    }

    @And("I add Dell Inspiron PC Laptop to the basket")
    public void iAddedDellInspironPCLaptopToTheBasket() {
        cloudPay.addToTheCart();

    }

    @And("I search monitor and add into basket")
    public void iSearchMonitorAndAddIntoBasket() {
        cloudPay.searchBoxMonitor();
        cloudPay.setMonitorSelect();
    }


}

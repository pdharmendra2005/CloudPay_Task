package stepdef;


import Webpages.CloudPay;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
    @When("I click {string} to refine my search")
    public void i_click_to_refine_my_search(String string) {
        cloudPay.setClickGo();

    }
    @When("I pick {string} desired laptop")
    public void i_pick_desired_laptop(String string) {
        cloudPay.setRefineSearch();
    }
//    @Then("I should the price ${int} for Dell Inspiron {int} {int} PC Laptop")
//    public void i_should_the_price_$_for_dell_inspiron_pc_laptop(Integer int1, Integer int2, Integer int3) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I added {int} Newest Dell Inspiron {int} {int} PC Laptop to the basket")
//    public void i_added_newest_dell_inspiron_pc_laptop_to_the_basket(Integer int1, Integer int2, Integer int3) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I search {string} and added into basket")
//    public void i_search_and_added_into_basket(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I should see the total price for both the items")
//    public void i_should_see_the_total_price_for_both_the_items() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }

}

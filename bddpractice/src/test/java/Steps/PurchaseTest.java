package Steps;

import com.company.Main;
import com.company.Math;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static org.junit.Assert.*;

public class PurchaseTest {
    @Given("^I have the money needed for purchase$")
    public void iHaveTheMoneyNeededForPurchase() {
        System.out.println("CODE COMPILED");
    }

    @And("^I am at the grocery store$")
    public void iAmAtTheGroceryStore() {
        System.out.println("You should have five apples and five bananas in your cart ");
        System.out.println("Your expected array [5 5]");
        Math testitem = new Math(5,5);
        System.out.println("Your actual array [" +testitem + "]");

    }

    @And("^The grocery store has apples and bananas$")
    public void theGroceryStoreHasApplesAndBananas() {
        System.out.println("You buy 3 bananas and 2 apples");
        System.out.println("Your expected total 170");
        int aprice = 2;
        int banprice = 3;
        int testVal = Main.calc(aprice, banprice);
        System.out.println("Your actual total: " + testVal);
        assertEquals(testVal,170);
    }

    @When("^I find apples and bananas in the fruit section$")
    public void iFindApplesAndBananasInTheFruitSection() {
        System.out.println("Passed");

    }

    @Then("^I place them in my cart and proceed to purchase them$")
    public void iPlaceThemInMyCartAndProceedToPurchaseThem() {
        int testVal = Main.calc(2,2);
        int testVal2 = Main.calc(3,1);
        int testVal3 = Main.calc(0,5);
        int testVal4 = Main.calc(0,0);
        System.out.println("Expected value 130, Your value " + testVal);
        System.out.println("Expected value 115, Your value " + testVal2);
        System.out.println("Expected value 200, Your value " + testVal3);
        System.out.println("Expected value 0, Your value " + testVal4);
        assertEquals(testVal,130);
        assertEquals(testVal2,115);
        assertEquals(testVal3,200);
        assertEquals(testVal4,0);
    }
}

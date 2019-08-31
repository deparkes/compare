package compare;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Stepdefs {
    private double threshold;
    private boolean actualAnswer;

    @Given("^I do not provide a threshold$")
    public void no_threshold() {
    }

    @When("^When I provide \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_ask_whether_it_s_Friday_yet(String string, String string2) {
        Compare compare = new Compare();
        actualAnswer = compare.compare(string, string2);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String string) {
        assertEquals(Boolean.parseBoolean(string), actualAnswer);
    }
}
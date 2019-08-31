package compare;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Stepdefs {
    private boolean actualAnswer;

    @Given("I want to make a comparison")
    public void no_threshold() {
    }

    @When("When I provide \"([^\"]*)\" and \"([^\"]*)\"")
    public void when_i_provide_words(String string, String string2) {
        Compare compare = new Compare();
        actualAnswer = compare.compare(string, string2);
    }

    @When("When I provide {string} and {string} with threshold {double}")
    public void when_i_provide_words_and_threshold(String string, String string2, Double threshold) {
        Compare compare = new Compare();
        actualAnswer = compare.compare(string, string2, threshold);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String string) {
        assertEquals(Boolean.parseBoolean(string), actualAnswer);
    }
}
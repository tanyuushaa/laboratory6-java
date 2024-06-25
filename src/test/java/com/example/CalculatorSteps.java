package com.example;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorSteps {
    private int a;
    private int b;
    private int result;
    private CalculatorSteps calculatorSteps;

    @Given("a calculator")
    public void a_calculator(){
        calculatorSteps = new CalculatorSteps();
    }
    @When("Add {int} and {int}")
    public void a_add_and(int a, int b){
        this.a = a;
        this.b = b;
        result = a+b;
    }
    @Then("the result {int}")
    public void the_result(int expectedSum){
        assertThat(result).isEqualTo(expectedSum);
    }
}

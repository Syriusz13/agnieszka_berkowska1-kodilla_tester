package fizzbuzz;

import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzSteps implements En {

    private int number;
    private String answer;

public FizzBuzzSteps() {
    Given("3", () -> {
        this.number = 3;
    });

    Given("5", () -> {
        this.number = 5;
    });

    Given("15", () -> {
        this.number = 15;
    });

    Given("4 is the number is not divisible by three or five", () -> {
        this.number = 4;
    });

    When("I ask, is this number divisible by three or five?", () -> {
        FizzBuzzChecker fizzBuzzChecker = new FizzBuzzChecker();
        this.answer = fizzBuzzChecker.checkTheNumber(this.number);
    });

    Then("I should be said {string}", (String string) -> {
        Assert.assertEquals(string, this.answer);
    });
    Given("Number is {int}", (Integer number) -> {
        this.number = number;
    });

}
}


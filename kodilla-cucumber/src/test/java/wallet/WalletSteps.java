package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {
    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private String answer;

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, 30);
        });
        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });

        When("I request $230", () -> {
            Cashier cashier = new Cashier(cashSlot);
            try {
                cashier.withdraw(wallet, 230);
            }catch (RuntimeException e){
                answer= "You don`t have enough money";
            }
        });

        Then("the balance of my wallet should be ${int}", (Integer balance) -> {
            Assert.assertEquals("Incorrect wallet balance", balance.intValue(), wallet.getBalance());
        });

        When("I request -$200", () -> {
            Cashier cashier = new Cashier(cashSlot);
            try {
                cashier.withdraw(wallet, -200);
            }catch (RuntimeException e){
<<<<<<< HEAD
                if (e.getMessage().equals("You can not request negative value")) {
                    answer= "You can not request negative value";
                }
=======
                answer= "You can not request negative value";
>>>>>>> effd7a4fa14d445d471d60d5c028afdb563ff58f
            }
        });

        Then("I should be informed that {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
<<<<<<< HEAD

        Given("my account has been credited with $100", () -> {
            wallet.deposit(100);
        });

        When("I check my balance", () -> {
        });

        Then("I should see that my balance is $100", () -> {
            Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
        });

        Given("my wallet has been credited with $100", () -> {
            wallet.deposit(100);
        });

        When("I withdraw $200", () -> {
            Cashier cashier = new Cashier(cashSlot);
            try {
                cashier.withdraw(wallet, 200);
            }catch (RuntimeException e){
                if (e.getMessage().equals("You have insufficient funds in your account")) {
                    answer= "I have insufficient funds in my account";
                }
            }
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Then("I should be told that {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
=======
>>>>>>> effd7a4fa14d445d471d60d5c028afdb563ff58f
    }
}

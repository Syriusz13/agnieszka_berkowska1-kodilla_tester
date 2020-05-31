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
                answer= "You can not request negative value";
            }
        });

        Then("I should be informed that {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }
}

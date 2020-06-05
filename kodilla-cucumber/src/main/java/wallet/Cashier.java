package wallet;

public class Cashier {
    private CashSlot cashSlot;

    public Cashier (CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (amount<0){
            throw new RuntimeException("You can not request negative value");
        }
        wallet.debit(amount);
        cashSlot.dispense(amount);
    }
}

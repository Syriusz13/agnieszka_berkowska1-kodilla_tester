package wallet;

public class Cashier {
    private CashSlot cashSlot;

    public Cashier (CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
<<<<<<< HEAD
        if (amount<0){
            throw new RuntimeException("You can not request negative value");
        }
=======
>>>>>>> effd7a4fa14d445d471d60d5c028afdb563ff58f
        wallet.debit(amount);
        cashSlot.dispense(amount);
    }
}

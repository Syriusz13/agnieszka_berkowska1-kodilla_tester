package wallet;

public class Wallet {

    private int balance = 0;

    public Wallet() {
    }

    public void deposit (int money){
    this.balance += money;
    }

    public int getBalance(){
        return balance;
    }

    public void debit(int money) {
<<<<<<< HEAD
        if (money>balance) {
            throw new RuntimeException("You have insufficient funds in your account");
        }
=======
>>>>>>> effd7a4fa14d445d471d60d5c028afdb563ff58f
        this.balance -= money;
    }
}

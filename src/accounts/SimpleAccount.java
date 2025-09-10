package accounts;

public class SimpleAccount extends Account{

    long balance; //Баланс счета

    public SimpleAccount() {
        super();
        this.balance = 0;
    }

    @Override
    public boolean add(long amount) {
        balance += amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (this.balance>= amount) {
            this.balance -= amount;
            return true;
        }
        return false;

    }
    @Override
    public long getBalance() {
        return balance;
    }
}

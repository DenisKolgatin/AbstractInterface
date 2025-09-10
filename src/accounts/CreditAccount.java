package accounts;

public class CreditAccount extends Account {
    long balance;
    long limit;

    public CreditAccount(long limit) {
        super();
        this.limit = -limit;
        this.balance = 0;
    }

    @Override
    public boolean add(long amount) {
        if (balance + amount <=0) {
            balance += amount;
            return true;
        }
        return false;

    }

    @Override
    public boolean pay(long amount) {
        if (this.limit <= balance - amount) {
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

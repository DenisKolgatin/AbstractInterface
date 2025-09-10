package accounts;

public abstract class Account {

    public Account() {}

    abstract boolean add(long amount);
    abstract boolean pay(long amount);
    boolean transfer(Account account, long amount) {
        if (pay(amount)) {
            if (account.add(amount)) {
                return true;
            }
            add(amount);
        }
        return false;
    };
    abstract public long getBalance();
}

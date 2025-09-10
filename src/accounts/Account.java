package accounts;

public abstract class Account {
    protected long balance;

    public Account() {

    }
    int numAcc; //Номер аккаунта

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

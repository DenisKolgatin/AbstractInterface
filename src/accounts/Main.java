package accounts;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static CreditAccount credit = new CreditAccount(400_000);
    static SimpleAccount debit = new SimpleAccount();
    public static void main(String[] args) {

        debit.add(200_000);
        credit.add(200_000);
        showInfo();

        debit.pay(100_000);
        credit.pay(100_000);
        showInfo();

        credit.transfer(debit, 70_000);

        showInfo();

    }

    static void showInfo() {
        System.out.println("На счету дебита: " + debit.getBalance());
        System.out.println("На счету кредита: " + credit.getBalance());
    }
}

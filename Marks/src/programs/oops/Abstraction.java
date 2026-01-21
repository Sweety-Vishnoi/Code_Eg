package programs.oops;

abstract class Bank_Account{
    protected String accountNumber;
    protected double balance;

    public Bank_Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    abstract void deposit(double amount);
    abstract void withdraw(double amount);

}
class Saving_Account extends Bank_Account {

    public Saving_Account(String accountNumber, double balance) {

        super(accountNumber, balance);
    }

    @Override
    void deposit(double amount) {
        amount= balance+amount;
        System.out.println(amount);
    }

    @Override
    void withdraw(double amount) {

        balance -= amount;

        System.out.println(balance);
    }
}
public class Abstraction {

    public static void main(String[] args) {

        Saving_Account Sv=new Saving_Account("23e2e2",2000);
        Sv.deposit(500);
        Sv.withdraw(200);
    }
}

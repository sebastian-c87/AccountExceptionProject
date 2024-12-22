import javax.security.auth.login.AccountException;

public class Account {
    private String owner;
    private int balance;
    private String accountNumber;

    public Account(String owner, int balance, String accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public void transfer(int amount) throws NotEnoughMoneyException {
        if (balance >= amount) {
            balance = balance - amount;}
        else {
            throw new NotEnoughMoneyException("Insufficient funds");}
        }
    }


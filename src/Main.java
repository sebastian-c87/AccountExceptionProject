import javax.security.auth.login.AccountException;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("Jan Nowak", 500, "123 456");

        try {
            account1.transfer(1000);}
        catch (NotEnoughMoneyException e) {
            System.out.println(e);
            e.printStackTrace();}
        catch (Exception e) {
        }
        finally {
            System.out.println("Finnaly: " + account1.getBalance());
        }
    }
}

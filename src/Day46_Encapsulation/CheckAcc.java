package Day46_Encapsulation;

public class CheckAcc {
    public static void main(String[] args) {

        CapitalOne account = new CapitalOne();

        account.setBalance(45000);
        System.out.println("Balance is: " + account.getBalance());

        account.setAccountNumber(2341126778L);
        System.out.println("Account number = " + account.getAccountNumber());

        account.setAccountHolder("Alinka Rudanets");
        System.out.println("Account holder = " + account.getAccountHolder());

        System.out.println("acc = " + account);
    }
}

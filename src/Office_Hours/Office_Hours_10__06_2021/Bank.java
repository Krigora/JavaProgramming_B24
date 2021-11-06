package Office_Hours.Office_Hours_10__06_2021;

public class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Ihor Rryvynskyy", 1000, 28475636L, "checking" );
        System.out.println(account);

        System.out.println(account.checkBalance());

        account.withdraw(500);
      System.out.println(account.checkBalance());
       System.out.println(account.withdraw(100));
        System.out.println(account.withdraw(1000));
        System.out.println(account.deposit(40000));
    }

}
